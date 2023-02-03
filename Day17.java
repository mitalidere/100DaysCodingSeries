//Write a program to find the Factors of a number.

import java.util.Scanner;

public class Day17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++) {
            if(num%i==0) {
                System.out.print(i);
                if(num!=i) {
                    System.out.print(",");
                }
            }
        }
    }
}