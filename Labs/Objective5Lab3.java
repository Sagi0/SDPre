import java.util.Scanner;

public class Objective5Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter a number: ");

    int userNum = scanner.nextInt();
    scanner.nextLine();

    if(userNum>=1) {
      System.out.println("The number is positive");
    }
    else if(userNum<=(-1)) {
      System.out.println("The number is negative");
    }
  }
}
