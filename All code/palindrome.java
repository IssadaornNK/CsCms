import java.util.*;
public class palindrome{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String check = "";
        for (int i = inp.length() - 1;i >= 0 ; i--){
            check += inp.charAt(i);
        }
        if(inp.equals(check)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        /*boolean x = false;
        for(int i=0;i<inp.length();i++){
            for(int j=inp.length()-1;j>0;j--){
                if(inp.charAt(i)==inp.charAt(j)){
                    x = true;
                }
            }
        } 
        if(x==true){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }*/

    }
}