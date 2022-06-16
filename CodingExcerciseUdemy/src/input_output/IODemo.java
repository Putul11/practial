package input_output;

//import java.io.BufferedInputStream;
//import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo {
	static String inFileStr = "logo.jpg";
	static String outFileStr = "logo_out.jpg";

	public static void fileCopyNoBuffer() {
		System.out.println("\nInside fileCopyNoBuffer...");

		long startTime, elapsedTime;

		File fileIn = new File(inFileStr);
		System.out.println("File size is" + fileIn.length() + "bytes");

		try (FileInputStream in = new FileInputStream(inFileStr);
				FileOutputStream out = new FileOutputStream(outFileStr)) {
			startTime = System.nanoTime();
			int byteRead;
			
			while((byteRead = in.read()) != -1) {
				
				out.write(byteRead);
				
			}
			elapsedTime = System.nanoTime() - startTime;
			System.out.println("Elapsed time is" + (elapsedTime / 1000000.0) + "msec");

		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		

	}
	/*public static void fileCopyWithBufferedAndArray() {
		System.out.println("\nInside fileCopyWithBufferedAndArray...");
		
		long startTime, elapsedTime;
		startTime = System.nanoTime();
		
		try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(inFileStr));
				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(outFileStr)) {
			
			byte[] byteBuf = new byte[4000];
			
			int numBytesRead;
			
			while((numBytesRead = in.read(byteBuf)) != -1) {
				
				out.write(byteBuf, 0, numBytesRead);
				
			    }
		  }
		 catch(IOException e) { 
			  e.printStackTrace();}
		 elapsedTime = System.nanoTime() - startTime;
		 System.out.println("FileCopyWithBufferAndArray: " + (elapsedTime/1000000.0) +"msec");
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fileCopyNoBuffer();
		
		

	}

}
