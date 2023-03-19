/**
 * Checks a Tic-Tac-Toe board for a winner
 * @author Anjali Viswan
 */
public class Rules
{
    
    /**
     * Checks every possible '3-in-a-row' on a Tic-Tac-Toe board for a winner
     * @param String[] pos the array of total set and/or unset board positions
     * @return either the piece that won or "false" for no winner
     */
    
    public String isWinner(String[] pos)
    {
        if (pos[0] == "X" && pos[1] == "X" && pos[2] =="X" )
            return "X";
        if (pos[3] == "X" && pos[4] == "X" && pos[5] =="X" )
            return "X";
        if (pos[6] == "X" && pos[7] == "X" && pos[8] =="X" )
            return "X";
        if (pos[0] == "X" && pos[3] == "X" && pos[6] =="X" )
            return "X";
        if (pos[1] == "X" && pos[4] == "X" && pos[7] =="X" )
            return "X";
        if (pos[2] == "X" && pos[5] == "X" && pos[8] =="X" )
            return "X";
        if (pos[0] == "X" && pos[4] == "X" && pos[8] =="X" )
            return "X";
        if (pos[2] == "X" && pos[4] == "X" && pos[6] =="X" )
            return "X";
        if (pos[0] == "O" && pos[1] == "O" && pos[2] =="O" )
            return "O";
        if (pos[3] == "O" && pos[4] == "O" && pos[5] =="O" )
            return "O";
        if (pos[6] == "O" && pos[7] == "O" && pos[8] =="O" )
            return "O";
        if (pos[0] == "O" && pos[3] == "O" && pos[6] =="O" )
            return "O";
        if (pos[1] == "O" && pos[4] == "O" && pos[7] =="O" )
            return "O";
        if (pos[2] == "O" && pos[5] == "O" && pos[8] =="O" )
            return "O";
        if (pos[0] == "O" && pos[4] == "O" && pos[8] =="O" )
            return "O";
        if (pos[2] == "O" && pos[4] == "O" && pos[6] =="O" )
            return "O";
        return "false";
    }
}
