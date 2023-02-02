//Write a program to identify if the number is Perfect number or not.

import java.util.Scanner;

public class Day16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int sum=0;
        for(int i=1;i<num;i++) {
            if(num%i==0) {
                sum+=i;
            }
        }
        if(num==sum) {
            System.out.print("Perfect Number");
        }
        else {
            System.out.print("Not a perfect number");
        }
    }
}
