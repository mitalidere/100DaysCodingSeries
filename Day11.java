//Write a program to find Fibonacci series up to n.

import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1,c;
        if(n==1) {
            System.out.println(a);
        }
        else if(n>=2){
            System.out.print(a+","+b);
            for(int i=2;i<n;i++) {
                c = a + b;
                System.out.print("," + c);
                a = b;
                b = c;
            }
        }
    }
}