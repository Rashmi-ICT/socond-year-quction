import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        System.out.println(" \t\t ~~ASB FASHION~~");
        System.out.println("--------------------------------\n");

        Scanner myObj = new Scanner(System.in);
        double no1,no2,ans,dis,last;

        System.out.print("ENTER PRICE:");
        no1=myObj.nextDouble();


        System.out.print("ENTER QUANTITY:");
        no2=myObj.nextDouble();

        ans=no1*no2;

        System.out.println("YOUR LAST BALANCE IS: " + ans);

        if (ans>=2000) {
                dis=ans*10/100;

                System.out.println("\n\t\t TODAY YOU ARE WINNER, So we give you a discount");
                System.out.println("\n DISCOUNT: "+ dis);
                last=ans-dis ;
                System.out.println("\n LAST AMOUNT IS: "+ last);

        }

        else {
            System.out.println("try again");
        }

    }
}

