import java.util.Scanner;

public class E09 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int count = 0;

        System.out.println("Give a test score (-1 to quit):");

        while (true) {
            int score = input.nextInt();

            if (score == -1) {
                break;
            }

            total += score;
            count++;

            double average = (double) total / count;
            System.out.println("Average: " + average);
            System.out.println("Give a test score (-1 to quit):");
        }        

        input.close();
    }
}
