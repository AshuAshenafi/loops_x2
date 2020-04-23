import java.util.Scanner;

public class Q9Palindrome {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int input;
        int r;
        int sum = 0;
        int temp;
        int num;


        System.out.print("Enter number: ");
        input = keyboard.nextInt();
        num = input;
        if (input > 0) {
            temp = input;
            while(input > 0){
                r = input % 10;  //getting remainder
                sum = (sum * 10) + r;
                input = input /10;
            }
            if(temp == sum)
                System.out.printf("%d is a palindrome.", num);
            else
                System.out.printf("%d is not a palindrome.", num);
        }
        else {
            System.out.println("Use positive number please?");
        }
        keyboard.close();
    }
}
