package Fil.company;


import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        System.out.println("Первая программа (домашнее задание №1)"); // этой строкой обозначил начало новой программы
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер дня недели: ");
        int day = in.nextInt();
        if (day == 1) {
            System.out.println("Понедельник");
        } else if (day == 2) {
            System.out.println("Вторник");
        } else if (day == 3) {
            System.out.println("Среда");
        } else if (day == 4) {
            System.out.println("Четверг");
        } else if (day == 5) {
            System.out.println("Пятница");
        } else if (day == 6) {
            System.out.println("Суббота");
        } else if (day == 7) {
            System.out.println("Воскресенье");
        } else {
            System.out.println("Дня с таким номером не существует");
        }

        System.out.println("Вторая программа (домашнее задание №1)"); // этой строкой обозначил начало новой программы
        System.out.print("Веедите ваше первое число задающее диапазон значений: ");
        int number1 = in.nextInt();
        System.out.print("Веедите ваше второе число задающее диапазон значений: ");
        int number2 = in.nextInt();
        if (number2 < number1) { //на случай если пользователь ввел первое значение меньше второго
            int numder3 = number2;
            number2 = number1;
            number1 = numder3;
        }
        System.out.println("Ваш первый диапазо от минус бесконечности до " + number1 + " включительно");
        System.out.println("Ваш второй диапазо от " + number1 + " не включительно до " + number2 + " включительно");
        System.out.println("Ваш трентий диапазо от " + number2 + " не включительно до  + бесконечности");
        System.out.print("Веедите ваше проверяемое число число: ");
        int number3 = in.nextInt();
        if (number3 <= number1) {
            System.out.println("Проверяемое вами число пренадлежит первому отрезку");
        } else if (number3 > number1 && number3 <= number2) {
            System.out.println("Проверяемое вами число пренадлежит второму отрезку");
        } else {
            System.out.println("Проверяемое вами число пренадлежит третьему отрезку");
        }

        System.out.println("Третья программа (домашнее задание №1)"); // этой строкой обозначил начало новой программы
        System.out.print("Веедите ваше первое число: ");
        double num1 = in.nextDouble();
        System.out.print("Веедите ваше второе число: ");
        double num2 = in.nextDouble();
        System.out.print("Веедите ваше третье число: ");
        double num3 = in.nextDouble();
        double sredne = (num1 + num2 + num3) / 3;
        System.out.println("среднее арифметическое: " + sredne);

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("максимальное число: " + num1);
            }
        } else {
            if (num2 > num3) {
                System.out.println("максимальное число: " + num2);
            } else {
                System.out.println("максимальное число: " + num3);
            }
        }

        if (num1 < num2) {
            if (num1 < num3) {
                System.out.println("минимальное число: " + num1);
            } else {
                if (num2 < num3) {
                    System.out.println("минимальное число: " + num2);
                } else {
                    System.out.println("минимальное число: " + num3);
                }
            }

            System.out.println("Четвертая программа (домашнее задание №1)"); // этой строкой обозначил начало новой программы
            System.out.print("Веедите ваше число: ");
            double chislo0 = in.nextDouble();
            double chislo1 = chislo0 - (chislo0 / 10);
            double chislo2 = chislo0 + (chislo0 / 10);
            System.out.print(" Отрезок задан!");
            System.out.print("Веедите ваше число: ");
            double chislo3 = in.nextDouble();
            if (chislo3 == chislo0) {
                System.out.println("Верно!");
            } else if (chislo3 < chislo1 | chislo3 > chislo2) {
                System.out.println("Далеко");
            } else if (chislo3 >= chislo1 & chislo3 < chislo2) {
                System.out.println("Близко");
            } else if (chislo3 > chislo1 & chislo3 <= chislo2) {
                System.out.println("Близко");
            }
        }
        in.close();
    }
}

