import java.util.Scanner;
public class gradeCalculator{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Students Grade Calculator");
        System.out.print("Enter your number of subjects:");
        int subjects=scanner.nextInt();
        int totalmarks=0;
        int[] marks=new int[subjects];
        System.out.println("Enter your marks accordingly");
        for (int i=0;i<subjects;i++){
            System.out.println("Enter mark of subject "+ i+1 +":");
            marks[i]=scanner.nextInt();
            totalmarks+=marks[i];
        }
        double avg=(double)totalmarks/(double)subjects;
        System.out.println("Your total mark is "+totalmarks);
        System.out.println("The grade order from highest to lowest is O , A+, A,B+, B, F(FAIL)");
        System.out.println("Your average percentage is "+avg);
        
        if (avg>=90){
            System.out.println("Your Grade is O");
        }
        else if (avg>=80 && avg<=89){
            System.out.println("Your Grade is A+");
        }
        else if (avg>=70 && avg<=79){
            System.out.println("Your Grade is A");

        }
        else if (avg>=60 && avg<=69){
            System.out.println("Your Grade is B+");

        }
        else if (avg>50 && avg<=59){
            System.out.println("Your Grade is B");
        }
        else{
            System.out.println("Your Grade is F(FAIL)");
        }
    }
}
