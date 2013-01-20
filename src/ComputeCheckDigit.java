/*
 * Name: Pinjing Zhao
 * Andrew ID: pinjingz
 * Homework #2
 * Course number: 08-600
 * Date: Sep 10,2012
 */

public class ComputeCheckDigit{
    public static void main(String[] args){
        String str=args[0];
        System.out.println(str);
        int a=str.charAt(0) - '0';
        int b=str.charAt(1) - '0';
        int c=str.charAt(2) - '0';
        int d=str.charAt(3) - '0';
        int e=str.charAt(4) - '0';
        int f=str.charAt(5) - '0';
        int g=str.charAt(6) - '0';
        int h=str.charAt(7) - '0';
        int i=str.charAt(8) - '0';
        int j=str.charAt(9) - '0';
        int k=str.charAt(10) - '0';
        int x=(10- (a*3 + b + c*3 + d + e *3 + f + g *3 + h + i*3 + j + k*3) % 10) % 10;
        System.out.println(x);
    }
}