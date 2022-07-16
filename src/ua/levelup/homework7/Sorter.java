package ua.levelup.homework7;

import java.util.Arrays;
import java.util.Scanner;

public class Sorter extends BubbleSort implements ISort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[6];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите " + (i + 1) + " значение элемента массива");
            array[i] = in.nextInt();
        }
        System.out.println("Введенные элементы массива до сортировки");
        System.out.println(Arrays.toString(array));
        sort(array);

    }


    public static void sort(int []array){
        ISort.sort(array);
    }
}
