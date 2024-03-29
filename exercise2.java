import java.util.Scanner;

public class exercise2 {
    static Scanner input = new Scanner(System.in);

    public static void main(String [] args) throws Exception {
        
        takeExam("drive");
        input.close();
    }

    static void takeExam(String drive) throws Exception {
        System.out.println("Training...");
        test(drive);

        String feedback = getFeedback(drive);

        // base
        if (feedback.equals("failed")) {
            practice(drive);
            takeExam(drive);
        } else if (feedback.equals("passed")) {
            pass(drive);
        }
    }

    static void test(String drive) {
            System.out.println("Taking exam");
        }

    static String getFeedback(String drive) {
        System.out.print("Did I " + drive + " well? (Enter \"failed\" or \"passed\") ");
        String feedback = input.next();
        return feedback;
    }
    
    static void practice(String drive) {
        System.out.print("What skill would you like to improve? ");
        String skill = input.next();
        System.out.println("Practicing " + skill + " skill");
    }

    static void pass(String drive) {
        System.out.println("You have successfully learned how to " + drive + ". Exam passed!");
    }
}
