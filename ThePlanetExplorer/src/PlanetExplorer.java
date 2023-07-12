import java.util.*;
public class PlanetExplorer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter radius of the planet");
		double radius = scan.nextDouble();
		double surfaceArea =Planet.calculateArea(radius);
		System.out.println(surfaceArea);
		scan.close();
		
	}}
