/**Application Purpose : This class has methods which decides; who won the match, match has been draw or not,
after getting each input from the user.
*Author: Karnsinh Gohil
*Date: 1st April 2021
*Time: 12:00 PM
**/

//Declared a public class to check winner of the game, after each input entered by the user.
public class GameRound
{
    //Method runs after every input entered by user.
    //It checks total 8 possible combination to decide who won the game.
    static String checkWinner()
    {
        //for loop to to go through each index of the array.
        for (int index = 0; index < 8; index++)
        {
            //Declared variable to store value of 3 indexes.
            String combination = null;

            //Switch case to pass stored value from array indexes into the variable.
            switch (index)
            {
                //Passing value of 3 index's combination to the variable at every iteration of the for loop.
                //Total 8 different combination are possible and need to check them.
                case 0:
                    combination = GameEntry.board[0] + GameEntry.board[1] + GameEntry.board[2];
                    break;
                case 1:
                    combination = GameEntry.board[3] + GameEntry.board[4] + GameEntry.board[5];
                    break;
                case 2:
                    combination = GameEntry.board[6] + GameEntry.board[7] + GameEntry.board[8];
                    break;
                case 3:
                    combination = GameEntry.board[0] + GameEntry.board[3] + GameEntry.board[6];
                    break;
                case 4:
                    combination = GameEntry.board[1] + GameEntry.board[4] + GameEntry.board[7];
                    break;
                case 5:
                    combination = GameEntry.board[2] + GameEntry.board[5] + GameEntry.board[8];
                    break;
                case 6:
                    combination = GameEntry.board[0] + GameEntry.board[4] + GameEntry.board[8];
                    break;
                case 7:
                    combination = GameEntry.board[2] + GameEntry.board[4] + GameEntry.board[6];
                    break;
            }

            //if condition to check weather stored value is equal to XXX or not to decide winner at every input.
            if (combination.equals("XXX"))
            {
                return "X";
            }

            //else-if condition to check weather stored value is equal to OOO or not to decide winner at every input.
            else if (combination.equals("OOO"))
            {
                return "O";
            }
        }

        //Check if any single array index contains value equal to 1 to 9.
        //if value is equal to 1 to 9 then there user has chance to enter next input.
        for (int j = 1; j < 10; j++)
        {
            //String equals method to check stored values in array are between 1 to 9 or not.
            //String valueOf, to convert integer into string.
            if (GameEntry.board[j - 1].equals(String.valueOf(j)))
            {
                //Break the loop if array index contains between 1 to 9, and get ready to take new input from user.
                break;
            }

            //To declare a draw if all array indexes are occupied and not any of the combination is equal to XXX or OOO.
            else if (j == 9)
            {
                return "draw";
            }
        }

        //To print message on the screen, currently who's player turn is.
        System.out.print(GameEntry.playerTurn + " enter a slot number to place " + GameEntry.turn + " in : ");

        //Does not return anything till all 9 input are taken or any of the player won the game, whichever is earlier.
        return null;
    }
}
