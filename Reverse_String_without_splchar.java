import java.util.*;
public class Reverse_String_without_splchar {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		char ch[]=str.toCharArray();
		String str1=" ";
		String str3="";
		String sss="";
		int i;
		for(i=0;i<ch.length;i++){
			if((ch[i]>='a' && ch[i]<='z') || (ch[i]>='A' && ch[i]<='Z')){
				str1+=String.valueOf(ch[i]);
			}
		}
		StringBuffer str2=new StringBuffer(str1);
		str3=str2.reverse().toString();
		System.out.print(str3);
		char[] ch1=str3.toCharArray();
		for(int k=0;k<str.length();k++){
			if(Character.isAlphabetic(ch1[k])){
				sss+=ch1[k];
			}else{
				sss+=str.charAt(i);
			}
			System.out.println(sss);
		}
	}

}
//error
