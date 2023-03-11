import java.util.Scanner;

public class CourseDirector extends User {

    public void login() {
        System.out.println("CourseDirector login");
        System.out.println("Please input your CourseDirector ID");
        Scanner input = new Scanner(System.in);
        int Id = input.nextInt();
        System.out.println("Please input your Password");
        Scanner String = new Scanner(System.in);
        String password = input.next();
        //加入表单验证
    }

    CourseRequirements courseRequirements = CourseRequirements.getcourseRequirements();


    public void createCourseRequirements() {
        System.out.println("Please type course Name");
        Scanner a = new Scanner(System.in);
        String courseName = a.next();
        courseRequirements.setCourseName(courseName);

        System.out.println("Please type start time");
        Scanner b = new Scanner(System.in);
        String start_time = b.next();
        courseRequirements.setStart_time(start_time);

        System.out.println("Please type course duration");
        Scanner c = new Scanner(System.in);
        String duration = c.next();
        courseRequirements.setDuration(duration);

        System.out.println("Please type teacher's native language");
        Scanner d = new Scanner(System.in);
        String nativelanguage= d.next();
        courseRequirements.setNativelanguage(nativelanguage);

        System.out.println("Please type courseDirector 's Id");
        Scanner e = new Scanner(System.in);
        int courseDirectorId= e.nextInt();
        courseRequirements.setCourseDirectorId(courseDirectorId);

        System.out.println("Please type teacher's teaching level");
        Scanner f = new Scanner(System.in);
        int teachinglevel= f.nextInt();
        courseRequirements.setTeachinglevel(teachinglevel);

        System.out.println("Please type teacher's student affinity");
        Scanner g = new Scanner(System.in);
        int studentaffinity= g.nextInt();
        courseRequirements.setStudentaffinity(studentaffinity);

        System.out.println("Please type courseDirector's Name");
        Scanner h = new Scanner(System.in);
        String courseDirectorName= h.next();
        courseRequirements.setCourseDirectorName(courseDirectorName);

    }
}
