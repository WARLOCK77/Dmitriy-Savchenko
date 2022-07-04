package ua.levelup.savchenkodmitriy;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
//
public class Homework04 {
    public static void main(String[] args) throws IOException {
        System.out.println("Выберите задание:\n" +
                "1. Вывести таблицу умножения (вид 1)\n" +
                "2. Вывести таблицу умножения (вид 2)\n" +
                "3. Вывести символ заданого пользователем слова\n" +
                "4. Напечатать заданое слово с последней буквы\n" +
                "5. Заменить в предложении все буквы 'е' на 'и'\n" +
                "6. Переставить в обратном порядке буквы в слове\n" +
                "Нажмите '0' для выхода");
        boolean waitingForInput = true;
        while (waitingForInput) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    MultiplicationTableFirstView();
                    break;
                case "2":
                    MultiplicationTableSecondView();
                    break;
                case "3":
                    WordOperations1();
                    break;
                case "4":
                    WordOperations2();
                    break;
                case "5":
                    Sentence ();
                    break;
                case "6":
                    ReversAreaWord ();
                    break;
                case "0":
                    waitingForInput = false;
                    System.out.println("Выход");
                    break;
                default:
                    System.out.println("Введите корректное значение");
            }
        }
    }

    static void MultiplicationTableFirstView() {
        System.out.println("1. Вывести таблицу умножения (вид 1)");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(j + "x" + i + "=" + j * i + " ");
            }
            System.out.println();
        }
        System.out.println("Нажмите от 1 до 6 для выполнения следующей задачи или 0 для выхода");
    }

    static void MultiplicationTableSecondView() {
        System.out.println("2. Вывести таблицу умножения (вид 2)");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i + "x" + j + "=" + j * i + " ");
            }
            System.out.println();
        }
        System.out.println("Нажмите от 1 до 6 для выполнения следующей задачи или 0 для выхода");
    }

    static void WordOperations1() {
        System.out.println("3. Вывести символ заданого пользователем слова");
        Scanner inputWord = new Scanner(System.in);
        System.out.println("Введите слово");
        boolean loop=true;
        while (loop){
            if (inputWord.hasNextInt()) {
                System.out.println("Введите слово, а не цифры.\n" +
                        "Перезапустите задачу нажав '3'");
                break;
            } else {
                String word = inputWord.nextLine();
                char[] result = word.toCharArray();
                System.out.println("Введите порядковый номер символа в слове");
                int numberSymbolWord = inputWord.nextInt();
                System.out.println("Ваш символ:" + result[numberSymbolWord - 1]);
                loop=false;
            }
        }
        System.out.println("Нажмите от 1 до 6 для выполнения следующей задачи или 0 для выхода");
    }
    static void WordOperations2() {
        System.out.println("4. Напечатать заданое слово с последней буквы");
        Scanner inputWord = new Scanner(System.in);
        System.out.println("Введите слово");
        boolean loop=true;
        while (loop) {
            if (inputWord.hasNextInt()) {
                System.out.println("Введите слово, а не цифры.\n" +
                        "Перезапустите задачу нажав '4'");
                break;
            } else {
                String word = inputWord.nextLine();
                char[] result = word.toCharArray();
                System.out.println("Введенное слово, напечатаное с последней буквы");
                for (int i=1; i<= result.length; i++) {
                    System.out.print(result[result.length-i]);
                }
                loop = false;
                System.out.println();
            }
        }
        System.out.println("Нажмите от 1 до 6 для выполнения следующей задачи или 0 для выхода");
    }
    static void Sentence () throws IOException {
        System.out.println("5. Заменить в предложении все буквы 'е' на 'и'");
        InputStreamReader inputStreamReader=new InputStreamReader(System.in);
        int read;
        System.out.println("Введите предложение");
        while ((read=inputStreamReader.read())!=-1) {
            char ch=(char) read;
            if (ch=='е') {
                ch='и';
            }
            if (ch=='\n') {
                break;
            }
            System.out.print(ch);
        }
        System.out.println();
        System.out.println("Нажмите от 1 до 6 для выполнения следующей задачи или 0 для выхода");
    }
    static void ReversAreaWord () {
        System.out.println("6. Переставить в обратном порядке буквы в слове");
        Scanner inputWord = new Scanner(System.in);
        System.out.println("Введите слово из 15 букв");
        boolean loop=true;
        while (loop) {
            if (inputWord.hasNextInt()) {
                System.out.println("Введите слово, а не цифры.\n" +
                        "Перезапустите задачу нажав '6'");
                break;
            }
            String word = inputWord.nextLine();
            char[] result = word.toCharArray();
            if (result.length!=15) {
                System.out.println("Введите слово именно из 15 символов\n" +
                        "Перезапустите задачу нажав '6'");
                break;
            }
            System.out.println("Введите номер буквы начала интервала, k:");
            int k=inputWord.nextInt();
            System.out.println("Введите номер буквы конца интервала, s:");
            int s=inputWord.nextInt();
            for (int i=0; i<k; i++) {
                System.out.print(result[i]);
            }
            int step=0;
            for (int i=k; i<=s-2; i++) {
                System.out.print(result[s-2-step]);
                step++;
            }
            for (int i=s-1; i< result.length;i++) {
                System.out.print(result[i]);
            }
            loop = false;
            System.out.println();
        }
        System.out.println("Нажмите от 1 до 6 для выполнения следующей задачи или 0 для выхода");
    }
}