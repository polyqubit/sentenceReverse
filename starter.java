import java.util.Scanner;

public class starter {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a group of words, separated by ");
		String inp = sc.nextLine();
		//extract individual word blocks
		System.out.println(inp);
		int L = inp.lastIndexOf(" "); //last index of whitespace
		inp = inp.trim();
		boolean check = false;
		while(!check) {
			String block = inp.substring(L);
			inp = inp.substring(L+1);
			
		}
	}
	
}
