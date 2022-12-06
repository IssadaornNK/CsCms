import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int arr1[] = new int[size];
    for(int i=0; i<size; i++)  {    
      arr1[i]=sc.nextInt();  
    }   
    Arrays.sort(arr1);
    int[] a1 = Arrays.copyOfRange(arr1, 0, arr1.length/2);
    int[] a2 = Arrays.copyOfRange(arr1, arr1.length/2, arr1.length);
    int y = a2.length-1,z = 0;
        if(i%2==0){
          System.out.print(a2[y]+" ");
          y--;
        }else{
          System.out.print(a1[z]+" ");
          z++;
        }
    }
  }