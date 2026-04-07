import java.util.HashSet;

public class PracticeProblem {

    public static void main(String args[]) {

    }

    public static int[] recaman(int n) {
        if (n <= 0)
            return new int[0];

        int[] result = new int[n];
        HashSet<Integer> seen = new HashSet<>();


        buildRecaman(result, seen, 0, 0);

        return result;
    }

    private static void buildRecaman(int[] arr, HashSet<Integer> seen, int index, int current) {
        if (index == arr.length)
            return;

        if (index == 0) {
            current = 0;
            seen.add(0);
        }

        int step = index + 1;

        int next = current - step;

        if (next > 0 && !seen.contains(next)) {
            current = next;
        } else {
            current = current + step;
        }

        arr[index] = current;
        seen.add(current);

        buildRecaman(arr, seen, index + 1, current);
    }
}