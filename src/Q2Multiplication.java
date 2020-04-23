import java.util.Scanner;

public class Q2Multiplication {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int input;

        System.out.print("Enter number: ");
        input = keyboard.nextInt();

                for(int i = 1; i <= 10; i++){
                    System.out.printf("%d x %d = %d",i, input, (i * input));
                    System.out.println();
                }
        keyboard.close();
        }
    }