import java.util.Scanner;

public class Objective5Lab4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter a number: ");

    int num = scanner.nextInt();
    scanner.nextLine();

    if(num % 2 == 0) {
      System.out.println("The number is even");
    }
    else if(num % 2 == 1) {
      System.out.println("The number is odd");
    }
  }
}
