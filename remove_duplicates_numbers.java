import java.util.*;
public class remove_duplicates_numbers {
	public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      String n=scan.next();
      String str="";
      char ch[]=n.toCharArray();
      for(int i=0;i<ch.length;++i){
    	  if(!str.contains(ch[i]+"")){
    		  str=str+ch[i];
    	  }
      }
      System.out.println(str);
	}

}
