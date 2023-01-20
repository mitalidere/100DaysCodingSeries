//Write a program to identify of the number is positive or negative.

import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        if(input>0) {
            System.out.print("Positive number");
        }
        else if(input<0) {
            System.out.print("Negative number");
        }
        else {
            System.out.print("Neither positive nor negative");
        }
    }
}
