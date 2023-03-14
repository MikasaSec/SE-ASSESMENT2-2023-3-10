package com.javacto.userservice.courserequirements;

public class CourseRequirements {

    private String courseName;
    private String start_time;
    private String duration;
    private String subject;
    private String teachinglevel;
    private String studentaffinity;

    private static CourseRequirements courseRequirements=new CourseRequirements();

    // Construct method set to private
    private CourseRequirements(){
    }
    //Create a method that returns the new created object
    public static CourseRequirements getcourseRequirements(){
        return courseRequirements;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTeachinglevel() {
        return teachinglevel;
    }

    public void setTeachinglevel(String teachinglevel) {
        this.teachinglevel = teachinglevel;
    }

    public String getStudentaffinity() {
        return studentaffinity;
    }

    public void setStudentaffinity(String studentaffinity) {
        this.studentaffinity = studentaffinity;
    }


}
