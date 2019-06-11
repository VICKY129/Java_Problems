import java.util.*;
public class Alpha_Pattern {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=0;i<=n;i++){
			int a=64+i;
			char ch=(char)a;
			for(int j=0;j<i;j++){
				System.out.print(ch);
			}
			System.out.println();
		}
		/*
		String arr="ABCDEFGHIIJKLMNOPQWRSTUVWXYZ";
		int a=0;
		for(int i=1;i<=n;i++){
			for(int j=0;j<i;j++){
				System.out.print(arr.charAt(a));
				
			}
			System.out.println();
			a+=1;
		}
		*/
	}

}
