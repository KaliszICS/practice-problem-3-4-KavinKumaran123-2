
class Notes {
	public static void main(String[] args) {
		//Merge Sort

		Random rndm = new Random();
		int[] randomArray = new int[10000000];
		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i] = rndm.nextInt(100);
		}

		// System.out.println(Arrays.toString(randomArray));

		//merge sort

		mergeSort(randomArray);

		System.out.println("\n\n\n\n");
		System.out.println(Arrays.toString(randomArray));
	}

	public static void mergeSort(int[] arr) {

		//base case

		if (arr.length < 2) {//arr.length == 0 or == 1
			return;
		}

		// recursive step

		//split the array into 2

		int mid = arr.length / 2;

		int[] left = new int[mid];
		int[] right = new int[arr.length - mid];

		//copy the elements

		//left array
		for (int i = 0; i < left.length; i++) {
			left[i] = arr[i];
		}

		//right array
		for (int i = 0; i < right.length; i++) {
			right[i] = arr[i+mid];
		}

		mergeSort(left);
		mergeSort(right);

		merge(left, right, arr);
		
	}

	public static void merge(int[] left, int[] right, int[] og) {

		int leftIndex = 0;
		int rightIndex = 0;
		int ogIndex = 0;
		
		while(leftIndex < left.length && rightIndex < right.length) {
			if (left[leftIndex] < right[rightIndex]) {
				og[ogIndex] = left[leftIndex++]; //line of code runs before ++
				// leftIndex++;
			}
			else {
				og[ogIndex] = right[rightIndex++];
				// rightIndex++;
			}
			ogIndex++;
		}

		while(leftIndex < left.length) {
			og[ogIndex++] = left[leftIndex++]; //line of code runs before ++
		}

		while(rightIndex < right.length) {
			og[ogIndex++] = right[rightIndex++]; //line of code runs before ++
		}	
	}

























	
	// public static void mergeSort(int[] arr) {

	// 	mergeSortHelper(arr);
		
	// }

	// public static void mergeSortHelper(int arr[]) {

	// 	//BASE CASE

	// 	if (arr.length < 2) {
	// 		return;
	// 	}

	// 	//recursion call - creating our smaller arrays

	// 	int middle = arr.length / 2;
	// 	int[] leftArray = new int[middle];
	// 	int[] rightArray = new int[arr.length - middle];

	// 	//copy elements for leftArray
	// 	for (int i = 0; i < middle; i++) {
	// 		leftArray[i] = arr[i];
	// 	}
	// 	//copy elements for rightArray - there needs to be an offset for middle
	// 	for (int i = middle; i < arr.length; i++) {
	// 		rightArray[i-middle] = arr[i];
	// 	}
	// 	//alternative
	// 	// for (int i = 0; i < arr.length - middle; i++) {
	// 	// 	leftArray[i] = arr[i+middle];
	// 	// }

	// 	mergeSortHelper(leftArray);
	// 	mergeSortHelper(rightArray);
		
	// 	//Sort - merge them

	// 	merge(leftArray, rightArray, arr);
	// }

	// public static void merge(int[] left, int[] right, int[] og) {

	// 	//compare values from the arrays (at the beginning)

	// 	int leftIndex = 0;
	// 	int rightIndex = 0;
	// 	int ogIndex = 0;

	// 	//comparing as long as both arrays have values left to compare.
	// 	while (leftIndex < left.length && rightIndex < right.length) {
	// 		if (left[leftIndex] < right[rightIndex]) {
	// 			og[ogIndex] = left[leftIndex];
	// 			leftIndex++;
	// 		}
	// 		else {
	// 			og[ogIndex] = right[rightIndex];
	// 			rightIndex++;
	// 		}
	// 		ogIndex++;
	// 	} 

	// 	//fill the original with the left overs from left
	// 	while (leftIndex < left.length) {
	// 		og[ogIndex] = left[leftIndex];
	// 		leftIndex++;
	// 		ogIndex++;
	// 	}

	// 	//fill the original with the left overs from right
	// 	while (rightIndex < right.length) {
	// 		og[ogIndex] = right[rightIndex];
	// 		rightIndex++;
	// 		ogIndex++;
	// 	}
	// }



















	

	// public static void mergeSort(int[] arr) {

	// 	mergeSortHelper(arr, arr.length);
	// }

	// public static void mergeSortHelper(int[] arr, int size) {

	// 	//base case

	// 	if (size < 2) {
	// 		return;
	// 	}

	// 	//created our arrays
	// 	int middle = size / 2;
	// 	int[] leftArray = new int[middle];
	// 	int[] rightArray = new int[size - middle];

	// 	// fill the arrays, copy from arr
	// 	//copies left side elements to leftArray
	// 	for (int i = 0; i < middle; i++) {
	// 		leftArray[i] = arr[i];
	// 	}

	// 	//copies right side elements to rightArray
	// 	for (int i = middle; i < size; i++) {
	// 		rightArray[i - middle] = arr[i];
	// 	}

	// 	mergeSortHelper(leftArray, middle);
	// 	mergeSortHelper(rightArray, size-middle);

	// 	//MERGE
	// 	merge(leftArray, rightArray, arr, middle, size-middle);
	// } 

	// //another helper function

	// public static void merge(int[] left, int[] right, int[] og, int leftSize, int rightSize) {

	// 	int leftIndex = 0;
	// 	int rightIndex = 0;
	// 	int ogIndex = 0;

	// 	while (leftIndex < leftSize && rightIndex < rightSize) {
	// 		if (left[leftIndex] < right[rightIndex]) {
	// 			og[ogIndex] = left[leftIndex];
	// 			ogIndex++;
	// 			leftIndex++;
	// 		}
	// 		else {
	// 			og[ogIndex] = right[rightIndex];
	// 			ogIndex++;
	// 			rightIndex++;
	// 		}
	// 	}
	// 	//Empty whichever array still has elements to go through
		
	// 	while (leftIndex < leftSize) {
	// 		og[ogIndex] = left[leftIndex];
	// 		ogIndex++;
	// 		leftIndex++;
	// 	}

	// 	while (rightIndex < rightSize) {
	// 		og[ogIndex] = right[rightIndex];
	// 		ogIndex++;
	// 		rightIndex++;
	// 	}
		
	// }
}
