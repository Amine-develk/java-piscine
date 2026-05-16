package java00.ex03;
import java.util.Scanner;

public class Program {
    static int maxWeek = 0;
    static long weeks = 0;

    static int readWeek(Scanner input, String firstToken) {
        if (!firstToken.equals("Week")) {
            System.err.println("IllegalArgument");
            System.exit(-1);
        }
        int week = input.nextInt();
        if (week < 1 || week > 18) {
            System.err.println("IllegalArgument");
            System.exit(-1);
        }
        return (week);
    }

    static int readGrades(Scanner input) {
        int minGrade = 10;
        for (int i = 0; i < 5; i++) {
            int grade = input.nextInt();
            if (grade < 1 || grade > 9) {
                System.err.println("IllegalArgument");
                System.exit(-1);
            }
            if (grade < minGrade)
                minGrade = grade;
        }
        return (minGrade);
    }

    static void storeResult(int week, int minGrade) {
        if (week != maxWeek + 1) {
            System.err.println("IllegalArgument");
            System.exit(-1);
        }
        long multiplier = 1;
        for (int i = 0; i < week; i++)
            multiplier *= 10;
        weeks += minGrade * multiplier;
        maxWeek = week;
    }

    static int getGrade(int week) {
        long multiplier = 1;
        for (int i = 0; i < week; i++)
            multiplier *= 10;
        return ((int)((weeks / multiplier) % 10));
    }

    static void printChart() {
        for (int i = 1; i <= maxWeek; i++) {
            int val = getGrade(i);
            System.out.print("Week ");
            System.out.print(i);
            System.out.print(" ");
            for (int j = 0; j < val; j++)
                System.out.print("=");
            System.out.println(">");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            String token = input.next();
            if (token.equals("42"))
                break ;
            int week = readWeek(input, token);
            int minGrade = readGrades(input);
            storeResult(week, minGrade);
        }
        printChart();
        input.close();
    }
}