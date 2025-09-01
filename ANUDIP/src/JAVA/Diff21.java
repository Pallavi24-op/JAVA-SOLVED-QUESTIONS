package JAVA;

import java.util.Scanner;

public class Diff21 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=scan.nextInt();
	if(num<=21) {
		System.out.println(21-num); 
	}
	else {
		System.out.println((num-21)*2);
	}
	
	
}
}
