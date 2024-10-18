import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int temp=1,bin=0,rem;
        while(num!=0){
            rem=num%2;
            bin=bin+temp*rem;
            temp=temp*10;
            num=num/2;

        }
        System.out.println(bin);
    }
}