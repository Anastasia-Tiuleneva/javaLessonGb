import java.util.Arrays;
import java.util.Random;

public class HomeWorkApp3 {
    public static void main(String[] args) {
        newArrMy(10);
        lenHundred();
        arrTwo();
        arrBox(5);
        myMeth(10,5);
        myMm();

    }

    public static void newArrMy(int b) {
        int arr[] = new int[b];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(2);
        }
        System.out.println(Arrays.toString(arr)); // для проверик
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr)); // для проверки
    }

    public static void lenHundred() {
        int arr[] = new int[100];
        int value = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = +value;
            value = value + 1;
        }
        System.out.println(Arrays.toString(arr)); // для проверик
    }

    public static void arrTwo() {
        int arr[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr)); // для проверик
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr)); // для проверик
    }

    public static void arrBox(int b) {
        int[][] arr = new int[b][b];
        //int arrVn = arr[i];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i][j] = 1;
                }
                System.out.print(" " + arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void myMeth(int len, int initialValue) {
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
            System.out.print(" " + arr[i] + " ");
        }
    }

    public static void myMm() {
        int arr[] = {4, 3, 7, 3, 9, 4, 6, 0, -1};
        int maxA = arr[0];
        int minB = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxA) {
                maxA = arr[i];
            }
            if (arr[i] < minB) {
                minB = arr[i];
            }
        }
        System.out.println("Максимальное число" + " " + maxA);
        System.out.println("Минимальное число" + " " + minB);
    }

}










