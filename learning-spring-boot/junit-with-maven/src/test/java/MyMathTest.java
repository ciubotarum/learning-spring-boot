import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {
    private MyMath math = new MyMath();
    @Test
    void calculateSum_TreeMemberArray() {
        // Absence of failure is success
        // Test Condition or Assert
        //System.out.println(result);
        assertEquals(6, math.calculateSum(new int[]{1, 2, 3}));

    }

    // {} => 0
//    @Test
//    void test1() {
//        // Absence of failure is success
//        // Test Condition or Assert
//        int[] numbers = {};
//        int result = math.calculateSum(numbers);
//        //System.out.println(result);
//        int expectedResult = 0;
//        assertEquals(expectedResult, result);
//
//    }
    @Test
    void calculateSum_ZeroLengthArray() {
        assertEquals(0, math.calculateSum(new int[]{}));

    }

}