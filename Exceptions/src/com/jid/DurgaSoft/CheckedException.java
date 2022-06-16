package com.jid.DurgaSoft;
import java.io.*;

public class CheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintWriter pw;
		try {
			pw = new PrintWriter("abc.txt");
			pw.println("Hello");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		

		
	}

}
