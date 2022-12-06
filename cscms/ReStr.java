import java.util.Scanner;
public class Main{
	public static String binary(int a){
       if(a==1){
        return "1";
       }
       return binary(a/2) + a%2;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String ans = binary(a);
		System.out.println(ans);
	}
}

