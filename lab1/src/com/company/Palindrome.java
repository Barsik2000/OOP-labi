package com.company;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
        for (int i = 0; i < args.length; i++) {
           String s = args[i];
           System.out.println(isPalindrome(s));
        }
        */
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        System.out.println(isPalindrome(in.nextLine()));    //Происходит ввод строки для обработки и вывод результата
    }

    public static String reverseString(String str){

        StringBuilder reverse = new StringBuilder(); // создание модифицируемой строки

    for (int i = str.length() - 1; i >= 0; i--){
        reverse.append(str.charAt(i));
    }
        return reverse.toString();                     //возвращение полученной строки
    }


    public static boolean isPalindrome (String s){
        return s.equals(reverseString(s));
    }

}
