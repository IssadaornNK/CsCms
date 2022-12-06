import java.util.Scanner;
public class diy1{
    public static void main(String[]args){
        int i;
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int total = a;
        for(i=a+1;i<=a+5;i++){
            if(i%13==0){
                total -= i;
            }
            else{
                total += i;
            }
        }
       System.out.println (total); 
    }
}