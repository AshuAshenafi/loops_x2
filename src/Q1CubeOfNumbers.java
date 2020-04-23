import java.util.Scanner;

public class Q1CubeOfNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int cube = 1;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        System.out.println(String.format("%s", "======================================================="));
        System.out.println(String.format("%1s %15s %10s %15s %10s", "|", "Number", "|", "Number Cubed", "|"));
        System.out.println(String.format("%s", "======================================================="));

        if(number < 0) {

            for (int i = number; i < 0; i++) {
                cube = i * i * i;
                System.out.println(String.format("%1s %10s %15s %10s %15s", "|", i, "|", cube, "|"));
                System.out.println(String.format("%s", "_______________________________________________________"));
            }
        }
        else if(number == 0){
                cube = 0;
                System.out.println(String.format("%1s %10s %15s %10s %15s", "|", 0, "|", cube, "|"));
                System.out.println(String.format("%s", "_______________________________________________________"));
        }
        else{
            for(int i=1; i <= number; i++){
                cube = i * i * i;
                System.out.println(String.format("%1s %10s %15s %10s %15s", "|", i, "|", cube, "|"));
                System.out.println(String.format("%s", "_______________________________________________________"));
            }
        }
    }
}
