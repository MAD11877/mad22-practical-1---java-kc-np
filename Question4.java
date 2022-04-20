import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = in.nextInt();
    int counter = num;

    for (int a = 0; a < num; a++) {
        String line = "";

        for (int b = counter; b > 0; b--) {
            line += "*";
        }

        counter -= 1;
        System.out.println(line);
    }
  }
}
