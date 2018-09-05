package com.codegym;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();

        if (isPalindrome(num)) {
            System.out.println("is Palindrome");
        } else {
            System.out.println("not is Palindrome");
        }

    }

    public static int reverse(int number) {
        int nSoDao = 0, nRem;

        while (number != 0) {
            // Lấy chữ số cuối của số nguyên sử dụng toán tử chia lấy dư (Modulus)
            nRem = number % 10;

            // Nhân số đảo với 10 và cộng với chữ số cuối
            nSoDao = (nSoDao * 10) + nRem;

            // Xóa chữ số cuối bằng cách sử dụng toán tử chia lấy phần nguyên (Division)
            number = number / 10;
        }

        return nSoDao;
    }

    public static boolean isPalindrome(int number) {
        if (number == reverse(number))
            return true;
        else
            return false;
    }
}
