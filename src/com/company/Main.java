package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanon";
        String fullName = firstName + " " + lastName + " " + middleName;
        System.out.println("ФИО сотурдника - " + fullName);
    }

    public static void task2() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanon";
        String fullName = firstName + " " + lastName + " " + middleName;
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);
    }

    public static void task3() {
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = firstName + " " + lastName + " " + middleName;
        fullName = fullName.replace("ё","е");
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);
    }

    public static void task5() {
        String fullName = "Ivanov Ivan Ivanovich";
        String firstName  = fullName.substring(fullName.indexOf(" "),fullName.lastIndexOf(" ")).trim();
        String middleName = fullName.substring(fullName.lastIndexOf(" ")).trim();
        String lastName  = fullName.substring(0, fullName.indexOf(" ")).trim();
        System.out.printf("Данные ФИО сотрудника для заполнения отчета — %s %s %s%n", lastName, firstName, middleName);
    }

    public static void task6() {
        String fullName = "ivanov ivan ivanovich";
        String[] names = fullName.split(" ");

        for (int i = 0; i < names.length; i++) {
            names[i] = initCap(names[i]);
        }

        String lastName = names[0];
        String firstName = names[1];
        String middleName = names[2];
        System.out.printf("Верное написание Ф. И. О. сотрудника с заглавных букв — %s %s %s%n", lastName, firstName, middleName);
    }

    public static String initCap(String args) {
        char [] arr = args.toCharArray();
        arr[0] = Character.toUpperCase(arr[0]);
        return String.copyValueOf(arr);
    }

    public static void task7() {
        String firstStr = "135";
        String secondStr = "246";

        StringBuilder sb = new StringBuilder();

        char [] firstStrArr = firstStr.toCharArray();
        char [] secondStrArr = secondStr.toCharArray();

        for (int i = 0; i < firstStrArr.length; i++) {
            sb.append(firstStrArr[i]).append(secondStrArr[i]);
        }
        System.out.println(sb);
    }

    public static void task8() {
        String str = "aabccdddddefgghiijjkk";
        char[] strCharArr = str.toCharArray();

        for (int i = 0; i < strCharArr.length-1; i++) {
            if(strCharArr[i]!=strCharArr[i+1]){
                continue;
            } else if (i == 0){
                System.out.print(strCharArr[i]);
            } else if (strCharArr[i-1] != strCharArr[i]) {
                System.out.print(strCharArr[i]);
            }
        }
    }
}
