package com.jid.Exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class HttpConnect {
	
	/**
	 * *
	 * *
	 * @param destination
	 * @param data
	 * @param partner
	 * @return
	 * @throws IOException
	 */
	public static String send(int destination, String data, String partner) throws  IOException {
		System.out.println("\nInside Send...");
		String response = "success";
		
		if(destination < 0 || destination > 1) {
			throw new IllegalArgumentException();
		}
		if(destination == 0) {
			throw new FileNotFoundException();
		}
		else if(destination == 1) {
			//throw new IOException();
			response ="<result><code>success</code></success>";
		}
		System.out.println("\nEnd of send...");
		return response;
	}

}
