
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.print("Enter an integer number");
            int n1 = input.nextInt();
            System.out.print("Enter an integer number");
            int n2 = input.nextInt();
            int sum = n1 + n2;
            System.out.println("The result of sum " + n1 + " and "  +n2 + " is: " + sum);

        }
        catch (InputMismatchException e) {
            //System.out.println(e.getMessage());
            System.out.println("number!!");
        }

    }
}
