import java.util.*;
public class cs{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int column = sc.nextInt();
        int row = sc.nextInt();
        int arr[][] = new int[column][row];
        int i,j,k,l;
        int result[] = new int[column];
        int total=0;
        boolean x = false;
        for(i=0;i<column;i++){
            for(j=0;j<row;j++)  
              arr[i][j]=sc.nextInt(); 
        }for(k=0;k<column;k++){
            total = 0;  
            for (l=0;l<row;l++){
            total += arr[k][l];   
            }
            result[k]=total;
        }for(int m=1;m<column;m++){
            if(result[m]==result[m-1]){
                x = true;
            }
        }if(x==true){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}