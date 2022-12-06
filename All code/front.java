import java.util.*;
class front{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().toLowerCase();
        String s2 = sc.nextLine().toLowerCase();
        boolean x = false;
        boolean y = false;
        for(int i=0;i<s1.length()/2;i=i+s2.length()){
            String check = s1.substring(i, i+s2.length()-1);
            if(s2.equals(check)){
                x = true;
            }
        }
        for(int i=s1.length();i>s1.length()/2;i=i+s2.length()){
            String check = s1.substring(i, i+s2.length()-1);
            if(s2.equals(check)){
                x = true;
            }
        }
        if(x==true){
            System.out.println("Front");
        }
    }
}