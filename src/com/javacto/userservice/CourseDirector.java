package com.javacto.userservice;
import com.javacto.userfunction.UserFunction;
import com.javacto.userfunction.UserFunctionImpl;



public class CourseDirector extends User {

    public void run() {
        UserFunction courseRequirements=new UserFunctionImpl();
        courseRequirements.createCourseRequirements();// call UserFunction's function to create course require
    }

}
