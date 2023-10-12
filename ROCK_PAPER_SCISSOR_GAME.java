import java.util.Scanner;
import java.util.Random;

public class Java_20_chapter4program {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rd=new Random();
        int match=0,userpoints=0,comppoints=0;
        while(match!=5)
        {

            System.out.println(" press 0 for rock, 1 for paper and 2 for scissors.....");
            System.out.println("match:"+ (match+1));
            System.out.println("---------------");

            System.out.println("user input:");

            int userval=sc.nextInt();
            System.out.println("computer input:");

            int computerval=rd.nextInt(3);
            System.out.println(computerval);
            if(userval==computerval)
            {
                System.out.println("match strike,no points....");
            }
            if(computerval==0&&userval==1)
            {
                System.out.println(" user win....");
                  userpoints++;
            }
            else if(computerval==0&&userval==2)
            {
                System.out.println("computer win....");
                comppoints++;
            }
            else if(computerval==1&&userval==0)
            {
                System.out.println(" user win....");
                userpoints++;

            }
            else if(computerval==1&&userval==2){
                System.out.println("user win....");
                userpoints++;
            }
            else if(computerval==2&&userval==0)
            {
                System.out.println("user win...");
                userpoints++;
            }
            else if(computerval==2&&userval==1){
                System.out.println("computer wins...");
                comppoints++;
            }

            match++;

        }
        System.out.println("user points is: "+userpoints);
        System.out.println("computer points is : "+comppoints);
        if(userpoints>comppoints)
        {
            System.out.println("overall winner is user...");
        }
        if(userpoints<comppoints)
        {
            System.out.println("overall winner is computer....");
        }
        if(userpoints==comppoints)
        {
            System.out.println("the user and the computer had a tie....");
        }

    }
}
