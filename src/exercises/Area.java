package exercises;

import java.util.Scanner;

public class Area {
	
	
	public void calculateArea() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("what is the width of your rectangle");
		double width =scanner.nextDouble();
		System.out.println("what is the height of your rectangle");
		double height=scanner.nextDouble();
		 double area =width * height;
		 
		 System.out.println("AREA: "+area);
		
	}

	public static void main(String[] args) {
		Area area= new Area();
		area.calculateArea();
		
	}

}
