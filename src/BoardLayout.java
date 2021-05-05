/**Application Purpose : This class has two same name method (based on method overloading concept) and game board layout
is printed on the screen based on the user selection.
*Author: Karnsinh Gohil
*Date: ○1st April 2021
*Time: 12:00 PM
**/

//Public board layout class for displaying selected board on the screen.
//This class contains two methods with same name and different data type for arguments (method overloading).
public class BoardLayout
{
/* 1st method has this board layout.
	-------------
	| 1 | 2 | 3 |
	----+---+----
	| 4 | 5 | 6 |
	----+---+----
	| 7 | 8 | 9 |
	-------------
*/
    //Public method with no return type.
    //This method takes integer as an input argument.
    public static void printBoard(int boardSeries)
    {
        //Printing value stored in the array indexes 0 to 9, to display numbers stored in the array boxes.
        System.out.println("-------------");
        System.out.println("| " + GameEntry.board[0] + " | " + GameEntry.board[1] + " | " + GameEntry.board[2] + " |");

        System.out.println("----+---+----");
        System.out.println("| " + GameEntry.board[3] + " | " + GameEntry.board[4] + " | " + GameEntry.board[5] + " |");

        System.out.println("----+---+----");
        System.out.println("| " + GameEntry.board[6] + " | " + GameEntry.board[7] + " | " + GameEntry.board[8] + " |");

        System.out.println("-------------");
    }

/* 2nd method has this board layout.
	    |   |
	  1 | 2 | 3
	----+---+----
	  4 | 5 | 6
	----+---+----
	  7 | 8 | 9
	    |   |
*/

    //Public method with no return type.
    //This method takes String as an input argument.
    public static void printBoard(String boardSeries)
    {
        //Printing value stored in the array indexes 0 to 9, to display numbers stored in the array boxes.
        System.out.println("     |   |    ");
        System.out.println("  " + GameEntry.board[0] + "  | " + GameEntry.board[1] + " | " + GameEntry.board[2] + "  ");

        System.out.println("-----+---+-----");
        System.out.println("  " + GameEntry.board[3] + "  | " + GameEntry.board[4] + " | " + GameEntry.board[5] + "  ");

        System.out.println("-----+---+-----");
        System.out.println("  " + GameEntry.board[6] + "  | " + GameEntry.board[7] + " | " + GameEntry.board[8] + "  ");

        System.out.println("     |   |    ");
    }
}
