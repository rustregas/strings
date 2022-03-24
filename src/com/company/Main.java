package com.company;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
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

}
