import java.util.ArrayList;

public class Master {
    int roleCode = -1;
    boolean validID = false;

    public User getUserRole(int ID) {
        ArrayList<String> userFile = new ReadWriteFiles().readFile();
        User user = null;
        boolean validID = false;
        for (String contents : userFile) {
            String[] content = contents.split(" ");
            if (content[0].equals(String.valueOf(ID))) {
                validID = true;
                try {
                    int roleCode = Integer.parseInt(content[5]);
                    switch (roleCode) {
                        case 1:
                            user = new CourseDirector();
                            break;
                        case 2:
                            user = new Administrator();
                            break;
                        case 3:
                            user = PartTimeTeacher.getpartTimeTeacher();
                            break;
                        default:
                            System.out.println("Error, we cannot find your role in the system");
                            break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid role code: " + content[5]);
                }
                break;
            }
        }
        if (!validID) {
            System.out.println("The input ID is invalid");
        }
        return user;
    }


    public void login(User user) {
        user.login();
    }

    public void run(User user) {
        if (user instanceof CourseDirector) {
            CourseDirector courseDirector = (CourseDirector) user;
            courseDirector.createCourseRequirements();
        } else if (user instanceof Administrator) {
            Administrator administrator = (Administrator) user;
            administrator.showCourseRequirements();
            administrator.selectPartTimeTeacher();
        } else if (user instanceof PartTimeTeacher) {
            PartTimeTeacher partTimeTeacher = (PartTimeTeacher) user;
//            courseDirector.catchingFlyDisk();
        }
    }
}
