import java.util.Scanner;

public class E03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("which multiplication table to show? ");
        int number = input.nextInt();

        for (int i = 0; i < 11; i++) {
            System.out.println(i + " x " + number + " = " + (i * number));
        }
    }
}
