import java.util.*;
public class Diamond_Pattern {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=0;i<n;i++){
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
			for(int k=n;k>=i;k--){
				System.out.print(" ");
			}
		}
		for(int i=1;i<=n;i++){
			for(int j=i;j<=n;j++){
				System.out.print("* ");
			}
			System.out.println();
			for(int k=-1;k<=i;k++){
				System.out.print(" ");
			}
		}
	}

}
