package assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MyFile {
    public static void writePrimes(String infile, String outfile) {
        File file = new File(infile);
        try (Scanner in = new Scanner(file); PrintWriter out = new PrintWriter(outfile)) {
            while (in.hasNextLine()) {
                String line = in.nextLine();
                String[] words = line.split(",");
                for (String word : words) {
                    if (isPrime(word)) out.println(word);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    private static boolean isPrime(String word) {
        try {
            int n = Integer.parseInt(word);
            return isPrime(n);
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Test primes by trial division
    private static boolean isPrime(int n) {
        if (n < 2) return false;

        // i goes until sqrt(n) because that's the greatest possible factor
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
