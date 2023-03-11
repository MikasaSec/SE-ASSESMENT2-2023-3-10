import java.util.Scanner;

public class UserAction {
        public static void main(String[] args) {
            CourseRequirements courseRequirements = CourseRequirements.getcourseRequirements();

            System.out.println("Welcome to login!" + '\n' + "CourseDirector type 1"
                    + '\n' +"Administrator type 2" + '\n' + "PartTimeTeacher type 3");
            Scanner input = new Scanner(System.in);
            int typeId = input.nextInt();
            Master master = new Master();
            User user = master.getUser(typeId);
            if (user != null) {
                user.login();
                master.run(user);
            }

            if (courseRequirements != null) {
                System.out.println("set Successfully!Now Quit");
                System.out.println("Administrator login to check news");
                User user1 = master.getUser(2);
                if (user1 != null) {
                    user1.login();
                    master.run(user1);
                }
            }
        }
}
