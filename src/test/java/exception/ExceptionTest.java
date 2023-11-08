package exception;


import java.util.Scanner;

public class ExceptionTest   {


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String name=scan.nextLine();

        try
        {
            System.out.printf("1");
            int sum = 9 / 0;
            System.out.printf("2");
        }
        catch(ArithmeticException e)
        {
            System.out.printf("3");
        }
        catch(Exception e)
        {
            System.out.printf("4");
        }
        finally
        {
            System.out.printf("5");
        }
    }
}
