//Write a program to identify if the number is Strong number or not.

import java.util.Scanner;

public class Day15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        int rem,add=0;
        if(num==0) {
            System.out.println("Not a strong number");
        }
        else {
            while (num != 0) {
                rem = num % 10;
                int fact = 1;
                for (int i = 1; i <= rem; i++) {
                    fact *= i;
                }
                add += fact;
                num /= 10;
            }
            if (temp == add) {
                System.out.println("Strong number");
            } else {
                System.out.println("Not a strong number");
            }
        }
    }
}
