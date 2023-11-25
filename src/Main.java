import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class Main {

    static int minValue = 50;
    static int maxValue = 200;
    static int[] arr = new int[64];
    static Random rdm = new Random();


    static int getRandomValue() {

        int value = rdm.nextInt(minValue, maxValue);
        return value;
    }

    static void printArray(int [] arr) {
        int i = 0;
        while (i < arr.length) {
            System.out.println(i + "::" +arr[i]);
            i++;
        }
    }


    public static void main(String[] args) {
        int i = 0;
        while (i < arr.length) {
            arr[i]=getRandomValue();
            i++;
        }
        System.out.println("Arr");
        printArray(arr);



        for (int k = 0; k < arr.length; k++) {
            for (int j = 0; j < arr.length-k-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("After sorting Array");
        printArray(arr);
    }
}
