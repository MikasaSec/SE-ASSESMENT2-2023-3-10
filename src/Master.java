import java.util.Scanner;

public class Master {
    public User getUser(int num){
        User user=null;
        if(num==1){
            user=new CourseDirector();
        }else if(num==2){
            user=new Administrator();
        }
        return user;
    }
    public void feed(User user){
        user.login();
    }

    public void run(User user){
        if(user instanceof CourseDirector){//instanceof是Java中的二元运算符，左边是对象，右边是类；当对象是右边类或子类所创建对象时，返回true；否则，返回false
            CourseDirector courseDirector=(CourseDirector)user;//向下转型
//            courseDirector.catchingFlyDisk();
        } else if(user instanceof Administrator){
            Administrator administrator=(Administrator)user;//向下转型
//            courseDirector.catchingFlyDisk();
        }
    }
}
