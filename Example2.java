import java.util.*;
public class Example2 {

    //seashellseabed
    //10/28
    //count prime numbers



    public static int countPrimes(int integer){
                //return the number of factors in the number
                int count = 2; //counter starts at 2 because 0 and 1 are never prime
                int primes = 0; //the amount of primes there is
                while(count <= integer){ //while the counter is less than or equal to the integer
                    if(Example1.isPrime(count)){ //use Example1's isprime to check if the count number is actually prime or not

                        primes = primes + 1; // increment primes by 1 if it is prime
                    }
                    count = count + 1; //count always goes up
                }
                return primes; //return primes at the end

        }
    

           

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in); //initialize the scanner

        System.out.println("Input a number"); 

        int number = scanner.nextInt(); //take the scanner's input

        int primes = countPrimes(number); //plug the scanner input into the countPrimes method

        System.out.println("The number " + number + " has " + primes + " prime numbers less than or equal to itself." ); //result

        


    }





        


    }
    

