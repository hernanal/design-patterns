package designPatterns.decoratorPattern.java_io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

import designPatterns.decoratorPattern.decorator.LowerCaseInputStream;

public class InputTest {

	public static void main(String[] args) {

		int c;
		
		try {
			InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("src/test.txt")));
			
			while ((c = in.read()) >= 0) {
				System.out.print((char) c);
			}
			
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
