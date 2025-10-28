//SeashellSeabed
//10/27/25
// loops practice

import java.util.*;

public class Example1{


    public static int countFactors(int integer){
        //return the number of factors in the number
        int count = 0; //counter
        int factors = 0; //the amount of factors there is
        while(count <= integer){
            if( count != 0 && integer % count == 0){ //makes sure not to divide by 0 before checking if mod is 0.
                factors++; //when mod is 0 that is a factor so add 1
            }
            count++; //always make counter go up to work
        }
        return factors; //returns after while loop finishes
    }

    public static boolean isPrime(int integer){
        int limit = (int)Math.sqrt(integer); //sqrt of the number
        if(integer <= 1){
            return false; // cuz 0 and 1 aren't prime

        } 
       if(integer == 2){

        return true; // 2 is a prime number so true
       }
        if(integer % 2 == 0){

             return false; // every even number that isn't 2 is prime
        } 
        for(int i = 3; i <= limit; i += 2){ // go through odd numbers, evens are not prime (with exception of 2 but i already did that)
            if(integer % i == 0) return false;
         } // if there is a facotor then it is false

            return true; // cuz there is no factors found, number is prime


        

    }

    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int integer = scan.nextInt(); 
        System.out.println("The number of factors in " + integer + " is " + countFactors(integer));
        if(isPrime(integer)){
            System.out.println(integer + " is a prime number.");
        } else {
            System.out.println(integer + " is not a prime number.");
        }

        

    }


}