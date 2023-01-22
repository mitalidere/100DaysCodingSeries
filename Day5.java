//Write a program to identify if the number is even or odd.

import java.util.Scanner;

public class Day5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        if(input%2==0) {
            System.out.print("Even");
        }
        else {
            System.out.print("Odd");
        }
    }
}
