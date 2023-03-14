package com.javacto.userservice;
import com.javacto.userfunction.UserFunction;
import com.javacto.userfunction.UserFunctionImpl;

public class Administrator extends User {
    public void run(){
        UserFunction courseRequirements=new UserFunctionImpl();
        courseRequirements.showCourseRequirements(); // call UserFunction's function to show or select or train teacher
        courseRequirements.selectPartTimeTeacher();
        courseRequirements.getTraining();

    }

}

