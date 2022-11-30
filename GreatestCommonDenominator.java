package com.ahmi.javaloops;

import java.util.Scanner;

public class GreatestCommonDenominator {

	public static void main(String[] args) {
		
		findGDC(0,0);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number 1: ");
		int n1 = scanner.nextInt();
		
		System.out.println("Enter number 2: ");
		int n2 = scanner.nextInt();
		
		
		System.out.println("The Greatest Common Denominator is: " + findGDC(n1, n2));
		
		scanner.close();
		}
	
		private static int findGDC(int n1, int n2) {
			if(n2 == 0) {
				return n1;
			}
			
			return findGDC(n2, n1%n2);
		
	}

		
	
	}


