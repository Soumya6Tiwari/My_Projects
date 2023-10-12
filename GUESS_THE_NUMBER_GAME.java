import java.util.Scanner;
import java.util.Random;
class game {
    private int no_of_guesses;
    int num1, num;

    public void setNo_of_guesses(int n)
    {
        no_of_guesses = n;
    }

    public int getNo_of_guesses()
    {
        return no_of_guesses;
    }

    public game()
    {
        Random rd = new Random();
        num = rd.nextInt(0, 101);


    }

    public void takeUserInput(int number)
    {
        num1 = number;

    }

    public boolean isCorrectNumber()
    {

            if (num > num1)
            {
                System.out.println("the original number is large...guess again");
                no_of_guesses++;
                return false;

            }
            else if (num< num1)
            {
                System.out.println("the original number is small.....guess again");
                no_of_guesses++;
                return false;
            }
            else {
                no_of_guesses++;
                return true;


        }

    }
}

public class Java_43_GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /*
        create a class Game which allows the user to play "Guess the Number" game once.
        Game should have the following methods
        1. constructor to generate the random number
        2. takeUserInput() to take a user input of number
        3. isCorrectNumber() to detect whether the number entered by the user is true
        4. Getters and Setters for no_of_guesses
        Use properties such as no_of_guesses(int),etc to get this task done


         */
        game gm= new game();
        boolean value;
        System.out.println("dear computer !!! generate a random number.....");
        gm.setNo_of_guesses(0);
        System.out.println("dear user!!! now guess a number from 1-100");
        int a=sc.nextInt();
        gm.takeUserInput(a);


        value= gm.isCorrectNumber();
        while(value!=true)
        {
            a=sc.nextInt();
            gm.takeUserInput(a);
             value= gm.isCorrectNumber();
        }
        System.out.println("the correct no is : "+ a);
        System.out.println("the no.of guesses required to guess the number is : "+gm.getNo_of_guesses());






    }
}
