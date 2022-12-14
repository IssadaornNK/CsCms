import java.util.*;

public class arrcopy {
    public static void main(String[]args){
      Scanner in = new Scanner(System.in);
      String input = in.next();
      char a[] = new char[input.length()];
      for(int i=0;i<input.length();i++){
          a[i]=input.charAt(i);
      }
      int x = a.length;
      if(a.length%2!=0) {
          x = x + 1;
          char[] first = Arrays.copyOfRange(a, 0, (x - 1) / 2);
          char[] last = Arrays.copyOfRange(a, x / 2, x - 1);
          for (int j = first.length - 1; j >= 0; j--) {
              System.out.print(first[j]);
          }
          System.out.print(a[a.length / 2]);
          for (int k = last.length - 1; k >= 0; k--) {
              System.out.print(last[k]);
          }
      }else{
          char[] fi = Arrays.copyOfRange(a, 0, a.length/2);
          char[] la = Arrays.copyOfRange(a, a.length/2, a.length);
          for (int j = fi.length - 1; j >= 0; j--) {
              System.out.print(fi[j]);
          }for (int k = la.length - 1; k >= 0; k--) {
              System.out.print(la[k]);
          }
      }
  }
}