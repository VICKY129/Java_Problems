import java.util.*;
public class OTP {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.err.println("Enter the Name of the account holder:");
		String str=scan.next();
		System.err.println("Enter the Account Number:");
		long Num=scan.nextLong();
		System.err.println("Enter the Type of The Accounts");
		String Acc=scan.next();
		String s=String.valueOf(Num);
		String result="";
		if(str.length()>=2){
			System.out.println("Success.1");
		}else{
			System.out.println("Failed.1");
		}
		if(s.length()==11){
				System.out.println("Success.2");
			}else{
				System.out.println("Failed.2");
			}
		if(Acc.contains("Savings")||Acc.contains("Current")||Acc.contains("Loan")){
				System.out.println("success.3");
				result+=Acc.substring(0,2);
				result+=s.substring(0,1);
				String d=s.substring(0,5);
				int sum=0;
			    for(int i=0;i<d.length();i++){
			    	sum+=Integer.parseInt(String.valueOf(d.charAt(i)));
			    }
				result+=String.valueOf((sum/10)+(sum%10));
				result+=str.substring(0,1);
				String x=s.substring(6,10);
				int mus=0;
				for(int i=0;i<x.length();i++){
			    	mus+=Integer.parseInt(String.valueOf(x.charAt(i)));
			    }
				result+=String.valueOf((mus/10)+(mus%10));
				result+=str.substring(str.length()-1);
				result+=s.substring(s.length()-1);
				
		}else{
			System.out.println("Failed");
		}
		System.out.println(result);
	}
	

}
