import java.util.Scanner;

public class starter {
	//finds second last occurence of character
	static int sL(String s, char c, int index) {
		int check = 0;
		for(int i=index;i>-1;i--) {
        	if(s.charAt(i)==c) {check++;}
			if(check>1) {return i;}
    	}
		return s.lastIndexOf(c);
	}
	//second...first?
	static int SF(String s, char c) {
		int check = 0;
		for(int i=0;i<s.length();i++) {
        	if(s.charAt(i)==c) {check++;}
			if(check>1) {return i;}
    	}
		return s.indexOf(c);
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a group of words, separated by a space");
		String inp = sc.nextLine();
		System.out.println("\n"+inp+"\n");
		inp = inp.trim();
		int check = 0;
		int F = inp.indexOf(" ");
		int L = inp.lastIndexOf(" ");  //last index of whitespace
		int SL = sL(inp,' ',L-1); //second to last index
		int fbm = 0;
		int pbm = inp.substring(SL+1,L).length(); //previous block measurement
   		char store = inp.charAt(L+1);
		String ss = new String(inp);
		String fin = new String("");
    	for(int i=0;i<inp.length();i++) {
        	if(inp.charAt(i)==' ') {check++;}
    	}
		for(int i=0;i<check;i++) {
			fbm = inp.substring(0,F).length();
			fin = fin + inp.substring(0,fbm);
			inp = inp.substring(fbm);
			F = inp.indexOf(" ");
      		// L = inp.lastIndexOf(" ");
			// SL = sL(inp,' ',L-1);
			// pbm = inp.substring(SL+1,L).length;
      		// System.out.println(L);
			// String block = inp.substring(L);
			// inp = inp.substring(0,L) + block;
		}
    	System.out.println(inp);
	}
	
}
