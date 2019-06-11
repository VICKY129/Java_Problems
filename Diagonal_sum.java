import java.util.*;
public class Diagonal_sum {

	public static void main(String[] args) {
		int k=0,l=0;
		int arr[][]={{1,2,3,4},{4,5,6,7},{7,8,9,10}};  
		for(int i=0;i<arr.length;i++){
				k+=arr[i][i];
		}
		for(int j=0,i=3;j<arr.length;){
				l+=arr[j++][i--];
		}
		System.out.println(k-l);
	}

}
