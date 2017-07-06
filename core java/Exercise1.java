import java.util.Scanner;
public class Exercise1 {

	public static void main(String args[])
	{
		System.out.println("Enter the String: ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String s = new String (input);
        System.out.println("Enter the Sub-String to be replaced: ");
		String substring = scanner.nextLine();
        System.out.println("Enter the Sub-String to be replaced with: ");
		String newstring = scanner.nextLine();
        String replace = s.replace(substring, newstring);
		System.out.println("New String is: ");
        System.out.println(replace);
	}
}
