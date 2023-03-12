import java.util.Scanner;

public class UserAction {
        public static void main(String[] args) {
            CourseRequirements courseRequirements = CourseRequirements.getcourseRequirements();

            //user login, obtain user's ID
            System.out.println("Welcome!" + '\n' +
                    "Please type in your user ID");
            Scanner input = new Scanner(System.in);
            int typeId = input.nextInt();

            Master master = new Master();
            User user = master.getUserRole(typeId);
            if (user != null) {
                user.login();
                master.run(user);
            }

            if (courseRequirements != null) {
                System.out.println("set Successfully!Now Quit");
                System.out.println("Administrator login to check news");
                User user1 = master.getUserRole(2);
                if (user1 != null) {
                    user1.login();
                    master.run(user1);
                }
            }
        }
}
