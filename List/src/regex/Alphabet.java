package regex;
import java.util.regex.Pattern;
import java.util.Scanner;
public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String alphabet=sc.next();
		String pattern="((?=.*[a-z])(?=.*[0-9])(?=.*[A-Z]).{6,})";
		if(alphabet.matches(pattern))
		{
			System.out.println("Valid message");
		}
		else
		{
			System.out.println("Invalid message");
		}

	}

}
