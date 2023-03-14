package com.javacto.dao;

import com.javacto.action.UserAction;
import com.javacto.service.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DaoImpl implements Dao {
    /**
     * Create static variable PartTimeTeacherID for part-time teachers to view personal info
     * Create trainChoice and trainBoolean for Administrator to use getTrainning() method
     */
    static String PartTimeTeacherID;
    static String trainChoice = "-1";
    static boolean trainBoolean = false;

    /**
     * define a method that reads existing data from txt file to ArrayList<String>
     */
    public ArrayList<String> readFile(String filepath) {
        ArrayList<String> lines = new ArrayList<String>();
        try {
            //create BufferedReader to read the txt file
            BufferedReader reader = new BufferedReader(new FileReader(filepath));
            String line = reader.readLine();
            while (line != null) {
                lines.add(line);
                line = reader.readLine();
            }
            //close BufferedReader
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return lines;
    }

    /**
     * define a method that writes modified data to local txt file
     */
    public void writeFile(ArrayList<String> modifiedUserData) {
        try {
            //create FileWriter and write to local txt file
            FileWriter writer = new FileWriter("src/com/javacto/users.txt");
            BufferedWriter buffer = new BufferedWriter(writer);

            for (String data : modifiedUserData) {
                buffer.write(data);
                buffer.newLine();
            }

            buffer.flush();
            //close FileWriter
            buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * this method creates a specific user role instance according to login ID
     */
    public User getUserRole(String ID) {
        //create and initialize an user object
        User user = null;

        //read data from UserAction.userData
        for (String contents : UserAction.userData) {
            String[] content = contents.split(" ");
            //indentify user role according to user role code in the data
            if (content[0].equals(ID)) {
                try {
                    //create specific user role object using polymorphism
                    int roleCode = Integer.parseInt(content[content.length - 1]);
                    switch (roleCode) {
                        case 1:
                            user = new CourseDirector();
                            break;
                        case 2:
                            user = new Administrator();
                            break;
                        case 3:
                            user = new PartTimeTeacher();
                            break;
                        default:
                            System.out.println("Error, we cannot find your role in the system");
                            break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid role code: " + content[content.length - 1]);
                }
                break;
            }
        }
        //return created user role object
        return user;
    }

    /**
     * The method verifies the existance of ID in the system and verifies password
     */
    public boolean validate(String ID, String password) {
        //set default booleans for login to false
        Boolean IDExists = false;
        Boolean successLogin = false;

        for (int i = 0; i < UserAction.userData.size(); i++) {
            String[] content = UserAction.userData.get(i).split(" ");
            //when ID exists and matches with the data, validate the password
            if (content[0].equals(ID)) {
                IDExists = true;
                if (content[1].equals(password)) {
                    successLogin = true;
                    PartTimeTeacherID = ID;
                    System.out.println(ID);
                } else {
                    System.out.println("Sorry, your ID or password is incorrect!");
                }
            }

        }
        //ID is not found in the dataset
        if (!IDExists) {
            System.out.println("Sorry, the input ID doesn't exist!");
        }

        return successLogin;
    }

    /**
     * run() method has three different cases for CourseDirector, Administrator and PartTimeTeacher.
     * CourseDirector is able to createCourseRequirements()
     * Administrator is able to showCourseRequirements() and selectPartTimeTeacher() and getTrainning()
     * PartTimeTeacher is able to view personal information
     */
    public void run(User user) {
        if (user instanceof CourseDirector) {
            System.out.println("Welcome, CourseDirector");
            CourseDirector courseDirector = (CourseDirector) user;
            courseDirector.run();
        } else if (user instanceof Administrator) {
            System.out.println("Welcome, Administrator");
            Administrator administrator = (Administrator) user;
            administrator.run();
        } else if (user instanceof PartTimeTeacher) {
            System.out.println("Welcome, PartTimeTeacher");
            PartTimeTeacher partTimeTeacher = (PartTimeTeacher) user;
            partTimeTeacher.run();

        }
    }

    public void createCourseRequirements() {

        //create an empty object for CourseRequirements
        CourseRequirements courseRequirements = CourseRequirements.getcourseRequirements();

        //allow users to input and set values for CourseRequirements
        Scanner a = new Scanner(System.in);

        System.out.println("Input your course requirements:");
        System.out.println("Input course Name:");

        String courseName = a.nextLine().replaceAll(" ", "");
        courseRequirements.setCourseName(courseName);

        System.out.println("Input start time dd/mm/yyyy");
        Scanner b = new Scanner(System.in);
        String start_time = b.nextLine().replaceAll(" ", "");
        courseRequirements.setStart_time(start_time);

        System.out.println("Input course duration dd/mm");
        Scanner c = new Scanner(System.in);
        String duration = c.nextLine().replaceAll(" ", "");
        courseRequirements.setDuration(duration);

        System.out.println("Input required subject");
        Scanner d = new Scanner(System.in);
        String subject = d.nextLine().replaceAll(" ", "");
        courseRequirements.setSubject(subject);

        System.out.println("Input required teacher's teaching level 1~5");
        Scanner f = new Scanner(System.in);
        String teachinglevel = f.nextLine().replaceAll(" ", "");
        courseRequirements.setTeachinglevel(teachinglevel);

        System.out.println("Input required teacher's student affinity 1~5");
        Scanner g = new Scanner(System.in);
        String studentaffinity = g.nextLine().replaceAll(" ", "");
        courseRequirements.setStudentaffinity(studentaffinity);

        try {
            //create FileWriter that writes courseRequirements to local txt file
            FileWriter writer = new FileWriter("src/com/javacto/courses.txt", true);
            writer.write("\n");
            writer.write(courseRequirements.getCourseName() + " ");
            writer.write(courseRequirements.getStart_time() + " ");
            writer.write(courseRequirements.getDuration() + " ");
            writer.write(courseRequirements.getSubject() + " ");
            writer.write(courseRequirements.getTeachinglevel() + " ");
            writer.write(courseRequirements.getStudentaffinity());
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException ex) {
            System.out.println("An error occurred while writing to local file.");
            ex.printStackTrace();
        }

    }

    public void showCourseRequirements() {

        course:
        while (true) {
            Scanner input = new Scanner(System.in);
            //create courseExists boolean to check whether the course exists in the dataset
            Boolean courseExists = false;

            //input ID
            System.out.println("Please enter the course name for which you would like to assign a teacher \nInput *all* if you want to view all courses.");
            //read the course title from user's input and remove spaces in the input
            String courseTitle = input.nextLine().replaceAll(" ", "");

            //Display all courses if the user inputs "all"
            if ("all".equals(courseTitle.toLowerCase())) {
                for (int i = 0; i < UserAction.courseData.size(); i++) {
                    String[] courseContent = UserAction.courseData.get(i).split(" ");
                    //course startTime Duration Subject Level Affinity
                    System.out.println("courseName:" + courseContent[0]
                            + ", start_time:" + courseContent[1]
                            + ", duration:" + courseContent[2]
                            + ", subject:" + courseContent[3]
                            + ", level:" + courseContent[4]
                            + ", affinity:" + courseContent[5]
                            + '\n');
                }

            } else {
                //search the course data and display the course according to the input course name
                for (int i = 0; i < UserAction.courseData.size(); i++) {
                    String[] courseContent = UserAction.courseData.get(i).split(" ");
                    if (courseContent[0].equals(courseTitle)) {
                        courseExists = true;
                        //course startTime Duration Subject Level Affinity
                        System.out.println("courseName:" + courseContent[0]
                                + ", start_time:" + courseContent[1]
                                + ", duration:" + courseContent[2]
                                + ", subject:" + courseContent[3]
                                + ", level:" + courseContent[4]
                                + ", affinity:" + courseContent[5]
                                + '\n');
                        break course;
                    }
                }
                if (!courseExists) {
                    System.out.println("The course data is not recorded in the system, please try again!");
                }
            }
        }
    }

    public String selectPartTimeTeacher() {
        System.out.println("ID    Name Subject Level Affinity");

        //iterate all user information
        for (int i = 0; i < UserAction.userData.size(); i++) {
            String[] info = UserAction.userData.get(i).split(" ");
            //verify the role code, make sure the role code is "3" as a teacher.
            if (info[info.length - 1].equals(String.valueOf(3))) {
                String userInfo = UserAction.userData.get(i);
                String[] userInfos = userInfo.split(" ");
                //hide the password
                userInfos[1] = "->";
                //hide user role code
                userInfos[userInfos.length - 1] = "*";
                System.out.println(Arrays.toString(userInfos));
            }
        }

        Scanner scanner = new Scanner(System.in);
        String choice;

        Choice:
        while (true) {
            System.out.println("Select and Input ID of suitable teacher for this course");
            choice = scanner.nextLine();

            Boolean validChoice = false;
            for (int i = 0; i < UserAction.userData.size(); i++) {
                String[] info = UserAction.userData.get(i).split(" ");
                //iterate all teachers
                if (info[info.length - 1].equals(String.valueOf(3))) {
                    //verify administrator's choice
                    if (choice.equals(info[0])) {
                        validChoice = true;
                    }
                }
            }
            if (validChoice) {
                System.out.println("Your choice has been saved! Do you want to train this teacher?" +
                        "\n" + "Answer yes or no:");
                String booleanTrain = scanner.nextLine();
                //let the administrator decide whether the teacher needs to be trained
                //set value to boolean according to administrator's response
                if (booleanTrain.toLowerCase().equals("yes")) {
                    DaoImpl.trainBoolean = true;
                    DaoImpl.trainChoice = choice;
                }
                break Choice;
            } else {
                System.out.println("Invalid Choice, try again!");
            }

        }

        return choice;

    }

    public void showTrainedTeacher() {
        for (int i = 0; i < UserAction.userData.size(); i++) {
            String[] courseContent = UserAction.userData.get(i).split(" ");
            if (courseContent[0].equals(PartTimeTeacherID)) {
                //display personal information
                System.out.println("ID:" + courseContent[0]
                        + ", password:" + courseContent[1]
                        + ", Name:" + courseContent[2]
                        + ", subject:" + courseContent[3]
                        + ", level:" + courseContent[4]
                        + ", Affinity:" + courseContent[5]
                        + ", roleCode:" + courseContent[6]
                        + '\n');
            }
        }
    }

    public void getTraining() {
        if (DaoImpl.trainBoolean) {
            //make a copy of original userData
            ArrayList<String> modifiedUserData = UserAction.userData;

            for (int i = 0; i < UserAction.userData.size(); i++) {
                //split the string using space
                String[] info = UserAction.userData.get(i).split(" ");

                //locate the training target by matching choice with ID
                if (DaoImpl.trainChoice.equals(info[0])) {
                    //increase the teaching level by 1
                    info[4] = String.valueOf(Integer.parseInt(info[4]) + 1);
                    String modifiedLine = String.join(" ", info);
                    System.out.println("Teahcer " + info[2] + " went for lecture trainning");
                    //save the changed data into modifiedUserData
                    modifiedUserData.set(i, modifiedLine);
                } else {
                    //no changes of data, directly copy orginalData to modifiedUserData
                    modifiedUserData.set(i, UserAction.userData.get(i));
                }

            }
            //overwrite modifiedUserData to local txt file
            new DaoImpl().writeFile(modifiedUserData);
            System.out.println("The teacher has been trained, teaching level has been increased!");
        } else {
            System.out.println("The teacher is already qualified for lecturing and will be dispatched");
        }
    }
}

