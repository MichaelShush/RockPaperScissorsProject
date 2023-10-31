import java.util.Scanner;

public class RockPaperScissorsRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        RockPaperScissors computer = new RockPaperScissors();

        //Opening messages.
        System.out.println("Welcome, user, to rock paper scissors!");
        System.out.println("In this game, you will be prompted to try to beat the computer at a game of rock paper scissors.");
        System.out.println("Rock beats scissors, scissors beats paper, and paper beats rock.");
        System.out.println("Good luck!");
        System.out.println();

        String computerChoice = computer.makeChoice();
        System.out.println("The computer has chosen!");

        System.out.print("Pick your object (rock, paper, or scissors): ");
        String userInput = scan.nextLine().toLowerCase();

        System.out.println();
        System.out.println("You picked " + userInput + ".");
        System.out.println("The computer picked " + computerChoice + ".");
        if (computerChoice.equals(userInput)){
            System.out.println("Your choice was the same as the computers! Draw!");
        }
        if (computerChoice.equals("rock") && userInput.equals("paper")){
            System.out.println("Paper beats rock. You win!");
        } else if (computerChoice.equals("rock") && userInput.equals("scissors")) {
            System.out.println("Rock beats scissors. You lose!");
        }
        if (computerChoice.equals("paper") && userInput.equals("scissors")){
            System.out.println("Scissors beats paper. You win!");
        } else if (computerChoice.equals("paper") && userInput.equals("rock")){
            System.out.println("Paper beats rock. You lose!");
        }
        if (computerChoice.equals("scissors") && userInput.equals("rock")) {
            System.out.println("Rock beats scissors. You win!");
        } else if (computerChoice.equals("scissors") && userInput.equals("paper")){
            System.out.println("Scissors beats paper. You lose!");
        }
        System.out.println();
        System.out.println("Thank you for playing!");
    }
}