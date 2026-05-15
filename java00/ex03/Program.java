package java00.ex03;
import java.util.Scanner;

public class Program {

    static int maxWeek = 0;

    static int w1, w2, w3, w4, w5, w6, w7, w8, w9;
    static int w10, w11, w12, w13, w14, w15, w16, w17, w18;

    static int readWeek(String line) {
        if (line.length() < 6 || line.length() > 8 || !line.startsWith("Week ")) {
            System.err.println("IllegalArgument");
            System.exit(-1);
        }
        int week = Integer.parseInt(line.substring(5).trim());
        if (week < 1 || week > 18) {
            System.err.println("IllegalArgument");
            System.exit(-1);
        }
        return (week);
    }

    static int readGrades(Scanner input) {
        String[] gradesArr = input.nextLine().trim().split(" ");

        if (gradesArr.length != 5) {
            System.err.println("IllegalArgument");
            System.exit(-1);
        }

        int minGrade = 10;

        for (String g : gradesArr) {
            int grade = Integer.parseInt(g);

            if (grade < 1 || grade > 9) {
                System.err.println("IllegalArgument");
                System.exit(-1);
            }

            if (grade < minGrade)
                minGrade = grade;
        }

        return minGrade;
    }

    static void storeResult(int week, int minGrade) {
        if (week != maxWeek + 1) {
            System.err.println("IllegalArgument");
            System.exit(-1);
        }
        switch (week) {
            case 1 -> w1 = minGrade;
            case 2 -> w2 = minGrade;
            case 3 -> w3 = minGrade;
            case 4 -> w4 = minGrade;
            case 5 -> w5 = minGrade;
            case 6 -> w6 = minGrade;
            case 7 -> w7 = minGrade;
            case 8 -> w8 = minGrade;
            case 9 -> w9 = minGrade;
            case 10 -> w10 = minGrade;
            case 11 -> w11 = minGrade;
            case 12 -> w12 = minGrade;
            case 13 -> w13 = minGrade;
            case 14 -> w14 = minGrade;
            case 15 -> w15 = minGrade;
            case 16 -> w16 = minGrade;
            case 17 -> w17 = minGrade;
            case 18 -> w18 = minGrade;
        }
        if (week > maxWeek)
            maxWeek = week;
    }

    static void printChart() {
        for (int i = 1; i <= maxWeek; i++) {
            int val = switch (i) {
                case 1 -> w1;
                case 2 -> w2;
                case 3 -> w3;
                case 4 -> w4;
                case 5 -> w5;
                case 6 -> w6;
                case 7 -> w7;
                case 8 -> w8;
                case 9 -> w9;
                case 10 -> w10;
                case 11 -> w11;
                case 12 -> w12;
                case 13 -> w13;
                case 14 -> w14;
                case 15 -> w15;
                case 16 -> w16;
                case 17 -> w17;
                case 18 -> w18;
                default -> 0;
            };

            System.out.print("Week " + i + " ");

            for (int j = 0; j < val; j++)
                System.out.print("=");

            System.out.println(">");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            String line = input.nextLine().trim();

            if (line.equals("42"))
                break;

            int week = readWeek(line);
            int minGrade = readGrades(input);

            storeResult(week, minGrade);
        }

        printChart();

        input.close();
    }
}
