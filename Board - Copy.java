/**
 * Sets and prompts a user inputted position on a game board.
 * @author Anjali Viswan
 */
import java.util.Scanner;
import java.util.Arrays;
public class Board
{
    
    private int position;
    
    /**
     * Prompts the user to set a number position, then stores and returns the position. Reprompts if a user inputs a non-integer
     * @return the user's set position number.
     */
    
    public int getPosition()
    {
        System.out.println("Input Position: ");
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt() != true)
        {
            System.out.println("Usage: Please input an integer");
            System.out.println("Input Position: ");
            in = new Scanner(System.in);
        }
        position = in.nextInt();
        return position;
    }
 
    /**
     * Sets a user's piece in their chosen position in an array of total possible board positions
     * @param String[] pos the array to store set positions in
     * @param int position the inputted position of a player
     * @param String piece the kind of piece the player set
     * @return the array of set/unset positions
     */
    public String[] setPosition( String[] pos, int position, String piece)
    {
        pos[position] = piece;
        return pos;
    }
}
