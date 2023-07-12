import java.util.*;
public class HalveNumberApp {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a Number");
	double num = scan.nextDouble();
	System.out.printf("%.2f",HalveNumber.halveTheNumber(num));
	scan.close()
}
}
