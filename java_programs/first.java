package assignment;

import java.util.Scanner;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int A,B,C;
		System.out.println("Enter First Number");
		A=scan.nextInt();
		
		System.out.println("Enter Second Number");
		B=scan.nextInt();
		
		System.out.println("Enter Third number");
		C=scan.nextInt();
		
		if (A>B && A>C) {
			System.out.println("Number A is Greatest");
		}
		else if (B>A && B>C) {
			System.out.println("Number B is Greatest");
		}else if (C>A && C>B) {
			System.out.println("Number C is Greatest");
		}
		else {
			System.out.println("All Number Are same");
		}

	}

}
