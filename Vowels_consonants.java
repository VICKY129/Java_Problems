import java.util.*;
public class Vowels_consonants {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		char []ch=str.toCharArray();
		String v="",c="",n="";
		for(int i=0;i<ch.length;i++){
		if((ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u') ||
				(ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U')){
			v=v+String.valueOf(ch[i]);
		}else if(!(Character.isDigit(ch[i]))&& (Character.isAlphabetic(ch[i]))){
			c+=String.valueOf(ch[i]);
		}else if(!(Character.isAlphabetic(ch[i]))){
			n+=String.valueOf(ch[i]);
		}
		}
		int t=scan.nextInt();
		System.out.println("1.Vowels:"+v);
		System.out.println("2.Consonents:"+c);
		System.out.println("3.Invalid:"+n);
		switch(t){
		case 1:
			System.out.println(v.toUpperCase());
			break;
		case 2:
			System.out.println(c.toUpperCase());
		case 3:
			System.out.println(n);
		}
		
	}

}
