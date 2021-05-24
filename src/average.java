import java.util.Scanner;

public class average {
    public static void main (String[] args) {

        Scanner num = new Scanner(System.in);
        int num1,num2,num3,sum,avg;

        System.out.print("enter 1st number:");
        num1= num.nextInt();

        System.out.print("enter 2nd number:");
        num2= num.nextInt();

        System.out.print("enter 3rd number:");
        num3= num.nextInt();

        sum= num1+ num2+ num3;

        System.out.println("print sum is : " + sum);

        avg=sum/3;

        System.out.println("average is   : " + avg);










    }
}
