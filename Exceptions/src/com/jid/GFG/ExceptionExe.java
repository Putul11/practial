package com.jid.GFG;

public class ExceptionExe {
	static int divideByZero(int a, int b) {
		int x = a/b;
		return x;
	}
	
	static int computeDivision(int a, int b) {
		int res = 0;
		try {
			res = divideByZero(a,b);
		}
		
		catch(NumberFormatException e) {
			System.out.println("NumberFormatException is occured");
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str = null;
		//System.out.println(str.length());
		
		int a = 1;
		int b = 0;
		
		try {
			int y = computeDivision(a,b);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}

	}

}
