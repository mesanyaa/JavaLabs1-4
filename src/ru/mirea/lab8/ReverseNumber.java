package ru.mirea.lab8;

import java.util.Scanner;

public class ReverseNumber {
    public static int reverse(int n) {
        if (n < 10) {
            return n;
        }

        int lastDigit = n % 10;
        int remainingDigits = n / 10;

        int reversedNumber = reverse(remainingDigits);

        int numberOfDigits = (int) Math.log10(remainingDigits) + 1;
        int multiplier = (int) Math.pow(10, numberOfDigits);

        return lastDigit * multiplier + reversedNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        int reversedNumber = reverse(number);
        System.out.println("Число с цифрами в противоположном порядке: " + reversedNumber);
    }
}