package datastructures;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        //maximumProduct(new int[] {5, 3, 2, 5, 7, 0, 1});
        int[] t1 = {5, 3, 2, 5, 7, 0, 1};
        System.out.println(maximumProduct2(t1));

    }

    private static int maximumProduct2(int[] inputArray) {
        int length = inputArray.length;

        Arrays.sort(inputArray);

        int maxProduct = inputArray[length -2] * inputArray[length -1];
        int minProduct = inputArray[0] * inputArray[1];

        if(maxProduct > minProduct) {
            return maxProduct;
        } else {
            return minProduct;
        }
    }

    private static void maximumProduct(int[] input) {
        int maxValue = Integer.MIN_VALUE;
        for(int i=0; i < input.length; i++) {
            int product = input[i] * input[i + 1];
            if (product > maxValue) {
                maxValue = product;
            }
        }
        System.out.println(maxValue);
    }


}
