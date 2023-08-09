import java.util.*;
public class numbergame{
    public static void game(){
      Scanner sc=new Scanner(System.in);
      //to generate random number
      int random= 1+(int)(100*Math.random());

      //for no. of trails
      int N=3;
      int i,userguess;
      int score=0;
      System.out.println("Guess a number between 1 and 100 within 3 trails ");

      //loop for iteration
      for( i=0; i<N; i++){
        System.out.println("Enter your number : ");
        userguess=sc.nextInt();

        //if the guess is correct
        if(userguess==random){
            System.out.println("Congrats ! you guessed it right . ");
            score++;
            break;
        }
        
        //if guess is greater 
        else if(userguess>random && i!=N-1){
            System.out.println("Your guess is greater than the number");
        }
        
        //if guess is smaller 
        else if(userguess<random && i!=N-1){
            System.out.println("Your guess is smaller than the number");
        }
        
        }
        if(i==N){
            System.out.println("You are out of moves." + " The number is " + random);
      }
      int round=1;
      System.out.println("Do you want to play again ? (yes/no)");
      String string=sc.next();
      if(string.equals("yes")){
      game();
      }
      round++;
      {
        System.out.println("Your score is: " +score +"|" + " No. of attempts are: " + round ); 
        System.out.println("Thankyou for playing. "); 
      }
     
    }
   

public static void main(String args[]){
    game();
 }}




