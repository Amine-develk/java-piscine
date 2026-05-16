package java00.ex04;
import java.util.Scanner;

public class Program {

    static int size = 0;

    static void insertTop10(char[] topChars, int[] topCounts, int i, int count) {
        int pos = 0;
        while (pos < size) {
            if (count > topCounts[pos])
                break ;
            if (count == topCounts[pos] && i < topChars[pos]) break;
            pos++;
        }
        if (pos < 10) {
            for (int j = 9; j > pos; j--) {
                topChars[j]  = topChars[j - 1];
                topCounts[j] = topCounts[j - 1];
            }
            topChars[pos]  = (char) i;
            topCounts[pos] = count;
            if (size < 10)
                size++;
        }
    }

    static void printHistogram(char[] topChars, int[] topCounts) {
        int maxCount = topCounts[0];

        int[] heights = new int[10];
        for (int i = 0; i < size; i++)
            heights[i] = (topCounts[i] * 10) / maxCount;
        for (int row = 10; row >= 1; row--) {
            for (int i = 0; i < size; i++) {
                if (heights[i] >= row)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            for (int i = 0; i < size; i++) {
                if (heights[i] == row)
                    System.out.print(topCounts[i]);
            }
            System.out.println();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(topChars[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        int[] counts = new int[65536];
        for (char c : text.toCharArray())
            counts[c]++;
        char[] topChars  = new char[10];
        int[]  topCounts = new int[10];
        for (int i = 0; i < 65536; i++) {
            if (counts[i] == 0) continue;
            insertTop10(topChars, topCounts, i, counts[i]);
        }
        printHistogram(topChars, topCounts);
        input.close();
    }
}