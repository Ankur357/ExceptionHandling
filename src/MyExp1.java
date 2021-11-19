import java.util.InputMismatchException;
import java.util.Scanner;

public class MyExp1 {
    public static void main(String[] args) {
        int a,b;
        int arr[] = {12,123,32,43,231};
        int index;
        try(Scanner s = new Scanner(System.in))
        {
            a=s.nextInt();
            b=s.nextInt();
            index=s.nextInt();
            System.out.println(a/b);
            System.out.println(arr[index]);
        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException | InputMismatchException obj)
        {
            System.out.println(obj.getClass().getName());
        }
    }
}
