import java.util.Random;
import java.util.Scanner;
public class NoGuess 
{
  public static void main(String[] args)
  {
    Random Random_number = new Random();
    int right_guess = Random_number.nextInt(100);
    int turns = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Guess a number between 1 to 100, You have 10 turns!" );
    System.out.println("best of luck!");
    
    int guess;
    int i = 0;
    right_guess = 34;
    boolean win = false;
    while(win==false)
    {
      guess = sc.nextInt();
      turns++;
    
    if(guess==right_guess)
    {
      win = true;
    }
   
    else if(guess<right_guess)
    {
      i++;
      System.out.println("Yor Guess is lower than the right guess! Turns left: "+(10-i));
      
      
      
    }
    
    else if(guess>right_guess)
    {
      i++;
      System.out.println("Your Guess Is Higher Than THe Right Guess! Turns left: "+(10-i));
      
    }
    
    
  }
    System.out.println("Win !!!!!!!!!");
    System.out.println("Correct number is "+right_guess);
    System.out.println("You used "+turns+" turns to guess the right number");
    System.out.println("Your score is "+((11-turns)*10)+" out of 100");
    
}
}