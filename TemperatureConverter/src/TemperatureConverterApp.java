import java.util.Scanner;

public class TemperatureConverterApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter temperature in fahrenheit");
		TemperatureConverter convertFahrenheitToCelsius = new TemperatureConverter();
		double fahrenheit = scan.nextDouble();
		System.out.printf("%.2f",convertFahrenheitToCelsius.convertFahrenheitToCelsius(fahrenheit));
		
		scan.close();
		
	}

}
