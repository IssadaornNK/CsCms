import java.util.Scanner;
public class dnarna{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        String rna = in.nextLine();
        rna = rna.replace("T","U");
        int count = 0;
        boolean x = false;
        for(int i = 0;i < rna.length();i=i+3){
            String check = rna.substring(i,i+3);
            if("AUG".equals(check)){
                x = true;
            }
            if()
        }
            System.out.println(count);
    }
}
//UAG UAA UGA