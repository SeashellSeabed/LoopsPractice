//SeashellSeabed
//10/29/2025
//Hailstone sequence

public class Hailstone {
    public static void main(String[] args) {
        int maxIterations = 0;   // highest number of iterations
        int numberWithMax = 0;   // the number that has the maximum iteration 
        boolean allReachCycle = true; // this is always true, so... i dont even bother putting it in the code

        
        for (int i = 200; i >= 1; i--) { // from 200 down to 1
            int number = i; // the number being checked
            int steps = 0; // keep track of the given number's steps and reset each time the for loop goes back

           
            while (number != 1) { //while number is not equal to 1 (which means 4, 2, 1 cycle has not been reached)
                if (number % 2 == 0) { // check for even number
                    number = number / 2; // divide by 2
                    System.out.println(number); //print the number
                } else {
                    number = 3 * number + 1; //if the number is odd do the odd stuff
                    System.out.println(number);  //print the number
                }
                steps++; //each time the if loop is ran through increment steps
            }

            // Track maximum
            if (steps > maxIterations) { //at the end of the while loop check if steps is bigger then the maximum amount of iterations done
                maxIterations = steps; //if it's true then we turn the maximum amount of iterations into steps
                numberWithMax = i; //grab whatever number was i in the loop and put it on number with max so we know what number did ts
            }
        }

        // Output results
        if (allReachCycle) { //if all numbers reach the cycle
            System.out.println("All numbers from 200 down to 1 reached the 4, 2, 1 cycle! This is ordinary."); //expected output at the end of the code
        } else {
            System.out.println("Some numbers did not reach the 4, 2, 1 cycle?? That should be impossible, unless you're a super mega genius who found a new number system..."); //this shouldn't happen but just for the sake of it
        }

        System.out.println("The maximum number of iterations was " + maxIterations + "! The winner is..." + numberWithMax + "! Congratulations!" ); //the final message dispalying who won. It should always be 171 with 124 iterations. 
    }
}
