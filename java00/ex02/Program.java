package java00.ex02;
import  java.util.Scanner;

public class Program {

    static int  sumOfDigits(int number) {
        int digit;
        int sum = 0;
        while (number > 0)
        {
            digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return (sum);
    }

    static boolean  isPrime(int number) {
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(number); i++)
        {
            if (number % i == 0)
            {
                isPrime = false;
                break ;
            }
        }
        return (isPrime);
    }
    public static void  main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int count = 0;
        while (number != 42)
        {
            number = sumOfDigits(number);
            if (isPrime(number))
                count++;
            number = input.nextInt();
        }
        input.close();
        System.out.println("Count of coffee-request : " + count);
    }
}