import java.util.*;
public class SmallestSubstring {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String str=scan.next();
	char ch[]=str.toCharArray();
	String s="";
	for(int i=0;i<ch.length;i++) {
		for(int j=i+1;j<ch.length;j++) {
			if(ch[i]==ch[j]) {
				ch[j]=' ';
			}
		}
	}
	s=new String(ch);
	s=s.replace(" ", "");
	System.out.println(s.length());
}
}
