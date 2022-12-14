import java.util.*;
public class avg{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int arr[][] = new int[row][column];
        double result1 [] = new double[row];
        double result2 [] = new double[column];
        for (int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                result1[i] += arr[i][j];
            }
            result1[i] /= column;
        }
        for(int i=0;i<column;i++){
            for(int j=0;j<row;j++){
                result2[i] += arr[j][i];
            }
            result2[i] /= row;
        }
        System.out.println("Average of each row:");
        for(int i=0;i<result1.length;i++){
            System.out.printf("%.2f", result1[i]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("Average of each column:");
        for(int i=0;i<result2.length;i++){
            System.out.printf("%.2f", result2[i]);
            System.out.print(" ");
        }
    }
}