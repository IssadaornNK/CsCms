import java.util.*;
class rec3{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int j=0;j<a;j++){
        	if(j==0||j==a-1){
            System.out.print("-");
           }
        	else{
            System.out.print("*");
            }
        }
        System.out.println();
        for(int i=0;i<a-2;i++){
            for(int k=0;k<a;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int j=0;j<a;j++){
            if(j==0||j==a-1){
            System.out.print("-");
           }
        	else{
            System.out.print("*");
            }
        }
    }
}