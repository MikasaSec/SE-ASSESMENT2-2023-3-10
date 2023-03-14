package com.javacto.userservice;
import com.javacto.userfunction.UserFunction;
import com.javacto.userfunction.UserFunctionImpl;



public class PartTimeTeacher extends User{
    public void run() {
        UserFunction courseRequirements=new UserFunctionImpl();
        courseRequirements.showTrainedTeacher(); // call UserFunction's function to show ppt teacher's data
    }
}
