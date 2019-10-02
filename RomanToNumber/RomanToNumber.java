import java.util.Scanner;
class RomanToNumber{
	public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.print("input roman number: ");
        String roman = scanner.next();
        
        if ( roman.equalsIgnoreCase("I")){
            System.out.println("number 1");
        } else if (roman.equalsIgnoreCase("II")){
            System.out.println("number 2");
        } else if (roman.equalsIgnoreCase("III")){
            System.out.println("number 3");
        } else if (roman.equalsIgnoreCase("IV")){
            System.out.println("number 4");
        } else if (roman.equalsIgnoreCase("V")){
            System.out.println("number 5");
        } else if (roman.equalsIgnoreCase("VI")){
            System.out.println("number 6");
        } else if (roman.equalsIgnoreCase("VII")){
            System.out.println("number 7");
        } else if (roman.equalsIgnoreCase("VIII")){
            System.out.println("number 8");
        } else if (roman.equalsIgnoreCase("IX")){
            System.out.println("number 9");
        } else if (roman.equalsIgnoreCase("X")){
            System.out.println("number 10");
        } else {
            System.out.println("invaild roman");
        } 
    }
}

