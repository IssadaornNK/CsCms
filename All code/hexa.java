import java.util.Scanner;
public class hexa{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int x=0;
        int sum = 0;
        for(int i=0;i<input.length();i=i+2){
            String ch = input.substring(i,i+2);
            x = Integer.valueOf(ch,16);
            //System.out.println(x);
            sum += x;
        }System.out.println(sum);
        
    }
}