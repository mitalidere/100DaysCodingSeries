//Write a program to reverse a given number.

import java.util.Scanner;

public class Day14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int rem=0;
        int rev_no=0;
        while(num!=0) {
            rem=num%10;
            num/=10;
            rev_no=rev_no*10+rem;
        }
        System.out.print(rev_no);
    }
}