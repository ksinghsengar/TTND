import java.util.Scanner;
class Exercise4
{
    public static void main(String args[])
    {
        System.out.println("Enter the String");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int strlength =  input.length();
        int lowerChar = 0, upperChar = 0, digit = 0,specialChar = 0;

        for(int i = 0; i < strlength; i++)
        {
            if(Character.isLowerCase(input.charAt(i)))
                lowerChar++;

            else if(Character.isUpperCase(input.charAt(i)))
                upperChar++;

            else if(Character.isDigit(input.charAt(i)))
                digit++;  

            else
                specialChar++;      

        }

        System.out.println("Number of Lower Characters: "+lowerChar);
        System.out.println("Percentage of Lower Characters: "+lowerChar*100.0/strlength+"%");
        System.out.println("Number of Upper Characters: "+upperChar);
        System.out.println("Percentage of Upper Characters: "+upperChar*100.0/strlength+"%");
        System.out.println("Number of Digits: "+digit);
        System.out.println("Percentage of Digits: "+digit*100.0/strlength+"%");
        System.out.println("Number of Special Characters: "+specialChar);
        System.out.println("Percentage of Special Characters: "+specialChar*100.0/strlength+"%");
    }
}