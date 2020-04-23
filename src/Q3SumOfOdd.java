import java.util.Scanner;

public class Q3SumOfOdd {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int input;
        int sum = 0;

        System.out.print("Enter number: ");
        input = keyboard.nextInt();
        if(input > 0){
            System.out.printf("Sum of Odd nums from 1 to %d are: ", input);
            for(int i = 1; i <= input; i++){
                if(i%2 != 0){
                    sum += i;
                    System.out.print(i);

                    if(i < (input-1)){
                        System.out.print(" + ");
                    }
                }
            }
            System.out.printf(" = %d", sum);
        }
        else if(input == 0){
            System.out.println("Zero is not odd number.");
        }
        else{
            System.out.printf("Sum of Odd nums from 1 to %d are: ", input);
            for(int i = input; i < 0; i++){
                if(i%2 != 0){
                    sum += i;
                    System.out.print(i);

                    if(i < (-1)){
                        System.out.print(" + ");
                    }
                }
            }
            System.out.printf(" = %d", sum);
        }
        keyboard.close();
    }
}
