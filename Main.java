import java.util.*;// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    public static void main(String[] args) {

// TASK1
        int arrayNumber[]={3,2,9,5,10};
        System.out.println("The difference between the largest and smallest values in an array is: "+MinMaxDifference(arrayNumber));


        //TASK2
        int num[] = {20, 43, 25, 10, 34, 15};
        Arrays.sort(num);
        System.out.println("The minimum element is : " + num[0] + " The second minimum element is : " + num[1]);

        //TASK3
        System.out.println("The result: "+calculatorFun(5,2));

    }
    public static double calculatorFun ( double x, double y) {

        double result = 0;
        double finalResult = 0;
        result = (4 * y) / 5 - x;
        finalResult = Math.pow(x, 2) + Math.pow(result, 2);

        return finalResult;
    }
    public static int MinMaxDifference(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Array must not be null or empty");
        }
        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }

        return max - min;
    }
}
