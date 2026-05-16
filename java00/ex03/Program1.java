package java00.ex03;
import  java.util.Scanner;

public class    Program1 {
    public static void  main(String[] args) {
        int     maxWeek = 0;
        int     minGrade = 10;
        int     week;
        int     grade;
        long    weeks = 0;
        long    multiplier = 1;
        String  token;
        Scanner input = new Scanner(System.in);
        while (true) {
            token = input.next();
            if (token.equals("42"))
                break ;
            if (!token.equals("Week")) {
                System.err.println("IllegalArgument");
                System.exit(-1);
            }
            week = input.nextInt();
            if (week < 1 || week > 18) {
                System.err.println("IllegalArgument");
                System.exit(-1);
            }
            for (int i = 0; i < 5; i++) {
                grade = input.nextInt();
                if (grade < 1 || grade > 9) {
                    System.err.println("IllegalArgument");
                    System.exit(-1);
                }
                if (grade < minGrade)
                    minGrade = grade;
            }
            if (week != maxWeek + 1) {
                System.err.println("IllegalArgument");
                System.exit(-1);
            }
            for (int i = 0; i < week; i++)
                multiplier *= 10;
            weeks += minGrade * multiplier;
            maxWeek = week;
        }
        for (int i = 1; i <= maxWeek; i++) {
            long    mult = 1;
            for (int j = 0; j < i; j++)
                mult *= 10;
            int val = (int) ((weeks / mult) % 10);
            System.out.print("Week ");
            System.out.print(i);
            System.out.print(" ");
            for (int k = 0; k < val; k++)
                System.out.print("=");
            System.out.println(">");
        }
        input.close();
    }
}