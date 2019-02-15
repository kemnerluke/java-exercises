package org.launchcode.java.demos.java4python;

import java.util.Scanner;

/**
 * From "Java for Python Programmers"
 */
public class Hello {
	
	
	public void name() {
		Scanner scanner = new Scanner(System.in);
    	System.out.println("Please Enter your full name");
		String name =scanner.nextLine();
		System.out.println("Hello "+name);
	}
	

	
    public static void main(String[] args) {
    	Hello hello = new Hello();
    	hello.name();
    }
}
