import java.util.Scanner;

public class Master {
    public User getUser(int num){
        User user=null;
        if(num==1){
            user=new CourseDirector();
        }else if(num==2){
            user=new Administrator();
        }else if(num==3){
            user=PartTimeTeacher.getpartTimeTeacher();
        }
        return user;
    }
    public void login(User user){
        user.login();
    }

    public void run(User user){
        if(user instanceof CourseDirector){//instanceof是Java中的二元运算符，左边是对象，右边是类；当对象是右边类或子类所创建对象时，返回true；否则，返回false
            CourseDirector courseDirector=(CourseDirector)user;//向下转型
            courseDirector.createCourseRequirements();
        } else if(user instanceof Administrator){
            Administrator administrator=(Administrator)user;//向下转型
            administrator.showCourseRequirements();
            administrator.selectPartTimeTeacher();
        }else if(user instanceof PartTimeTeacher){
            Administrator administrator=(Administrator)user;//向下转型
//            courseDirector.catchingFlyDisk();
        }
    }
}
