package ru.mirea.lab8;

import java.util.Scanner;

public class PalindromeChecker {
    public static boolean isPalindrome(String word) {
        int length = word.length();

        // Базовый случай: если длина слова меньше или равна 1, то оно является палиндромом
        if (length <= 1) {
            return true;
        }

        // Сравниваем первую и последнюю буквы
        if (word.charAt(0) != word.charAt(length - 1)) {
            return false; // Если не совпадают, слово не является палиндромом
        } else {
            // Рекурсивно вызываем функцию для сравнения внутренней части слова
            return isPalindrome(word.substring(1, length - 1));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String word = scanner.nextLine();

        if (isPalindrome(word)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
