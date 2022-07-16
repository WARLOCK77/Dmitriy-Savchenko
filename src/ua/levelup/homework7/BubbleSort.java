package ua.levelup.homework7;

public class BubbleSort extends SelectionSort{
     static int[] bubbleSort(int[] array) {// Сортировка Bubble Sort
        int i, t;
        boolean step = true;
        while (step) {
            step = false;
            for (i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    t = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = t;
                    step = true;
                }
            }
        }
        return array;
    }
}
