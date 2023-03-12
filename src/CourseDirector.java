import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CourseDirector extends User {



    CourseRequirements courseRequirements = CourseRequirements.getcourseRequirements();


    public void createCourseRequirements() {
        Scanner a = new Scanner(System.in);

        System.out.println("Input your course requirements:");
        System.out.println("Input course Name:");

        String courseName = a.nextLine().replaceAll(" ", "");
        courseRequirements.setCourseName(courseName);

        System.out.println("Input start time dd/mm/yyyy");
        Scanner b = new Scanner(System.in);
        String start_time = b.nextLine().replaceAll(" ", "");
        courseRequirements.setStart_time(start_time);

        System.out.println("Input course duration dd/mm");
        Scanner c = new Scanner(System.in);
        String duration = c.nextLine().replaceAll(" ", "");
        courseRequirements.setDuration(duration);

        System.out.println("Input required subject");
        Scanner d = new Scanner(System.in);
        String subject= d.nextLine().replaceAll(" ", "");
        courseRequirements.setSubject(subject);

        System.out.println("Input required teacher's teaching level 1~5");
        Scanner f = new Scanner(System.in);
        String teachinglevel= f.nextLine().replaceAll(" ", "");
        courseRequirements.setTeachinglevel(teachinglevel);

        System.out.println("Input required teacher's student affinity 1~5");
        Scanner g = new Scanner(System.in);
        String studentaffinity= g.nextLine().replaceAll(" ", "");
        courseRequirements.setStudentaffinity(studentaffinity);

        try {
            FileWriter writer = new FileWriter("courses.txt", true);
            writer.write("\n");
            writer.write(courseRequirements.getCourseName() + " ");
            writer.write(courseRequirements.getStart_time() + " ");
            writer.write(courseRequirements.getDuration() + " ");
            writer.write(courseRequirements.getSubject() + " ");
            writer.write(courseRequirements.getTeachinglevel() + " ");
            writer.write(courseRequirements.getStudentaffinity());
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException ex) {
            System.out.println("An error occurred while writing to local file.");
            ex.printStackTrace();
        }

    }
}
