//package nareshit.lab;

/*
Write a java program which print the given three digit number is palindrome or not

Program is determined by the following rules:

if the given number is an three digit number, Example: if x = 232, print 1. if x = 345, print 0
if 1 then print a message that the number is pallindrome
if 0 then print a message that the number is not a pallindrome
if the given number is negative or zero, print -1
if -1 then print a message that the given number is -ve kindly provide the +ve number only
if the given number is not an three digit number, print -2
if -2 then print the message that this program can check the operation for the 3 number only.


 */


public class PalindromeCheckOfThreeDigit {
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);

        int temp=n;
        int sum=0;
        int r=n%10;
        sum+=r;
        n/=10;

        r=n%10;
        sum+=r;
        n/=10;

        sum+=n;
        n/=10;

        if(temp==sum)
            System.out.println(1);
        else
            System.out.println(0);



    }
}
