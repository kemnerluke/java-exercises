package exercises;

import java.util.Scanner;

public class MPG {
	
	
	public void calculateMilesPerGallon(){
		Scanner scanner = new Scanner(System.in);

		System.out.println("how many miles have you driven");
		double milesDriven= scanner.nextDouble();
		System.out.println("how many gallons of gas was consumed in gallons");
		double gallons=scanner.nextDouble();
		
		double mpg=milesDriven/gallons;
		
		System.out.println("MPG: " + mpg);
		
	}

	public static void main(String[] args) {
MPG obj = new MPG();
obj.calculateMilesPerGallon();
	}

}
