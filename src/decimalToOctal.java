import java.util.Scanner;

public class decimalToOctal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rem,temp=1,oct=0;

        while(num!=0){
            rem=num%16;
            oct=oct+rem*temp;
            temp=temp*10;
            num=num/8;
        }
        System.out.println(oct);

    }
}
