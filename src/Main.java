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
                    System.out.println("You guessed the number correctly, you win!");
                    break;
                }

                else if (myGuess > randomNum & myGuess < 101) {
                    guessAmount -= 1;
                    System.out.println("Please pick a lower number");
                }

                else if ( myGuess < randomNum & myGuess > 0) {
                    guessAmount -= 1;
                    System.out.println("Please pick a higher number");
                }

                else {
                    System.out.println("Your guess is not between 1 and 100, Please try again");
                }
            }catch(Exception e) {
                System.out.println("Your guess is not between 1 and 100, Please try again");
                myObj.nextLine();
                }
        }

        if (guessAmount == 0) {
            System.out.println("Sorry you lose!");
            System.out.println("The number to guess was: " + randomNum);
        }

    }
    public static Integer randomNumber() {
        return (int) (Math.random() * 101);
    }
}

