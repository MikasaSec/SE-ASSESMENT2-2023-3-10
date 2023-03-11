import java.util.Scanner;

public class UserAction {
        public static void main(String[] args) {
            System.out.println("Welcome!");
            System.out.println("type 1 to Register or type 2 to login");
            Scanner input = new Scanner(System.in);
            int typeId = input.nextInt();

            Master master = new Master();
            User user = master.getUser(typeId);

            if (user != null) {
                user.login();

                master.run(user);
            }
        }
}
