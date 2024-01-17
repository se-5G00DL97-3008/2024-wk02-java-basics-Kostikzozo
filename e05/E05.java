public class E05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 7: ");
        int dayNumber = scanner.nextInt();

       int dayNumber = scanner.nextInt();

        // Validate the input range (1-7)
        if (dayNumber >= 1 && dayNumber <= 7) {
            
            String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
            String day = daysOfWeek[dayNumber - 1];

            // Print the result
            System.out.println("The day corresponding to " + dayNumber + " is: " + day);
        } else {
            // Invalid input
            System.out.println("Only 7 days in a week");
        }
    }
}
