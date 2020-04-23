import java.util.Scanner;

public class Q9Display1And0 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int input;


        System.out.print("Enter number: ");
        input = keyboard.nextInt();
        if (input > 0) {
            int n = input;
            int i = 1;
            int b = 1;
            while(i <= n)
            {
                int count = 1;
                b=i;
                while(count <= i)
                {
                    if (b % 2 != 0) {
                        System.out.print("1");//for printing 1
                    } else if (b % 2 == 0) {
                        System.out.print("0");//for printing 2
                    }
                    count++;
                    b++;
                }
                System.out.println();
                i++;
            }

        } else {
            System.out.println("Use positive number please?");
        }
        keyboard.close();
    }
}
