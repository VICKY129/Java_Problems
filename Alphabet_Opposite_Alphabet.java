import java.util.*;
public class Alphabet_Opposite_Alphabet {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str="abcdefghijklmnopqrstuvwxyz";
		String s1=scan.next();
		char ch=s1.charAt(0);
		int n=str.indexOf(ch);
		System.out.println(str.charAt(25-n));
	}

}
