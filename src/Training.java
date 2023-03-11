public class Training {
    private int trainingteacherId;
    private String trainingteacherName;
    private int teacherId;
    private String teacherName;
    private int adminId;
    private String adminName;

    private static Training training=new Training();
    // 构造方法设置为私有
    private Training(){
    }
    //创建一个方法，返回的就是new创建好的对象
    public static Training getTraining(){
        return training;
    }

    public int takeTraining(int teachinglevel,int studytime){
        teachinglevel = teachinglevel+2*studytime;
        return teachinglevel;
    }

    public int getTrainingteacherId() {
        return trainingteacherId;
    }

    public void setTrainingteacherId(int trainingteacherId) {
        this.trainingteacherId = trainingteacherId;
    }

    public String getTrainingteacherName() {
        return trainingteacherName;
    }

    public void setTrainingteacherName(String trainingteacherName) {
        this.trainingteacherName = trainingteacherName;
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

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public static void setTraining(Training training) {
        Training.training = training;
    }
}
