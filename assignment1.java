import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class assignment1 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		
        // email
	System.out.print("Enter student email: ");
        String studentEmail = scan.nextLine();

        Pattern pattern = Pattern.compile("\\w+@students.national-u.edu.ph");
        Matcher matcher = pattern.matcher(studentEmail);

        boolean match = matcher.matches();

        if (match) {
            System.out.println("valid student email");
        } else {
            System.out.println("invalid student email");
        }
        
        // cellphone number
        System.out.print("Enter cellphone number: ");
        String cellNum = scan.nextLine();

        Pattern pattern2 = Pattern.compile("\\+63\\d{9}");
        Matcher matcher2 = pattern.matcher(cellNum);

        boolean match2 = matcher.matches();

        if (match2) {
            System.out.println("valid cellphone number");
        } else {
            System.out.println("invalid cellphone number");
        }
        
	// birthdate
	System.out.print("Enter birthdate: ");
        String birthdate = scan.nextLine();

        Pattern pattern3 = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");
        Matcher matcher3 = pattern.matcher(birthdate);

        boolean match3 = matcher.matches();

        if (match3) {
            System.out.println("valid birthdate");
        } else {
            System.out.println("invalid birthdate");
        }
        
        scan.close();
	}
}
