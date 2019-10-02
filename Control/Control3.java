import java.util.Scanner;

class Control3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("학생수를 입력하세요: ");
        
        int count = sc.nextInt();
        
        int [] maths = new int[count];
        int [] engs = new int[count];
        
        int mathsum = 0;
        int engsum = 0;
        double engavg = 0;
        double mathavg = 0;

        for(int i=0; i < count; i++){
            System.out.print("수학점수를 입력하세요: ");
            maths[i] = sc.nextInt();
        }

        for(int i=0; i < count; i++){
            System.out.print("영어점수를 입력하세요: ");
            engs[i] = sc.nextInt();
        }
    
        for(int i=0; i < count; i++){
        
            
            mathsum += maths[i];
        }
    
        for(int i=0; i < count; i++){
            
            engsum += engs[i];
        }

        mathavg = mathsum/(double)count;
        engavg = engsum/(double)count;
       
        System.out.println("반 전체 평균입니다");
        System.out.printf("수학 : %.2f\n",mathavg);
        System.out.printf("영어 : %.2f\n",engavg);
    }
}

