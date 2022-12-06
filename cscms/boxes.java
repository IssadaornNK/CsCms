import java.util.*;
class boxes{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int arr1[] = new int[3];
        int arr2[] = new int[3];
        for(int i=0; i<3; i++)  {    
            arr1[i]=sc.nextInt();  
        }   
        for(int i=0; i<3; i++)  {    
            arr2[i]=sc.nextInt();  
        }   
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        //System.out.println(Arrays.toString(arr1));
        //System.out.println(Arrays.toString(arr2));
        int x = 0;
        for(int i=0;i<3;i++){
            if(arr2[i]>=(arr1[i])){
                x++;
            }
        }
        if(x==3){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}