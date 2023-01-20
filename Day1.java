//Write a program to identify if the character is a vowel or consonant.

import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        if((c>=97 && c<=122) || (c>=65 && c<=90)) {
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
                System.out.println("Vowel");
            }
            else {
                System.out.println("Consonant");
            }
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
