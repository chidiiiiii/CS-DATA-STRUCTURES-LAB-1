// lab2.java
// Chidi Emenike
// September 5, 2025
// calculates primes using Sieve of Eratosthenes
// demonstrates command line arguments and methods
// /*This program finds all prime numbers up to a number we choose using the Sieve of Eratosthenes.
// The biggest prime this program can find depends on how big the number we give it is and how much memory the computer has. 
// Printing all the primes takes a lot of time and memory...
//The main limits are memory (because the program needs an array for all the numbers) and speed (it takes longer to check bigger numbers).


public class lab2 {

    public static void main(String[] args) {
        int num = 0;

        // add code to get num from command line argument
        if (args.length > 0) {
            num = Integer.parseInt(args[0]);
            System.out.println("num = " + num);
        } else {
            num = 1000;
            System.out.println("Since no argument is given, default num = 1000");
        }

        // call showPrimes
        showPrimes(num);
    } // end main

    public static void showPrimes(int N) {
        boolean[] array = new boolean[N + 1];
        array[0] = false;
        array[1] = false;
        for (int i = 2; i <= N; i++) {
            array[i] = true;
        }

        // mark off values
        for (int i = 2; i * i <= N; i++) {
            if (array[i]) {
                for (int j = i * i; j <= N; j += i) {
                    array[j] = false;
                }
            }
        }

        // display results
        for (int i = 2; i <= N; i++) {
            if (array[i]) {
                System.out.println(i);
            }
        }
    } // end showPrimes

} // end class lab2
