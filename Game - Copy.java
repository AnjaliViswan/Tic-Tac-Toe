/**
 * Runs a game of Tic-Tac-Toe between two players
 */
import java.util.Scanner;
public class Game
{
    /**
     * Runs a game of Tic-Tac-Toe between two players
     */
    public static void main (String [] args)
    {
       //prints welcome sign
       System.out.println(" ________  __                 ________                         ________                   ");
       System.out.println("|        ||  |               |        |                       |        |                  ");
       System.out.println(" |$$$$$$$$ |$$  _______       |$$$$$$$$______    _______       |$$$$$$$$______    ______  ");
       System.out.println("   | $$   |  | /       | ______ | $$  |      |  /       | ______ | $$  /      |  /      | ");
       System.out.println("   | $$   | $$|  $$$$$$$|      || $$   |$$$$$$||  $$$$$$$|      || $$ |  $$$$$$||  $$$$$$|");
       System.out.println("   | $$   | $$| $$       |$$$$$$| $$  /      $$| $$       |$$$$$$| $$ | $$  | $$| $$    $$");
       System.out.println("   | $$   | $$| $$_____         | $$ |  $$$$$$$| $$_____         | $$ | $$__/ $$| $$$$$$$$");
       System.out.println("   | $$   | $$ |$$     |        | $$  |$$    $$ |$$     |        | $$  |$$    $$ |$$     |");
       System.out.println("    |$$    |$$  |$$$$$$$         |$$   |$$$$$$$  |$$$$$$$         |$$   |$$$$$$   |$$$$$$$");
       System.out.println("");
        
       //Prompt X player's name
       Scanner in = new Scanner(System.in);
       System.out.println("Who is player X?: ");
       String playerX = in.nextLine();
       //Prompt O name
       System.out.println("Who is player O?: ");
       String playerO = in.nextLine();
       //Constructors
        Rules rules = new Rules();
        Board board = new Board();
       //Set game variables
       int currentPosition;
       int round = 1;
       String winner = "false";
       boolean isTie = false;
       String gameState = "Xserve";
       String[] marks = {"0", "1", "2", "3", "4", "5", "6", "7", "8"};
       //Main game functions
       while(winner == "false")
       {
           //Prints new board w/ set pieces
           System.out.println("");
           System.out.println("Round: " + round);
           System.out.println("    " + marks[0] + " | " + marks[1] + " | " + marks[2]);
           System.out.println("    ---------");
           System.out.println("    " + marks[3] + " | " + marks[4] + " | " + marks[5]);
           System.out.println("    ---------");
           System.out.println("    " + marks[6] + " | " + marks[7] + " | " + marks[8]);
           
           //Gets and sets player position/piece
           if (gameState == "Xserve")
           {
               currentPosition = 1000; //set to catch a user input error
               System.out.println(playerX + "'s turn!");
               currentPosition = board.getPosition();
               // catches if user inputs an illegal integer
               while (currentPosition != 0 && currentPosition != 1 && currentPosition != 2 && currentPosition != 3 &&
               currentPosition != 4 && currentPosition != 5 && currentPosition != 6 && currentPosition != 7 && 
               currentPosition != 8  || marks[currentPosition] == "O" || marks[currentPosition] == "X"){
                   System.out.println("Usage: Input an untaken position # on the board");
                   currentPosition = board.getPosition();
                }        
               marks = board.setPosition(marks, currentPosition, "X"); //sets position
           }
           if (gameState == "Oserve")
           {
               currentPosition = 1000; //set to catch a user input error
               System.out.println(playerO + "'s turn!");
               currentPosition = board.getPosition();
               while (currentPosition != 0 && currentPosition != 1 && currentPosition != 2 && currentPosition != 3 &&
               currentPosition != 4 && currentPosition != 5 && currentPosition != 6 && 
               currentPosition != 7 && currentPosition != 8 || marks[currentPosition] == "O" || marks[currentPosition] == "X"){ // catches if user inputs an illegal integer
                   System.out.println("Usage: Input an untaken position # on the board");
                   currentPosition = board.getPosition();
                }
               marks = board.setPosition(marks, currentPosition, "O");
           }
           //Switches turns 
           if (gameState == "Xserve")
               gameState = "Oserve";
           else
               gameState = "Xserve";
           //Sets if winner for the while conditions to check if it should keep running
           winner = rules.isWinner(marks); 
           round++; //Increments round
           
           //Checks for tie
           if (round > 9 && winner == "false")
           {
                isTie = true;
                break;
           }
       }
       
       //Prints final winning/tie board
       System.out.println("");
       System.out.println("END");
       System.out.println("    " + marks[0] + " | " + marks[1] + " | " + marks[2]);
       System.out.println("    ---------");
       System.out.println("    " + marks[3] + " | " + marks[4] + " | " + marks[5]);
       System.out.println("    ---------");
       System.out.println("    " + marks[6] + " | " + marks[7] + " | " + marks[8]);
       
       //Prints Victory Statement
       if(winner == "X" && isTie != true)
            System.out.println(playerX + " has won!");
       if(winner == "O" && isTie != true)
            System.out.println(playerO + " has won!");
       if(winner == "false" && isTie == true)
            System.out.println("It's a tie!");
       System.out.println("Thanks for playing!"); 
    }
}
