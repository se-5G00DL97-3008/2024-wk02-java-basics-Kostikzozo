import java.util.Scanner;
class E04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a day: ");
        int day_n = input.nextInt();
        System.out.println("Enter a month: ");
        int month_n = input.nextInt();
        if ((day_n == 24) && (month_n == 12)){
            System.out.println("Merry Christmas!");
        }

    }
}
