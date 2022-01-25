package Chapter4;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String args[]){

        //Initialize known variables
        int rate = 15;
        int maxHours = 40;


        //Get input for unknown variables
        System.out.println("How many hours did you work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        //Validate input
        while(hoursWorked > maxHours || hoursWorked < 1){
            System.out.println("trata de ingresar nuevamente los montos correspondientes!");
            hoursWorked = scanner.nextDouble();
        }

        scanner.close();

        //Calculate gross
        double gross = rate * hoursWorked;
        System.out.println("en este codigo solo se habla de dinero! esto va a pagar una vez al mes!: $" + gross);



    }
}
