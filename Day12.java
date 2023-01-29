//Write a program to find sum of digits of a number.

import java.util.Scanner;

public class Day12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        long sum=0;
        while(num!=0) {
            sum+=num%10;
            num/=10;
        }
        System.out.print(sum);
    }
}