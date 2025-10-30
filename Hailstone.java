//SeashellSeabed
//10/29
//Hailstone numbers
import java.util.*;

public class Hailstone {

    

    public static void main(String[]args){
    Scanner scanner = new Scanner(System.in); //initialize scanner

    System.out.println("The Hailstone numbers is a mathimatical question that is unsolved, and likely has no solution. Input a number and see if you can get it right! Zero will not work."); //introduction
    int counter = 0; //create a counter
    int highScore = 0;

    for(int inputtedNumber = 200; inputtedNumber >= 1; inputtedNumber--){
        while(inputtedNumber != 0){ //cannot be a zero.
            counter = 0;
            if(inputtedNumber == 1){
                return;
            }
            
            if(inputtedNumber % 2 == 0){ //if inputted number is even
                inputtedNumber = inputtedNumber / 2; //divide by two
                System.out.print(inputtedNumber + ", "); //print
            }else if(inputtedNumber % 2 == 1){ //if inputted number is odd
            inputtedNumber = (inputtedNumber * 3) + 1; // multiply by three and add one
            System.out.print(inputtedNumber + ", "); //print
            }else if(inputtedNumber == 0){ //if the inputted number is zero
                System.out.println("Zero is invalid."); //this shouldn't happen but just incase
                return; //end the loop
            }


            if(inputtedNumber == 1){ //1 means the loop will continue forever. End the loop.

               
                if(inputtedNumber >= highScore){
                    highScore = inputtedNumber;
                    
                }
                
                
        }
        inputtedNumber--;


    }
}

    



    }
    
}
