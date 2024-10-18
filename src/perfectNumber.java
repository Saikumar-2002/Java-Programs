import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum;
        sum = 0;
        for(int i=1;i<num;i++) {

            if (num % i == 0) {
                sum = sum + i;

            }

        }
            if (sum == num) System.out.println("It is a perfect number");
            else System.out.println("Not a perfect number");
        }
    }
