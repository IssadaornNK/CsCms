import java.util.*;
class rec4{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int j=0;j<b;j++){
            System.out.print("*");
        }
        System.out.println();
        for(int i=0;i<a-2;i++){
            System.out.print("*");
            for(int k=0;k<b-2;k++){
                System.out.print("-");
            }
            System.out.print("*");
            System.out.println();
        }
        for(int j=0;j<b;j++){
            System.out.print("*");
        }
    }
}