package com.json;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import io.restassured.path.json.JsonPath;

public class Jsonxample {

	public static void main(String args[]) throws IOException {
		JsonPath ss = new JsonPath(new String(Files.readAllBytes(Paths
				.get("C:\\Users\\DANISH\\git\\R_Automation_Framework\\src\\test\\resources\\TestData\\Login.json"))));
		String name1 = ss.getString("lastName");
		System.out.println(name1);
		
		String name2 = ss.getString("firstName");
		System.out.println(name2);
	}
}
