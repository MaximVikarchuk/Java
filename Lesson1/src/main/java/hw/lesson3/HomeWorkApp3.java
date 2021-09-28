package hw.lesson3;

import java.util.Arrays;

public class HomeWorkApp3 {

    public static void main(String[] args) {

        System.out.println("Exercise 1");

        int[] arr = {0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0};
        invertArray("Before:\t", arr);
        change(arr);
        invertArray("After :\t", arr);

        System.out.println("---------------");
        System.out.println("Exercise 2");


        int[] arr1 = new int[100];
        emptyMass(arr1);
        invertArray("massive :\t", arr1);
        System.out.println("---------------");
        System.out.println("Exercise 3");

        int[] arr2 = {1, 2, 4, 6, 88, 9, 32, 5, 7, 8};
        invertArray("Berore:\t", arr2);
        massiVe(arr2);
        invertArray("After :\t", arr2);
        System.out.println("---------------");
        System.out.println("Exercise 4");


        int side = 10;
        int[][] arr4 = new int[side][side];
        diagonal(arr4);
        invertArray1("Diagonals", arr4);
        System.out.println("---------------");
        System.out.println("Exercise 5");

        int[] returnArray = returnArr(8, 88);
        invertArray("Array from method:\t", returnArray);
        System.out.println("---------------");
        System.out.println("Exercise 6");

        invertArray("max and min element in array:\t", arr2);
        System.out.println("min: " + findMin(arr2));
        System.out.println("max: " + findMax(arr2));
        System.out.println("---------------");
        System.out.println("Exercise 7");


        System.out.print("is the array " + Arrays.toString(arr2) + " balanced? → ");
        System.out.println(checkBalance(arr2));
        int[] arr3 = {1, 1, 1, 1, 4};
        System.out.print("is the array " + Arrays.toString(arr3) + " balanced? → ");
        System.out.println(checkBalance(arr3));


    }



//    1.   Создать массив, состоящий из элементов 0 и 1, например, [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//    С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void invertArray(String msg, int[] inputArray) {
        System.out.print(msg);
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(" | " + inputArray[i] + " | ");
        }
        System.out.println();
    }

    public static void change(int[] array) {
        for (int i = 0; i < array.length; i++)
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }

    }

//        2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

    public static void emptyMass(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++)
            inputArray[i] = i + 1;
    }
//        3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

    public static void massiVe(int[] array1){
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < 6)
                array1[i] *= 2;
        }

    }

//        4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//            и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
//            Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

    public static void diagonal(int[][] arrey2) {
        for (int i = 0; i < arrey2.length; i++) {
            arrey2[i][i] = 1;
            arrey2[i][arrey2.length - 1 - i] = 1;
        }

    }
    public static void invertArray1(String msg, int[][] inputArray) {
        System.out.println(msg);
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[i].length; j++) {
                System.out.print("|" + inputArray[i][j] + "|");
            }
            System.out.println();
        }

    }


//        5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;

    public static int[] returnArr(int len, int initValue) {
        int[] tempArray = new int[len];
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = initValue;
        }
        return tempArray;
    }


//        6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
     public static int findMin(int[] array2) {
         int min = array2[0];
         for (int i = 0; i < array2.length; i++) {
             if (array2[i] < min) {
                 min = array2[i];
             }
         }
         return min;
     }
    public static int findMax(int[] array2) {
        int max = array2[0];
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] > max) {
                max = array2[i];
            }
        }
        return max;
    }


//        7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
//              метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
//    **Примеры:
//        checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
//        checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
//        checkBalance([1, 1, 1, 1, 1, 1, 4 ||| 10]) → true, т.е. 1 + 1 + 1 + 1 + 1 + 1 + 4 = 10
//        checkBalance([1, 1, 10]) → false
//        граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.

    public static boolean checkBalance(int[] array) {
        int right = 0, left = 0;
        for (int i = 0; i < array.length - 1; i++) {
            left += array[i];
            for (int j = i + 1; j < array.length; j++)
                right += array[j];
            if (left == right) return true;
            right = 0;
        }
        return false;
    }


}