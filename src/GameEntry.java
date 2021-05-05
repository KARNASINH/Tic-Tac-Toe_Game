/**Application Purpose : This is public class contains main method other static variables and method to get an entry point
for the game start.
*Author: Karnsinh Gohil
*Date: 1st April 2021
*Time: 12:00 PM
**/

//Declared util. scanner class to instantiate the scanner object.
import java.util.Scanner;

//Importing Input Miss Match exception handling class.
import java.util.InputMismatchException;

//Public class for the main method.
public class GameEntry
{

    //Declared Static variables.
    //Turn variable to store and pass X or O value to the array index.
    public static String turn;
    //board 2D array to generate 9 array indexes for game board.
    public static String board[];
    //To print who's turn on the screen.
    public static String playerTurn = null;

    //main method for the entry point for compiler.
    public static void main(String[] args)
    {
        //Declared object of the scanner class.
        Scanner sc = new Scanner(System.in);

        //This variable to store the decision Yes or No.
        String decision;
        //To store value, how many matches you want to play.
        int matchSeries;
        //Variable use to iterate loop for playing match again and again till pre defined number of matches not played.
        int p = 0;
        //To print current match number.
        int matchRound = 1;
        //Declared variable to store won matches for players.
        int player1Score =0;
        int player2Score = 0;

        //Printing messages on the screen.
        System.out.println("==========::::: Welcome to Tic Tac Toe Game :::::==========");
        System.out.println("");

        //Instantiate object to store player names and re use of it.
        PlayerInformation game1 = new PlayerInformation();

        //Passing Player-01 name to the instance variable through setter method.
        System.out.print("Enter name of Player-01 : ");
        String player1 = sc.nextLine();
        game1.setNamePlayer1(player1);

        System.out.println("");

        //Passing Player-02 name to the instance variable through setter method.
        System.out.print("Enter name of Player-02 : ");
        String player2 = sc.nextLine();
        game1.setNamePlayer2(player2);

        System.out.println("");

        //Storing value for how many games do you want to play.
        System.out.print("How many games do you want to play? : ");
        matchSeries = sc.nextInt();

        System.out.println("");

        //Do loops execute codes once without checking condition.
        do
        {

            //Creating the String Array.
            board = new String[9];
            //Setting default value X in the variable.
            turn = "X";
            //Initialization of String.
            String victor = null;

            //Initialization of String Array to set value in the game board.
            for (int a = 0; a < 9; a++)
            {
                board[a] = String.valueOf(a + 1);
            }

            //Displaying two different board layout to the user.
            System.out.println("Two Board layout available.");
            System.out.println("");

            //Displaying board layout 1.
            System.out.println("===Layout-01===");
            System.out.println("");
            BoardLayout.printBoard(1);

            System.out.println("");

            //Displaying board layout 2.
            System.out.println("===Layout-02===");
            System.out.println("");
            BoardLayout.printBoard("1");
            System.out.println("");

            //Getting input from the user to select game board.
            System.out.print("Choose the Board layout : ");
            int boardLayout = sc.nextInt();

            //Displaying board layout as per user selection.
            if (boardLayout == 1)
            {
                System.out.println("You have chosen option-01.");
                BoardLayout.printBoard(1);
            } else if (boardLayout == 2)
            {
                System.out.println("You have chosen option-02.");
                BoardLayout.printBoard("1");
            }

            //Displaying message; Game start on the screen.
            System.out.println("");
            System.out.println("===============================================================");
            System.out.println("      *=*=*=*Game Begins*=*=*Round-" + matchRound + "*=*=*=*");
            System.out.println("===============================================================");
            System.out.println("");

            //Showing current player position on the screen before getting input from the user.
            System.out.println(">>>>> Current Game position <<<<<");
            System.out.println("");

            if (boardLayout == 1)
            {
                BoardLayout.printBoard(1);
            } else if (boardLayout == 2)
            {
                BoardLayout.printBoard("1");
            }

            System.out.println("");

            //Displaying which player has the turn now.
            System.out.println(game1.getNamePlayer1() + " will play first.");
            System.out.print(game1.getNamePlayer1() + " enter a slot number to place X in : ");

            //While loop runs till the match result not declared.
            while (victor == null)
            {
                //Variable to store value where user want to pass "X" or "O".
                int positionInput;

                // Try-Catch for exception handling.
                // numInput will take input from user and it should be between 1 to 9.
                // If it is not in range , then it will show you an error ans asking for the input agian.
                try
                {
                    //Taking value form the user.
                    positionInput = sc.nextInt();

                    //
                    if (!(positionInput > 0 && positionInput < 10))
                    {
                        System.out.println("Input invalid; re-enter slot number (1 to 9) : ");
                        continue;
                    }
                }
                catch (InputMismatchException e)
                {
                    System.out.println("Input invalid; re-enter slot number (1 to 9) : ");
                    continue;
                }

                //Checking entered slot is already taken or not.
                if (board[positionInput - 1].equals(String.valueOf(positionInput)))
                {
                    //If slot is not taken then it pass the stored value from turn variable to array index.
                    board[positionInput - 1] = turn;

                    //Change turn from X to O once input taken from the user is stored.
                    if (turn.equals("X"))
                    {
                        turn = "O";
                        playerTurn = game1.getNamePlayer2();
                    }
                    //Change turn from O to X once input taken from the user is stored.
                    else
                    {
                        turn = "X";
                        playerTurn = game1.getNamePlayer1();
                    }

                    System.out.println("");
                    System.out.println(">>>>> Current Game position <<<<<");
                    System.out.println("");

                    if (boardLayout == 1)
                    {
                        BoardLayout.printBoard(1);
                    } else if (boardLayout == 2)
                    {
                        BoardLayout.printBoard("1");
                    }

                    //Storing return value after execution of the checkWinner method of GamerRound class.
                    victor = GameRound.checkWinner();
                }

                //If entered slot value has X or O in the slot, asking user again for the input.
                else
                {
                    System.out.println("Slot already taken; re-enter slot number (1 to 9) : ");
                }
            }

            //Display the result on the screen if it's a draw match.
            if (victor.equalsIgnoreCase("draw"))
            {
                System.out.println("");
                System.out.println("This is a draw match.");
            }

            //Display the result on the screen if any of the player won the match.
            else if (victor.equals("X"))
            {
                System.out.println("");
                System.out.println("Congratulations, " + game1.getNamePlayer1() + " has won this match.");

                //Counting player-01 score if he or she wins the match.
                player1Score++;
            }

            else if (victor.equals("O"))
            {
                System.out.println("");
                System.out.println("Congratulations, " + game1.getNamePlayer2() + " has won this match.");

                //Counting player-02 score if he or she wins the match.
                player2Score++;
            }

            sc.nextLine();

            System.out.println("");

            //Asking to the user if he / she wants to play game again.
            System.out.print("Do you want to play again (Yes/No) ? : ");
            decision = sc.nextLine();

            //Storing decision entered by user into the variable.
            decision = decision.substring(0,1).toUpperCase() + decision.substring(1).toLowerCase();

            System.out.println("");

            //Counting how many match played, if user input received is Yes.
            if (decision.equals("Yes"))
            {
                p++;
                matchRound++;
            }

            //Setting variable value same as the matches user wanted to play, to stop re-iteration of the Do-While loop.
            else
            {
                p = matchSeries;
            }

        //Do-while loop iterating again and again until user does not enter No for playing match again question.
        }while( p < matchSeries);

        //Shows error on the screen if user wants to play match again which is higher than pre-defined match series value.
        if(p == matchSeries)
        {
            System.out.println("#Error101 : You have wished to play only " + matchSeries + " matches.");
        }

        System.out.println("");

        //Displaying final match series score on the screen.
        System.out.println(":::::::::::::::::::: Series Score ::::::::::::::::::::");
        System.out.println(game1.getNamePlayer1() + " v/s " + game1.getNamePlayer2() + " : " + player1Score + "-" + player2Score);
    }
}
