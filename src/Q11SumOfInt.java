public class Q11SumOfInt {

    public static void main(String[] args) {
        int sum = 0;

        for(int i = 100; i <= 200; i++){
            if(i%9 == 0){
                sum += i;
            }
        }
        System.out.printf("\nSum of all integers b/n 100 and 200 that are divisible by 9 is %d\n", sum);
    }
}
