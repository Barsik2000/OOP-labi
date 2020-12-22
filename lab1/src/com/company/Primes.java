package com.company;

public class Primes {

    public static void main (String[] args){

        for (int i = 2; i <= 100; i++){         // цикл, подбирающий числа от 2 до 100
            if (isPrime(i)) System.out.println(i);   //если true, то число печатается
        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n;i++){             //цикл, проверяющий аргументы на наличие делителей без остатка
            if (n % i == 0) return false;       // если остаток есть, то число не подходит
        }
        return true;                            //если таких чисел нет, то возвращается true
    }

}

