import java.util.Scanner;

public class Q6NumberPattern {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int input;

        System.out.print("Enter number: ");
        input = keyboard.nextInt();
        if(input > 0){
            for(int i = 1; i <= input; i++){
                for(int j = 1; j <= i; j++){
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Use positive number please?");
        }
        keyboard.close();
    }
}
