import java.io.*;
import java.util.ArrayList;
import java.util.List;
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

    PartTimeTeacher partTimeTeacher = PartTimeTeacher.getpartTimeTeacher();

    public void showCourseRequirements(){
        System.out.println(courseName+ '\n'+start_time+'\n'+duration+'\n'
                +nativelanguage+'\n'+teachinglevel+'\n'+studentaffinity+'\n'
                +courseDirectorId+'\n'+courseDirectorName);
    }


    public void selectPartTimeTeacher() {
        String filePath = "filename.txt"; // 文件路径
        List<String> dataList = new ArrayList<>(); // 创建一个 List 存储每一行数据

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                dataList.add(line); // 将每一行数据存储到 List 中
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 打印所有数据并让用户选择需要的行数
        for (int i = 0; i < dataList.size(); i++) {
            System.out.println((i+1) + ". " + dataList.get(i));
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("请选择需要的编号：");
        int choice = scanner.nextInt();

        // 将选择的数据赋值给对象
        String selectedLine = dataList.get(choice - 1);
        String[] selectedData = selectedLine.split("\\s+"); // 按空格分割选择的行的数据
        int intValue1 = Integer.parseInt(selectedData[0]); // 将String类型的数字转换为int类型
        int intValue2 = Integer.parseInt(selectedData[3]);
        int intValue3 = Integer.parseInt(selectedData[4]);
        partTimeTeacher.setTeacherid(intValue1);
        partTimeTeacher.setTeachername(selectedData[1]);
        partTimeTeacher.setNativelanguage(selectedData[2]);
        partTimeTeacher.setTeachinglevel(intValue2);
        partTimeTeacher.setStudentaffinity(intValue3);
    }


    public void selectTrainingTeacher(){

    }

}
