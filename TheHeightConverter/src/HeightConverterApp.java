import java.util.Scanner;
public class HeightConverterApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter height in inches ");
		double inches = scan.nextDouble();
		 double height = HeightConverter.convertFeet(inches);
		System.out.printf("%.2f",height);
        scan.close();
	}

}
