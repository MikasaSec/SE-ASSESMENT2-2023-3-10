public class Training {
    private int trainingId;
    private String trainingName;
    private String trainingDetail;
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

    public int getTrainingId() {
        return trainingId;
    }

    public void setTrainingId(int trainingId) {
        this.trainingId = trainingId;
    }

    public String getTrainingName() {
        return trainingName;
    }

    public void setTrainingName(String trainingName) {
        this.trainingName = trainingName;
    }

    public String getTrainingDetail() {
        return trainingDetail;
    }

    public void setTrainingDetail(String trainingDetail) {
        this.trainingDetail = trainingDetail;
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
}
