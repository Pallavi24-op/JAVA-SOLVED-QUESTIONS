package JAVA;

//Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
//
//
//diff21(19) → 2
//diff21(10) → 11
//diff21(21) → 0
import java.util.Scanner;

public class Diff21 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=scan.nextInt();
	if(num<=21) {
		System.out.println("diff21("+num+") = "+(21-num)); 
	}
	else {
		System.out.println((num-21)*2);
	}
	
	
}
}
