import java.util.*;
class Main{
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int num[] = new int[size];
    for(int i=0; i<size; i++)  {    
        num[i]=sc.nextInt();  
      } 
    int n = 0;
    for(int j = 0;j<size;j++){
        for(int k=0;k<num[j];k++){
            if(num[j]%k==0){
                n++;
            }
        }
        System.out.println(n);
        n = 0;
    } 
}
}
