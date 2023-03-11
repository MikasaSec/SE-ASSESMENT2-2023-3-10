import java.util.Scanner;

public class PartTimeTeacher extends User{


    private int teacherid;
    private String teachername;
    private String nativelanguage;
    private int teachinglevel;
    private int studentaffinity;
    private int studytime;



    public void login() {
        System.out.println("PartTime teacher login");
        System.out.println("Please input your CourseDirector ID");
        Scanner input = new Scanner(System.in);
        int Id = input.nextInt();
        System.out.println("Please input your Password");
        Scanner String = new Scanner(System.in);
        String password = input.next();
        //加入表单验证
    }

    Training training = Training.getTraining();


    private static PartTimeTeacher partTimeTeacher=new PartTimeTeacher();
    // 构造方法设置为私有
    private PartTimeTeacher(){
    }
    //创建一个方法，返回的就是new创建好的对象
    public static PartTimeTeacher getpartTimeTeacher(){
        return partTimeTeacher;
    }

    public void showmypersonalprofile(){
        System.out.println(teacherid+ '\n'+teachername+'\n'+nativelanguage+
                '\n'+teachinglevel+'\n'+studentaffinity);
    }

    public void takeTraining(){
        System.out.println("Please input your CourseDirector ID");
        Scanner input = new Scanner(System.in);
        int studytime =input.nextInt();
        teachinglevel = training.takeTraining(teachinglevel,studytime);
    }


    public int getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(int teacherid) {
        this.teacherid = teacherid;
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername;
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

    public int getStudytime() {
        return studytime;
    }

    public void setStudytime(int studytime) {
        this.studytime = studytime;
    }

    public static PartTimeTeacher getPartTimeTeacher() {
        return partTimeTeacher;
    }


}
