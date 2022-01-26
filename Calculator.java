package CalculatorArea;

import java.util.Scanner;

class formulae{
	double add(int a,int b) {
		System.out.println("Sum of num is - " + (a+b));
		return 0;
	}
	
	double substraction(int a, int b) {
		System.out.println("Diff is - " + (a-b));
		return 0;
	}
	
	double multiply(int a, int b) {
		System.out.println("Multiplicatin of num is - " +(a*b));
		return 0;
	}
	double division(int a , int b) {
		System.out.println("Division of num is - " + (a/b));
		return 0 ;
	}
	int modulus(int a,int b) {
		System.out.println("modulus of num is - " + (a%b));
		return 0;
	}
}

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num of matematical operation u want to perform - ");
		System.out.println("1. Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division \n 5.Modulus \n" );
		int operationNo = sc.nextInt();
		if(operationNo > 5) {
			System.out.println("No operation found");
			System.exit(0);
		}
		System.out.println("Enter 1st no -");
        	int a = sc.nextInt();
        	System.out.println("Enter 2nd no -");
        	int b = sc.nextInt();
   formulae f = new formulae();
        switch(operationNo)
        {
            case 1:f.add(a, b);
                   break;
            case 2:f.substraction(a, b);
                   break;
            case 3:f.multiply(a, b);
                   break;
            case 4:f.division(a, b);
                   break;
            case 5:f.modulus(a, b);
                   break;
            default: System.out.println("You entered invalid operation no");
        }
		
	}
}
