import java.util.Scanner;

public class LargeNumber {

    public static void main (String[] args) {
        Scanner num = new Scanner(System.in);
        int num1,num2,num3;

        System.out.print("enter 1st number:");
        num1= num.nextInt();

        System.out.print("enter 2nd number:");
        num2= num.nextInt();

        System.out.print("enter 3rd number:");
        num3= num.nextInt();

        if (num1 > num2  &&  num1 > num3 )
            System.out.println(num1 + " is large number ");
        else if (num2 > num1  &&  num2 > num3)
            System.out.println(num2 + " is large number ");
        else
            System.out.println(num3 + " is large number ");


    }
}
