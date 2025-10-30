//SeashellSeabed
//10/29/2025
//dude walking on a bridge 'simulation'

public class RandomWalk {

    public static void main(String[] args){

        double x = 3.5; //position on the bridge which is like the x value on a graph
        int timesMoved = 0; // i dont feel like typing these out
        int greatestTimesMoved = 0;

        for(int walk = 1; walk <= 50; walk++){ //repeats the walk 50 times
            x = 3.5; //set position on the bridge
            timesMoved = 0; //make times moved into 0 at beginning

            while(x > 0 && x < 7){ //while the dude walking on the bridge is NOT off the bridge
                double direction = Math.random(); //get a random number between 0 and 1 where 0 to 0.5 is left and 0.5 to 1 is right

                if(direction < 0.5){ //if less than 0.5 go left
                    x = x - 0.5;
                }else{ //if more than 0.5 GO RIGHHTTT!!!!
                    x = x + 0.5;
                }

                timesMoved++; //increment times moved 
            }

            System.out.println("Walk " + walk + ": Moved " + timesMoved + " times to exit the bounds."); //output for each walk

            if(timesMoved > greatestTimesMoved){ //check for greatest times moved
                greatestTimesMoved = timesMoved; //update greatest times moved
            }

        }

        System.out.println("So after 50 tests, the greatest number of walks was " + greatestTimesMoved + ". That's... probably a lot! I mean, seriously. It's a super low chance that EVERY instance was low."); //output greatest times moved
    }

    
    
}
