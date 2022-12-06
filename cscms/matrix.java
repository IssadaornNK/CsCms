import java.util.*;
public class matrix{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int arr1[][] = new int[x1][y1]; 
        int arr2[][] = new int[x2][y2];
        int result = 1;
        for(int i =0;i<x1;i++){
            for(int j=0;j<y1;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        for(int i =0;i<x2;i++){
            for(int j=0;j<y2;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        if(y1!=x2){
            System.out.println("Invalid");
        }
        else if(y1==x2){
            for(int i=0;i<x1;i++){
                for(int j=0;j<y2;j++){
                    int x=0;
                    for(int k=0;k<y1;k++){
                        result = arr1[i][k]*arr2[k][j];
                        x += result;
                    }
                    System.out.println(x+" ");
                }
            }
        }
    }
}