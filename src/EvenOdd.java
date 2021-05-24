import java.util.Scanner;

public class EvenOdd {

    public static void main (String[] args) {


            Scanner num = new Scanner(System.in);
            int num1;

            System.out.print("enter 1st number:");
            num1= num.nextInt();

            if (num1 % 2 == 0)
                System.out.println(num1  +" is even number");
            else
                System.out.println( num1 + " is odd number");


    }


}
