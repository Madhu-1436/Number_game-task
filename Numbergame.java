import java.lang.System;
import java.util.Scanner;
public class Numbergame
{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int chances=8;
        int finals=0;
        boolean playAgain=true;
        System.out.println("Hey, Glad you to here, pol!");
        System.out .println("You have about only "   +chances+   " chances to win");
        System.out.println("Enter your number:");
        while(playAgain){
            int rand=getrandNum(1,100);
            boolean number=false;
            for(int i= 0; i<chances ; i++){
                System.out.println( "chance :"  + (i+1) + "Enter your number:");
                int user=sc.nextInt();
                if(user==rand){
                    number=true;
                    finals+=1;
                    System.out.println("You Won");
                    break;
                }
                else if(user>rand){
                    System.out.println("Number is greater");   
                }
                else{
                    System.out.println("Number is lower");
                }
            }
            if(number==false){
                System.out.println("You lost the chances"+rand);
            }
            System.out.println("do You want to PlayAgain(Yes/No)");
            System.out.println();
            String PA =sc.nextLine();
            playAgain=PA.equalsIgnoreCase("Yes");
        }
        System.out.println("Hope you Enjoyed this Game");
        System.out.println();
        System.out.println("Your Score is:"+finals);
    }
        public static int getrandNum(int min,int max){
            return(int)(Math.random()*(max-min+1) +min);
        
    }
}