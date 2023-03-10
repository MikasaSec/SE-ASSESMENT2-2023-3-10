import java.util.List;

public class CourseDirector extends User{

    Course course = Course.getcourse();


    public void createCourse(){
        course.setCourseId(1);
        course.setCourseName("VLSI");
        course.setStart_time("1 hour");
        course.setDuration("1 semester");
        course.setRequirements("Major in CSE");
        course.setDetails("A useful design course");
        course.setCourseDirectorId(1);
        course.setCourseDirectorName("Jack");
        course.setBudget(20000);
    }
    public void updateCourse(){
        course.setCourseId(1);
        course.setCourseName("VLSI2");
        course.setStart_time("2 hour");
        course.setDuration("1 semester");
        course.setRequirements("Major in CSE");
        course.setDetails("A useful design course");
        course.setCourseDirectorId(1);
        course.setCourseDirectorName("Jack");
        course.setBudget(20000);
    }
}
