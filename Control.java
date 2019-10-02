import java.util.Scanner;

public class Control{
    public static void main(String[] args){
        /*문제1
         *정수를 입력 받아서 
         *양의 정수 라면, 양수라 출력하고
         *음의 정수 라면, 음수라 출력 하시오.
         */
        /*문제2
         *성별을 입력 받아.
         *M이면 남성이라 출력하고
         *F이면 여성이라 출력하시오
         */
        int number;
        String gender;
       
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        number = sc.nextInt();
        
        if(number > 0){
            System.out.println("양수");
        }else if(number < 0){
            System.out.println("음수");
        }
        
        System.out.print("성별을 입력하세요: ");
        sc.nextLine();
        gender = sc.nextLine();

        if(gender.equalsIgnoreCase("M")){
            System.out.println("남성");
        }else if(gender.equalsIgnoreCase("F")){
            System.out.println("여성");
        }
            

    }
}
