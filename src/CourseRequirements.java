public class CourseRequirements {

    private String courseName;
    private String start_time;
    private String duration;
    private String nativelanguage;
    private int teachinglevel;
    private int studentaffinity;
    private int courseDirectorId;
    private String courseDirectorName;

    private static CourseRequirements courseRequirements=new CourseRequirements();

    // 构造方法设置为私有
    private CourseRequirements(){
    }
    //创建一个方法，返回的就是new创建好的对象
    public static CourseRequirements getcourseRequirements(){
        return courseRequirements;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getNativelanguage() {
        return nativelanguage;
    }

    public void setNativelanguage(String nativelanguage) {
        this.nativelanguage = nativelanguage;
    }

    public int getTeachinglevel() {
        return teachinglevel;
    }

    public void setTeachinglevel(int teachinglevel) {
        this.teachinglevel = teachinglevel;
    }

    public int getStudentaffinity() {
        return studentaffinity;
    }

    public void setStudentaffinity(int studentaffinity) {
        this.studentaffinity = studentaffinity;
    }

    public int getCourseDirectorId() {
        return courseDirectorId;
    }

    public void setCourseDirectorId(int courseDirectorId) {
        this.courseDirectorId = courseDirectorId;
    }

    public String getCourseDirectorName() {
        return courseDirectorName;
    }

    public void setCourseDirectorName(String courseDirectorName) {
        this.courseDirectorName = courseDirectorName;
    }

    public static CourseRequirements getCourseRequirements() {
        return courseRequirements;
    }


}
