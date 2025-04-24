import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int guessAmount = 5;


        //Random number generated and stored in randomNum
        int randomNum = randomNumber();
        System.out.println("Pick a number between 0 and 100 (For testing your random number is: " + randomNum + ")" );
        while ( guessAmount > 0) {
            try {
                int myGuess = myObj.nextInt();

                if (myGuess == randomNum) {
                    System.out.println("You guessed the number correctly!");
                    break;
                }

                else if (myGuess > randomNum) {
                    guessAmount -= 1;
                    System.out.println("Please pick a lower number");
                }

                else if ( myGuess > 100) {
                    System.out.println("This number is greater then 100, Please pick a number between 0 and 100");
                }

                else {
                    guessAmount -= 1;
                    System.out.println("Please pick a higher number");
                }
            }catch(Exception e) {
                System.out.println("This is not a number, please pick a number between 0 and 100");
                myObj.nextLine();
                }
        }

        if (guessAmount == 0) {
            System.out.println("Sorry you loose!");
        }

    }
    public static Integer randomNumber() {
        return (int) (Math.random() * 101);
    }
}

