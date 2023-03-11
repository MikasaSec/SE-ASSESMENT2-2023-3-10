import java.util.Scanner;

public class Administrator extends User{
    public void login(){
        System.out.println("Administrator login");
        System.out.println("Please input your Administrator ID");
        Scanner input=new Scanner(System.in);
        int Id=input.nextInt();
        System.out.println("Please input your Password");
        Scanner String=new Scanner(System.in);
        String password=input.next();
        //加入表单验证
    }
    CourseRequirements courseRequirements = CourseRequirements.getcourseRequirements();
    String courseName = courseRequirements.getCourseName();
    String start_time = courseRequirements.getStart_time();
    String duration = courseRequirements.getDuration();
    String nativelanguage = courseRequirements.getNativelanguage();
    int teachinglevel = courseRequirements.getTeachinglevel();
    int studentaffinity = courseRequirements.getStudentaffinity();
    int courseDirectorId = courseRequirements.getCourseDirectorId();
    String courseDirectorName = courseRequirements.getCourseDirectorName();


    public void showCourseRequirements(){
        System.out.println(courseName+ '\n'+start_time+'\n'+duration+'\n'
                +nativelanguage+'\n'+teachinglevel+'\n'+studentaffinity+'\n'
                +courseDirectorId+'\n'+courseDirectorName);
    }
    public void selectPartTimeTeacher(){

    }
    public void selectTrainingTeacher(){

    }

}
