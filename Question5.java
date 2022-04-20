import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = in.nextInt();

    int[] numbers = new int[num];

    for (int a = 0; a < num; a++) {
        System.out.print("> ");
        int number = in.nextInt();
        numbers[a] = number;
    }

    int[] mode = {0, 0};  // {frequency, number}

    for (int a = 0; a < num; a++) {
        int frequency = 0;
        int number = numbers[a];

        for (int b = a + 1; b < num; b++) {
            int number2 = numbers[b];
            if (number == number2) {
                frequency += 1;
            }
        }

        if (frequency > mode[0]) {
            mode[0] = frequency;
            mode[1] = number;
        }
    }

    System.out.println(mode[1]);
  
  }
}
