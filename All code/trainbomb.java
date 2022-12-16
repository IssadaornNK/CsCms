import java.util.*;
public class trainbomb{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int cart = sc.nextInt();
        int bomb = sc.nextInt();
        int[] a = new int[cart];
        //int count = 0;
        if(bomb!=1&&bomb!=cart){
            a[bomb]=0;
            a[bomb-1]=0;
            a[bomb+1]=0;
        }
        else if(bomb==1){
            a[bomb]=0;
            a[bomb+1]=0;
        }
        else if(bomb==cart){
            a[bomb]=0;
            a[bomb-1]=0;
        }
        for(int i=0;i<cart;i++){
            if(a[i]!=0){
                System.out.print(a[i]+" ");
            }
        }
    }
}