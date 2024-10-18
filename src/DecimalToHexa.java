import java.util.Scanner;

public class DecimalToHexa {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int dec_num, rem;
        dec_num = in.nextInt();

        String hexdec_num = " ";
        char hex[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        while (dec_num != 0) {
            rem = dec_num % 16;
            hexdec_num = hex[rem] + hexdec_num;
            dec_num = dec_num / 16;
        }


        System.out.print("Hexadecimal number is: " + hexdec_num );
    }
}