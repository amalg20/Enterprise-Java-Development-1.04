class Main {
    public static void main(String[] args) {

        /* Write a Java method that returns the difference between the largest and smallest values in an array of integers. The length of the array must be at least 1 */

        int arrayNumber[]={3,2,9,5,10};
        System.out.println(" The difference between the largest and the smallest is :" + bigDiff(arrayNumber));

        /* Write a Java method that finds the smallest and second smallest elements of a given array and prints them to the console */

        int arr[] = {20, 43, 25, 10, 34, 15};
        print2Smallest(arr);

        /* Write a Java method that calculates the result of the following mathematical expression, where x and y are two variables that have been pre-set in your code: */

        System.out.println("The result: "+calculatorFun(5,2));

    }
    public static int bigDiff(int[] nums){
        int min = nums[0];
        int max = nums[0];

        for (int i = 1 ; i < nums.length; i++)
        {
            if (nums[i] < min)
            {
                min = nums[i];
            }
            if (nums[i] > max)
            {
                max = nums[i];
            }
        }

        return max - min;
    }

    public static void print2Smallest(int arr[]){
        int first, second, arr_size = arr.length;


        if (arr_size < 2) {
            System.out.println(" Invalid Input ");
            return;
        }

        first = second = Integer.MAX_VALUE;
        for (int i = 0; i < arr_size; i++) {

            if (arr[i] < first) {
                second = first;
                first = arr[i];
            }


            else if (arr[i] < second && arr[i] != first)
                second = arr[i];
        }
        if (second == Integer.MAX_VALUE)
            System.out.println("There is no second"
                    + "smallest element");
        else
            System.out.println("The smallest element is "
                    + first
                    + " and second Smallest"
                    + " element is " + second);
    }

    public static double calculatorFun ( double x, double y) {

        double result = 0;
        double finalResult = 0;
        result = (4 * y) / 5 - x;
        finalResult = Math.pow(x, 2) + Math.pow(result, 2);

        return finalResult;
    }

}




