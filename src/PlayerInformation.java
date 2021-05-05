/**Application Purpose : This class has instance variables and setter-getter method to set and get the player information
and store them to the instance variables.
*Author: Karnsinh Gohil
*Date: 1st April 2021
*Time: 12:00 PM
**/

//Declared public class to store the player information and get them whenever required.
public class PlayerInformation
{
    //Declared two instance variable to store two player's name.
    private String namePlayer1;
    private String namePlayer2;

    //Declared Constructor without passing the arguments to initialize the variable.
    public PlayerInformation()
    {
        //Initialization of the variables.
        namePlayer1 = null;
        namePlayer2 = null;
    }

    //Declared Setter for storing value in the instance variable namePlayer1.
    public void setNamePlayer1(String namePlayer1Local)
    {
        namePlayer1 = namePlayer1Local.substring(0,1).toUpperCase() + namePlayer1Local.substring(1).toLowerCase();
    }
    //Declared Getter; for calling the stored value in instance variable namePlayer1.
    public String getNamePlayer1()
    {
        return namePlayer1;
    }

    //Declared Setter for storing value in instance variable namePlayer2.
    public void setNamePlayer2(String namePlayer2Local)
    {
        namePlayer2 = namePlayer2Local.substring(0,1).toUpperCase() + namePlayer2Local.substring(1).toLowerCase();
    }
    //Declared Getter; for calling the stored value in instance variable namePlayer2.
    public String getNamePlayer2()
    {
        return namePlayer2;
    }
}
