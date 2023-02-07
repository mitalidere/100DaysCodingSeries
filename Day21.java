//Write a program to identify if the number is Palindrome or not.

import java.util.Scanner;

public class Day21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num,r,res=0;
        while(temp!=0) {
            r=temp%10;
            temp=temp/10;
            res=res*10+r;
        }
        if(num==res) {
            System.out.print("Palindrome");
        }
        else {
            System.out.print("Not a Palindrome");
        }
    }
}
