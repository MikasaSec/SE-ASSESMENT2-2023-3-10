public class PartTimeTeacher{
    private String skills;
//    private String recruiterName;
//    private int recruiterId;
    private double salary;

    Training training = Training.getTraining();

    private static PartTimeTeacher partTimeTeacher=new PartTimeTeacher();
    // 构造方法设置为私有
    private PartTimeTeacher(){
    }
    //创建一个方法，返回的就是new创建好的对象
    public static PartTimeTeacher partTimeTeacher(){
        return partTimeTeacher;
    }

    public void createRequest(){

    }
    public void showTimetable(){

    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

//    public String getRecruiterName() {
//        return recruiterName;
//    }
//
//    public void setRecruiterName(String recruiterName) {
//        this.recruiterName = recruiterName;
//    }
//
//    public int getRecruiterId() {
//        return recruiterId;
//    }
//
//    public void setRecruiterId(int recruiterId) {
//        this.recruiterId = recruiterId;
//    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
