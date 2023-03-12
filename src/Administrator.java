import java.util.Arrays;
import java.util.Scanner;

public class Administrator extends User {



    public void showCourseRequirements() {

        course:
        while (true) {
            Scanner input = new Scanner(System.in);
            Boolean courseExists = false;

            //input ID
            System.out.println("Please type in the course name");
            String courseTitle = input.nextLine().replaceAll(" ", "");

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


    public String selectPartTimeTeacher() {
        System.out.println("ID    Name Subject Level Affinity");

        //show avaliable teachers for selection
        for (int i = 0; i < UserAction.userData.size(); i++) {
            String[] info = UserAction.userData.get(i).split(" ");
            if (info[info.length - 1].equals(String.valueOf(3))) {
                String userInfo = UserAction.userData.get(i);
                String[] userInfos = userInfo.split(" ");
                userInfos[1] = "->";
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
                if (info[info.length - 1].equals(String.valueOf(3))) {
                    if (choice.equals(info[0])) {
                        validChoice = true;
                    }
                }
            }
            if (validChoice) {
                System.out.println("Your choice has been saved! Do you want to train this tearcher?" +
                        "\n"+"Answer yes or no:");
                String booleanTrain = scanner.nextLine();
                if(booleanTrain.toLowerCase().equals("yes")){
                    Training.getTrainning(choice);
                    break Choice;
                }else{
                    System.out.println("The teacher is ready for lecturing");
                    break Choice;
                }

            } else {
                System.out.println("Invalid Choice, try again!");
            }

        }

        return choice;

    }




}

