package Chapter4;

import java.util.Random;
import java.util.Scanner;

public class DieGameMyCode {

    public static void main(String args[]) {
        int Victory = 20;
        int currentposition = 0;
        int tries = 5;

        Random random = new Random();

        System.out.println("Hello, welcome to this game. Do you want to play?(type true or false)");
        Scanner scanner = new Scanner(System.in);
        boolean answer = scanner.nextBoolean();
        System.out.println("Type your name");
        Scanner name = new Scanner(System.in);

        String neeem = name.nextLine();
        if (answer) {


            for (int i = 1; i <= tries; i++) {

                int die = random.nextInt(6) + 1;
                currentposition = currentposition + die;

                System.out.print(String.format("Roll #%d: You've rolled a %d. ", i, die));

                if (currentposition == Victory) {
                    System.out.print("You're on space " + currentposition + ". Congrats, you win!");
                    break;
                } else if (currentposition > Victory) {
                    System.out.print("Unfortunately, that takes you past " + Victory + " spaces. You lose!");
                    break;
                } else if (i == tries && currentposition < Victory) {
                    System.out.println("You're on space " + currentposition + ".");
                    System.out.println("Unfortunately, you didn't make it to all " +
                            currentposition + " spaces. You lose " + neeem +"!");
                } else {
                    int spacesToGo = Victory - currentposition;
                    System.out.print("You are now on space " + currentposition +
                            " and have " + spacesToGo + " more to go.");
                }

                System.out.println();
            }
        } else {
            System.out.println("Well then  " + neeem + ". GoodBye");
        }
    }
}
