public class Course {
    private int courseId;
    private String courseName;
    private String start_time;
    private String duration;
    private String requirements;
    private String details;
    private int teacherId;
    private String teacherName;
    private int courseDirectorId;
    private String courseDirectorName;
    private double budget;
    private static Course course=new Course();

    // 构造方法设置为私有
    private Course(){
    }

    //创建一个方法，返回的就是new创建好的对象
    public static Course getcourse(){
        return course;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
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

    public void setStart_time(String start_name) {
        this.start_time = start_time;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
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

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
}
