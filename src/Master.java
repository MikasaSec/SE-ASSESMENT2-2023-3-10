import java.util.ArrayList;

public class Master {
    int roleCode = -1;

    public User getUserRole(String ID) {

        User user = null;

        for (String contents : UserAction.userData) {
            String[] content = contents.split(" ");
            if (content[0].equals(ID)) {
                try {
                    int roleCode = Integer.parseInt(content[content.length-1]);
                    switch (roleCode) {
                        case 1:
                            user = new CourseDirector();
                            break;
                        case 2:
                            user = new Administrator();
                            break;
                        case 3:
                            user = new PartTimeTeacher();
                            break;
                        default:
                            System.out.println("Error, we cannot find your role in the system");
                            break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid role code: " + content[content.length-1]);
                }
                break;
            }
        }

        return user;
    }


    public void run(User user) {
        if (user instanceof CourseDirector) {
            System.out.println("Welcome, CourseDirector");
            CourseDirector courseDirector = (CourseDirector) user;
            courseDirector.createCourseRequirements();
        } else if (user instanceof Administrator) {
            System.out.println("Welcome, Administrator");
            Administrator administrator = (Administrator) user;
            administrator.showCourseRequirements();
            administrator.selectPartTimeTeacher();
        } else if (user instanceof PartTimeTeacher) {
            System.out.println("Welcome, PartTimeTeacher");
            PartTimeTeacher partTimeTeacher = (PartTimeTeacher) user;

        }
    }
}
