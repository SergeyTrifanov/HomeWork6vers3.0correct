package ru.skypro;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        //        example N1 and 2
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = (lastName+ " ")  + (firstName+ " ") + (middleName + " ");
        System.out.println("ФИО сотрудника — " + fullName);
        fullName = fullName.toUpperCase(Locale.ROOT);
        System.out.println("Данные ФИО сотрудника для заполнения отчета: " + fullName);

//        example N3
        String s1 = "Семён";
        String s2 = "Семёнович";
        String s3 = "Иванов";
        String s4 = (s3 + " ") + (s1 + " ") + (s2 + " ");
        s4 = s4.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + s4);
    }
}
