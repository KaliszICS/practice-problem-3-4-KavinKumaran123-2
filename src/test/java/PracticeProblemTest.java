import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;
public class PracticeProblemTest {
@Test
@DisplayName("")
void recamanTest6() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {int.class};
        Method method = testClass.getDeclaredMethod("recaman", cArg);
  // Enter code here
    assertArrayEquals(new int[]{}, ( int[])method.invoke(null, -5));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void recamanTest5() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {int.class};
        Method method = testClass.getDeclaredMethod("recaman", cArg);
  // Enter code here
    assertArrayEquals(new int[]{1, 3, 6, 2, 7, 13, 20, 12, 21, 11, 22, 10, 23, 9, 24, 8, 25, 43, 62, 42}, ( int[])method.invoke(null, 20));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void recamanTest4() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {int.class};
        Method method = testClass.getDeclaredMethod("recaman", cArg);
  // Enter code here
    assertArrayEquals(new int[]{1, 3, 6, 2, 7, 13, 20, 12, 21, 11, 22, 10, 23, 9, 24, 8, 25}, ( int[])method.invoke(null, 17));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void recamanTest3() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {int.class};
        Method method = testClass.getDeclaredMethod("recaman", cArg);
  // Enter code here
    assertArrayEquals(new int[]{}, ( int[])method.invoke(null, 0));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void recamanTest2() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {int.class};
        Method method = testClass.getDeclaredMethod("recaman", cArg);
  // Enter code here
    assertArrayEquals(new int[]{1}, ( int[])method.invoke(null, 1));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void recamanTest1() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {int.class};
        Method method = testClass.getDeclaredMethod("recaman", cArg);
  // Enter code here
    assertArrayEquals(new int[]{1, 3, 6, 2, 7, 13}, ( int[])method.invoke(null, 6));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
}
