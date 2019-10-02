import java.util.Scanner;

class Calc2{
	public static void main(String[] args) throws Exception{
		final double A = 0.5;
		double base;
		double height;
		Scanner scan = new Scanner(System.in);

		System.out.print("밑변 : ");
		base = scan.nextDouble();
		System.out.print("높이 : ");
		height = scan.nextDouble();
		
		System.out.println("삼각형의 넓이는 : "+A * base *height);
	}
}

