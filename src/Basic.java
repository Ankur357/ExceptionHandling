public class Basic  {
    public static void main(String[] args) {
        try{
            int a = 10;
            System.out.println(a / 0);
        }
        catch(Exception obj)
        {
            System.out.println("Error"+ obj);
        }
    }
}
