//two pkg use panuroim
import java.util.Random;
import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("===================================");
        System.out.println("Welcome to 'Rock Paper Scissor Game'");
        System.out.println("===================================");
        while (true) {
            // Array created
            String[] choise = { "rock", "paper", "scissor" };
            // comouter move
            String computerMove = choise[r.nextInt(choise.length)];
            // player move
            String playerMove;
            while (true) {
                System.out.println("(\\_/)");
                System.out.println("( *.*)");
                System.out.println("/> Enter your move...");
                System.out.println("Select (rock, paper, scissor)");
                System.out.print("Your Move: ");
                playerMove = sc.nextLine();
                if (playerMove.equals("rock") || playerMove.equals("paper") || playerMove.equals("scissor")) {
                    break;
                }
                System.out.println("Invalid Move! Please select from given option");
            }
            // printing the output from the computer
            System.out.println("Computer Choice: " + computerMove);
           
            if(playerMove.equals(computerMove)){
                System.out.println("The game is a tie!");
              } else if (playerMove.equals("rock")){
                System.out.println(computerMove.equals("paper") ? "you loss!" : "you win");
              }else if (playerMove.equals("paper")){
                System.out.println(computerMove.equals("scissors") ? "you loss!" : "you win");
              }else if (playerMove.equals("scissor")){
                System.out.println(computerMove.equals("rock") ? "you loss!" : "you win");
              }
            System.out.print("play again? (y/n): ");
            String plaayAgain = sc.nextLine();
            System.out.println("==============New Game=============");
            if (!plaayAgain.equals("y")) {
                
                break;
            }
        }
        sc.close();
    }
}