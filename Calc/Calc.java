import java.util.Scanner;

class Calc{
	private static final double PI = 3.141592;

	public static void main(String[] args) throws Exception{
		// Declaration
		// 변수 선언
		final double PI = 3.141592; 
		int radius;
		Scanner scanner = new Scanner(System.in);
	
		System.out.print("input radius: ");
		radius = scanner.nextInt();

		System.out.println("Area of square : " + (radius * radius));
		System.out.println("Area of circle : " + PI*(radius * radius));
		System.out.println("Area of circle : " + Calc.PI * (radius * radius));
	}
}
