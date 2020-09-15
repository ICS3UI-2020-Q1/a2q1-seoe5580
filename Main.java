import java.util.Scanner;

/**
 * To identify if the number is odd or even
 * @author Eric Seo
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Creat a Scanner for user input
    Scanner input = new Scanner(System.in);

    // Asks the user to input a number
    System.out.println("Please enter an integer:");

    // gets the number from the user
    int number = input.nextInt();

    // identifies if a number is odd
    final int odd = 1;

    // identifies if number is even or odd
    if (number % 2 == odd){
    // tells the user the number is odd
    System.out.println(number + " is an odd number");
    } else {
    System.out.println(number + " is an even number");
    }
    
  }
}
