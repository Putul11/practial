package com.jid.DurgaSoft;

public class NestedTryCatch {
	public static void main(String[] args) {
		
		try {
			System.out.println("Outer try block");
			try {
				System.out.println("Inner try block");
				System.out.println(10/0);
				
			}
			/*catch(NullPointerException e) {
				System.out.println("Inner catch block");
			}*/
			catch(ArithmeticException e) {
				System.out.println("Inner catch block");
			}
			
			}
		catch(Exception e) {
			System.out.println("Outer catch block");
			
		}
		finally {
			System.out.println("Outer Finally Block");
		}
	}

}
