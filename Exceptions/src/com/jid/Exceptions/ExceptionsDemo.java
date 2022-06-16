package com.jid.Exceptions;

import java.io.FileNotFoundException;

import java.io.IOException;

public class ExceptionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\nInside main");
		try {
			share();
			System.out.println("After invoking share...");
		} catch (FileNotFoundException e) {
			
			//e.printStackTrace();
			System.out.println("\nmain: filenotfoundexception...");
		}
		finally {
			System.out.println("\nInside main family...");
		}
		System.out.println("\nEnd of main");

	}

	private static void share() throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("\nInside Share...");
		try {
			
			String response = HttpConnect.send(1, "hello", "http://www.goodsnips.com");
			System.out.println("After invoking send.....");
			APIParser.parseSendResponseCode(response, "hello", "http://www.goodsnips.com");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Share: filenotfoundexception ...");
			throw e;
		}
		catch (IOException e) {
			System.out.println("Connecting to a different server...");
			//e.printStackTrace();
		} 
		catch(APIFormatChangeException e) {
			//e.printStackTrace();
			e.getCause().printStackTrace();
		}
		finally {
			System.out.println("Inside share's family...");
		}
		System.out.println("\nEnd of Share...");
		
	}

}
