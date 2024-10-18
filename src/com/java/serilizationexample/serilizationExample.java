package com.java.serilizationexample;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class serilizationExample {

	public static void main(String[] args) throws IOException {

		User user = new User("shivanii",20,"Java fullstack Dev");

		FileOutputStream fileOut= new FileOutputStream("C:\\Users\\Bhadresh\\Desktop\\git_file.txt");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(user);
		out.close();
		System.out.println("Completed");
	}

}
