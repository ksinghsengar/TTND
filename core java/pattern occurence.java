import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Exercise2 {

	public static void main(String args[]) {
		System.out.println("Enter the String: ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] str1 = input.split("\\s");
		/*String s = new String (input);
        System.out.println("Enter the string to be searched: ");*/
		for (int i = 0; i < str1.length; i++) {
			int count = 0;
			for (int j = i + 1; j < str.length; j++) {
		/*String str = scanner.nextLine();
		int i = 0;*/

				Pattern p = Pattern.compile(str1[i]);
				Matcher m = p.matcher(str[j]);
				while (m.find()) {
					count++;
					input.replace(str1[i], "");
				}
			}
			System.out.println("Number of occurences of string " + s + " is :" + i);

		}
	}
}

