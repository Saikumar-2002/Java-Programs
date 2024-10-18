public class BinaryToDecimal{
    public static void main(String[] args){
        int num=6;
        int sum;
        sum=0;
        for(int i=0;i<num;i++){
            if(num%i==0){
                sum=sum+i;

            }
        }
        if(sum==num)System.out.println(num);
    }
}