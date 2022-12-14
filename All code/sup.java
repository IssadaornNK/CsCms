import java.util.*;
public class sup{
    public static long sumup(long num){
        if(num!=0){
            return num%10 + sumup(num/10);
        }
        else {
            return num;
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long sum = sumup(num);
        /*while(num>0){
            digit = num%10;
            sum += digit;
            num=num/10;
        }*/
        System.out.print(sum);
    }
}