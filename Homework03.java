package ua.levelup.savchenkodmitriy;

import java.util.Arrays;

/**
 * Домашнее задание №3 (новое)
 * @version 11
 * @author Дмитрий Савченко
 */

public class Homework03 {

    public static void main(String[] args) {
        System.out.println("Массив со значениями от 0 до 99");
        int [] array1=new int[100];
        array1 [0]=0;
        for (int i=0; i< array1.length; i++) {
            array1[i]=i;
        }
        System.out.println(Arrays.toString(array1));
        System.out.println("Массив со значениями от 100 до 1");
        int [] array2=new int[100];
        array2[0]=100;
        for (int i=1; i< array2.length; i++) {
            array2[i]=array2[i-1]-1;
        }
        System.out.println(Arrays.toString(array2));
        System.out.println("Зубчатый массив");
        int [][] jaggedArray=new int[5][];
        jaggedArray [0]=new int [1];
        jaggedArray [1]=new int [2];
        jaggedArray [2]=new int [3];
        jaggedArray [3]=new int [4];
        jaggedArray [4]=new int [5];
        int count=0;
        for (int i=0; i<5; i++) {
            int a= jaggedArray[i].length;
            for (int j=0; j<jaggedArray[i].length; j++) {
                jaggedArray[i][j]=j+1+count;
            }
            count+=a;
        }
        System.out.println(Arrays.deepToString(jaggedArray));
        System.out.println("Вариант создания зубчатого массива циклом и его заполнение");
        int countVar=0;
        int [][] jaggedArrayVar=new int [5][];
        for (int i=0; i<5; i++) {
            jaggedArrayVar[i]=new int[i+1];
            for (int j=0; j<jaggedArrayVar[i].length; j++) {
                jaggedArrayVar[i][j]=j+1+countVar;
            }
            countVar+=jaggedArrayVar[i].length;
        }
        System.out.println(Arrays.deepToString(jaggedArrayVar));
    }
}
