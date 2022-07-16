package ua.levelup.homework7;

import java.util.Arrays;
import java.util.Scanner;

import static ua.levelup.homework7.BubbleSort.bubbleSort;
import static ua.levelup.homework7.SelectionSort.selectionSort;

public interface ISort {
    static void sort(int[]array){
        System.out.println("1.Сортировка способом BubbleSort\n"+
                "2.Сортировка способом Selection Sort\n"+
                "0.Выход с приложения");
        boolean loop=true;
        while (loop) {
            Scanner scanner=new Scanner(System.in);
            String in= scanner.nextLine();
            switch (in) {
                case "1":
                    System.out.println("1.BubbleSort\n" + Arrays.toString(bubbleSort(array)));
                    break;
                case "2":
                    System.out.println("2.Selection Sort\n" + Arrays.toString(selectionSort(array)));
                    break;
                case "0":
                    loop=false;
                    System.out.println("0.Выход");
                    break;
                default:
                    System.out.println("Введите корректное значение");
            }
        }
    }

}
