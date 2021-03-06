import java.util.InputMismatchException;
import java.util.Scanner;

class NegativeValueException extends Exception{
    NegativeValueException(String s){
        super(s);
    }
}
class OutOfRangeException extends Exception{
    OutOfRangeException(String s){
        super(s);
    }
}

public class ValueExp {
    String stu1,stu2;
    ValueExp(String stu1, String stu2){
        this.stu1=stu1;
        this.stu2=stu2;
    }
    public void average(int[] marks1,int[] marks2, int sub) throws NegativeValueException,OutOfRangeException{
        int sum1=0,sum2=0;
        double av1,av2;
        for(int i=0; i<sub; i++){
            if(marks1[i]<0 | marks2[i]<0){
                throw new NegativeValueException("Negative values not allowed");
            }
            else if(marks1[i]>100 | marks2[i]>100){
                throw new OutOfRangeException("Value should not be greater than 100");
            }
            else {
                sum1 += marks1[i];
                sum2 += marks2[i];
            }
        }
        av1 = (double) sum1/3;
        av2 = (double) sum2/3;
        System.out.println("The Average of marks of student 1 is "+av1);
        System.out.println("The Average of marks of student 2 is "+av2);
    }
}

class Main1{
    public static void main(String[] args) {
        System.out.println("Enter the name of both students");
        Scanner sc = new Scanner(System.in);
        ValueExp obj = new ValueExp(sc.nextLine(), sc.nextLine());
        System.out.println("Enter the number of subjects");
        int sub = sc.nextInt();
        int[] mark1 = new int[sub];
        int[] mark2 = new int[sub];
        try{
            System.out.println("Enter the marks of first student");
            for (int i=0; i<sub; i++){
                mark1[i]= sc.nextInt();
            }
            System.out.println("Enter the marks of second student");
            for (int i=0; i<sub; i++){
                mark2[i]= sc.nextInt();
            }
            obj.average(mark1,mark2,sub);
        }
        catch (NumberFormatException | InputMismatchException | NegativeValueException | OutOfRangeException e){
            System.out.println(e);
        }
    }
}