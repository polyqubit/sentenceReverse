import java.util.Scanner;

public class starter {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a group of words, separated by a space");
		String inp = sc.nextLine();
		System.out.println("\n"+inp+"\n");
		inp = inp.trim();
		int check = 0;
   		 char store = ' ';
    		for(int i=0;i<inp.length();i++) {
        		if(inp.charAt(i)==' ') {check++;}
    		}
		for(int i=0;i<check-1;i++) {
      			int L = inp.lastIndexOf(" "); //last index of whitespace
      			System.out.println(L);
			String block = inp.substring(L);
			inp = inp.substring(0,L) + block;
		}
    		System.out.println(inp);
	}
	
}
