import java.util.Scanner;

public class starter {
	static void p(String s) {System.out.print(s);}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		p("Enter a group of words, separated by a space\n");
		String inp = sc.nextLine().trim();
		p("\n"+inp+"\n\n");
		int F = inp.indexOf(" ");
		String fin = new String("");
		while(true) {
			if(!inp.contains(" ")) {fin = inp + " " + fin; break;}
			if(inp.substring(0,F).trim()!=""){fin = inp.substring(0,F).trim() + " " + fin;}
			inp = inp.substring(F);
			F = inp.indexOf(" ")+1;
			p(inp+"-----"+fin+"\n");
		}
		fin = fin.replaceAll("\\s+"," "); //replaces any double spaces
    	p("\n\n"+fin);
	}
}
/*** Main idea:
The input is generally structured something like 
wordA wordB wordC
1     2     3
To reverse the word order means reversing their position order, which I did by
copying each word over to a new string. The program reads the leftmost word in
the string, and inserts words at the beginning of the string copy. After one
insertion, the leftmost word is trimmed from the original string and the next
word is read.
String      NewString
"1 2 3"		""
"2 3"		"1"
"3"			"2 1"
"3"			"3 2 1"
Note that this is not exactly how my program works, due to not wanting to think
too hard about indices and such. You will find on line 19 a replaceAll call. This
is to remove any double spaces(such as "2  1") caused by bad programming.

***/