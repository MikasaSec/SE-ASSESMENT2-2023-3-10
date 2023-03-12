import java.util.ArrayList;
import java.util.Scanner;

public class UserAction {
    //load existing data
    String userDataFilePath = "users.txt";
    String courseDataFilePath = "courses.txt";
    public static ReadWriteFiles readWriteFiles = new ReadWriteFiles();
    public static ArrayList<String> userData = readWriteFiles.readFile("users.txt");
    public static ArrayList<String> courseData = readWriteFiles.readFile("courses.txt");
    public static void main(String[] args) {
        //welcome
        System.out.println("Welcome to Part Time Teacher Management System!");
        String ID;
        String password;

        CourseRequirements courseRequirements = CourseRequirements.getcourseRequirements();
        Master master = new Master();

        //user login, obtain user's ID

        login:
        while (true) {
            Scanner input = new Scanner(System.in);

            //input ID
            System.out.println("Please type in your user ID");
            ID = input.next();

            //input password
            System.out.println("Please type in your password");
            password = input.next();

            if(new Login().validate(ID,password)){
                break login;
            }
        }

        User user = master.getUserRole(ID);
        if (user != null) {
            master.run(user);
        }


    }
}
