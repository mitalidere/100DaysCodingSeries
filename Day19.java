//Write a program to identify if the number is Armstrong number or not.

import java.util.Scanner;

public class Day19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int temp=num,count=0,r,result=0;
        while(temp!=0) {
            temp=temp/10;
            count++;
        }
        temp=num;
        while(temp!=0) {
            r=temp%10;
            result=result+(int)(Math.pow(r,count));
            temp=temp/10;
        }
        if(num==result) {
            System.out.print("Armstrong number");
        }
        else {
            System.out.print("Not an Armstrong number");
        }
    }
}
