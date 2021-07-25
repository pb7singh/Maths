package com.math.cal.Calc;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Sum:"+Calculator.doAddition(3, 4));
		System.out.println("Sum:"+Calculator.doSubstraction(3, 4));
		System.out.println("Sum:"+Calculator.doMultiplication(3, 4));


	}
	
	public static int doAddition(int x, int y) {
		return x+y;
	}
	public static int doSubstraction(int x, int y) {
		return x-y;
	}
	public static int doMultiplication(int x, int y) {
		return x*y;

}
	
	

}
