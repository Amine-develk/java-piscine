package java00.ex01;
import  java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int steps = 0;
        boolean isPrime = true;
        if (number <= 1)
        {
            System.err.println("IllegalArgument");
            System.exit(-1);
        }
        for (int i = 2; i <= Math.sqrt(number); i++)
        {
            steps++;
            if (number % i == 0)
            {
                isPrime = false;
                break ;
            }
        }
        if (isPrime)
            steps++;
        System.out.println(isPrime + " " + steps);
        input.close();
    }
}