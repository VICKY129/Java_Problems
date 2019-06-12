import java.util.*;
public class Watermelon {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int x=0;
		if(a>100){
			System.out.println("Invalid");
		}else{
			if(a%2!=0){
				System.out.println("No");
			}else{
				x=a/2;
				System.out.println("Yes");
				if(x%2==0){
					System.out.println(a+" "+a);
				}else{
					System.out.println(x-1+" "+(x+1));
				}
			}
		}
	}

}
