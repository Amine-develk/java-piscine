
/*
package java00.ex03;
import  java.util.Scanner;

public class Program {
    public static void  main(String[] args) {
        Scanner input = new Scanner(System.in);
        int w1 = 0, w2 = 0, w3 = 0, w4 = 0, w5 = 0, w6 = 0, w7 = 0, w8 = 0, w9 = 0;
        int w10 = 0, w11 = 0, w12 = 0, w13 = 0, w14 = 0, w15 = 0, w16 = 0, w17 = 0, w18 = 0;
        int week;
        String  line;
        String  weekNbr;
        String  grades;
        while (true)
        {
            line = input.nextLine().trim();
            if (line.equals("42"))
                break ;
            if (line.length() < 6 || line.length() > 8 || !line.startsWith("Week "))
            {
                System.err.println("IllegalArgument");
                System.exit(-1);
            }
            weekNbr = line.substring(5).trim();
            week = Integer.parseInt(weekNbr);
            if (week < 1 || week > 18)
            {
                System.err.println("IllegalArgument");
                System.exit(-1);
            }
            grades = input.nextLine().trim();
            String[]    gradesArr = grades.split(" ");
            if (gradesArr.length != 5)
            {
                System.err.println("IllegalArgument");
                System.exit(-1);
            }
            int minGrade = 10;
            for (String g : gradesArr)
            {
                int grade = Integer.parseInt(g);
                if (grade < 1 || grade > 9)
                {
                    System.err.println("IllegalArgument");
                    System.exit(-1);
                }
                if (grade < minGrade)
                    minGrade = grade;
            }
        }
        input.close();
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
    }
}
*/