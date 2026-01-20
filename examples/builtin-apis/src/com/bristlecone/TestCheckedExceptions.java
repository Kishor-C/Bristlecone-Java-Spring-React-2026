package com.bristlecone;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestCheckedExceptions {
	public static void main(String[] args) {
		try {
			readFile("aaa.txt");
		} catch (FileNotFoundException e) {
			System.err.println("File is not found");
		} catch (IOException e) {
			System.err.println("Read is failed");
		}
		System.out.println("main ends..");
	}
	public static void readFile(String file) throws FileNotFoundException, IOException {
		FileInputStream fis;
		fis = new FileInputStream(file);
		int ch = fis.read();
		System.out.println(ch);
		System.out.println("read file done...");
		fis.close();
	}
}
