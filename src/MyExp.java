import java.util.Scanner;

public class MyExp {
    public static void main(String[] args) {

        try(Scanner s = new Scanner(System.in))
        {
         int i= Integer.parseInt(s.next());
        }
        catch(Exception e)
        {
              e.printStackTrace();
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            System.out.println(e);
        }
        System.out.println("end");
    }
}
