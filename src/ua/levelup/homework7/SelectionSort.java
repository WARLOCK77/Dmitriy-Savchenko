package ua.levelup.homework7;

public class SelectionSort {
     static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int p = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    p = j;
                    min = array[j];
                }
            }
            array[p] = array[i];
            array[i] = min;
        }
         return array;
     }
}

