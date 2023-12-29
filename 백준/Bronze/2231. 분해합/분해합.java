import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        for(int i = 1; i <= n; i++){
            int sum = i;
            int test = i;
            while(test > 0){
                sum += test % 10;
                test /= 10;
            }
            if(sum == n){
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}