import java.util.*;
class Jin{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int stop = sc.nextInt();
        int total = start;
        for(int i=start+1;i<=stop;i++){
            total += i;
        }
        System.out.println(total);
    }
}