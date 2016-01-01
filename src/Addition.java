/**
 * Created by amcclay on 1/1/16.
 */

import java.util.Scanner;


public class Addition {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int value1, value2;
        int sum;

        System.out.println("Enter the first Integer");
        value1 = input.nextInt();

        System.out.println("Enter the Second Integer");
        value2 = input.nextInt();

        sum = value1 + value2;

        System.out.printf("Sum is %d%n%n", sum);


    }
}
