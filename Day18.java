//Write a program to Add two fractions.

import java.util.Scanner;

public class Day18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x1= sc.nextInt();
        int y1= sc.nextInt();
        int x2= sc.nextInt();
        int y2= sc.nextInt();

        int num=1,den=1;

        if(y1!=y2) {
            num=y1*x2+y2*x1;
            den=y1*y2;
        }
        else {
            num=x1+x2;
            den=y1;
        }

        if(num%den==0) {
            num=num/den;
            den=1;
        }
        else if(den%num==0) {
            num=1;
            den=den/num;
        }
        else {
            for(int i=2;i<10;i++) {
                if(num%i==0 && den%i==0) {
                    num=num/i;
                    den=den/i;
                    i=1;
                }
            }
        }
        System.out.println(num+"/"+den);
    }
}
