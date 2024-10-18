package com.java.serilizationexample;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class DeserializeExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		User user;

		FileInputStream fileIn = new FileInputStream("C:\\Users\\Bhadresh\\Desktop\\git_file.txt");
		ObjectInputStream objIn= new ObjectInputStream(fileIn);

		user = (User)objIn.readObject();
		System.out.println(user);

		objIn.close();
	}

}
