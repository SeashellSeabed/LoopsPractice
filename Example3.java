//SeashellSeabed
//10/28/2025
//Guessing game project.

public class Example3 {

    public static void main(String[] args) {
        int guessedNumber = (int)(Math.random() * 100) + 1; // Random number between 1 and 100
        int attempts = 0; //the number of attempts
        java.util.Scanner scanner = new java.util.Scanner(System.in); //scanner (BORING!)
        int guess = 0; //the guessed number by user
        System.out.println("Welcome... Pick a number 1-100. If you get it wrong in 7 tries you are TERRIBLE at this.");

        while (guess != guessedNumber) { //while the guess is not equal to the guessed number (if it is, then it has been guessed correctly)
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt(); //recieve user input into guess
            attempts = attempts + 1; //increment attempts

            if (guess < guessedNumber) { //if guess is too low
                System.out.println("Too low. Try something a little... higher.");
            } else if (guess > guessedNumber) { //if guess is too high
                System.out.println("Too high. Get lower.");
            }
        }

        System.out.println("There you go. You guessed the number " + guessedNumber + " in " + attempts + " tries."); //message when guess is correct. Yaahoo!
        //silly little dialouge given after guessing correctly depending on number of attempts
        if(attempts > 12){
            System.out.println("Yikes. Seriously, just yikes. Did you break the code? Is it not working, or are you just so terrible at this that it took you over 12 tries? F tier. Quit while you're behind.");
        }
        else if(attempts > 7){
            System.out.println("Average. We don't accept average. D tier.");
        }else if(attempts > 5){
            System.out.println("Over 5 tries, but not that much. C tier, do better.");
        }else if(attempts > 3){
            System.out.println("Over 3 tries, Now this isn't half bad. B tier, but there's room for improvement.");
        }else if(attempts > 1){
            System.out.println("Under 3 tries. Not bad, A tier.");
        }else if(attempts == 1){
            System.out.println("You've either got some insane Luck, time on your hands, or you just cheated. S tier.");
        }else{ //this shouldn't happen under any circumstance if the code is not tampered with. I just think it's funny :)
            System.out.println("Don't you know? People who tamper with the code for a better chance at winning are the loses in of itself. Super ultra mega hyper F tier.");
        }
        
    }
}
