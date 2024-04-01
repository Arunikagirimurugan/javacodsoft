import java.util.Random;
import java.util.Scanner;

public class taskone {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange=1;
        int maxRange=100;
        int maxAttempts=10;
        int score=0;
        int rounds=0;

        System.out.println("Welcome to the Number Guessing Game!");

        boolean playAgain=true;
        while (playAgain){
            rounds++;
            int targetNumber=random.nextInt(maxRange-minRange+1)+minRange;
            int attempt=0;
            boolean correctGuess= false;
            System.out.println("Round"+rounds+":");
            System.out.println("I have selected a number betweeen "+minRange+"and "+maxRange);
            System.out.println("You have "+maxAttempts+" attempts to guess the number!");
            while(attempt<maxAttempts&&!correctGuess){
                System.out.println("Enter your Guess:");
                int guess=scanner.nextInt();
                attempt++;
                if (guess==scanner.nextInt()){
                    System.out.println("Congratulations..!Your guess is right. You guessed the correct number in"+attempt+"attempts.");
                    correctGuess=true;
                    score+=maxAttempts-attempt+1;
                }
                else if(guess<targetNumber){
                    System.out.println("Too low.Try again");
                    if(targetNumber%2==0){
                        System.out.println("Hint:The target number is even");
                    }
                    else{
                        System.out.println("Hint:The target number is odd");
                    }
                    }
                    else{
                        System.out.println("Too high.Try again");
                    }
                    if (targetNumber%3==0){
                        System.out.println("Hint:The target number is divisible by 3");

                    }
                    else{
                        System.out.println("Hint:The target number is not divisible by 3");
                    }

                
            }
            if(!correctGuess){
                System.out.println("Sorry..!You have reached maximum number of attempts. The correct number is"+targetNumber);
            }
            System.out.println("Based on your attempts, your score is"+(maxAttempts-attempt+1));
            System.out.println("Do you want to play again(yes/no)");
            String playChoice=scanner.next();
            playAgain= playChoice.equalsIgnoreCase("yes");
            }
            System.out.println("Your final score is "+score);
            System.out.println("Thanks for playing..!");
            scanner.close();
        }
    }