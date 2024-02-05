import java.util.Scanner;

public class Switch {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Loop to keep asking for input until the user decides to exit
    while (true) {
      System.out.println("Enter a day (1-7, 0 to exit): ");
      int day = scanner.nextInt();

      // Check for the exit condition
      if (day == 0) {
        System.out.println("Exiting the program. Goodbye!");
        break;
      }

      // Switch statement to print the corresponding day
      switch (day) {
        case 1:
          System.out.println("Monday");
          break;
        case 2:
          System.out.println("Tuesday");
          break;
        case 3:
          System.out.println("Wednesday");
          break;
        case 4:
          System.out.println("Thursday");
          break;
        case 5:
          System.out.println("Friday");
          break;
        case 6:
          System.out.println("Saturday");
          break;
        case 7:
          System.out.println("Sunday");
          break;
        default:
          System.out.println("Invalid day. Please enter a number between 1 and 7.");
      }
    }

    // Close the Scanner to release resources
    scanner.close();
  }
}
