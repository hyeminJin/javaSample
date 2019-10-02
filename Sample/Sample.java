import java.util.Scanner;


class Sample{
	public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int kor, eng, math;
    

        System.out.print("input kor: ");
        kor = scanner.nextInt();

        System.out.print("input eng: ");
        eng = scanner.nextInt();
       
        System.out.print("input math: ");
        math = scanner.nextInt();


        int sum = kor + eng + math;
        System.out.println("합계 : "+sum);
        System.out.println("평균 : "+sum/3.0);
        
        int avg =(int)(sum/3.0 * 100 + 0.5);
        // ex)62.3333333 -> 6233.8333을 정수형으로
        // 6233 에서 100으로 나누면
        // 62.33
        System.out.println("평균2 : "+avg/100.0);
        System.out.printf("평균3 : %.3f\n",sum / 3.0);

 


    
    }
}
