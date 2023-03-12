import java.util.ArrayList;

public class Training {
    private int teachingLevel;


    public static void getTrainning(String choice) {

        ArrayList<String> modifiedUserData = UserAction.userData;

        for (int i = 0; i < UserAction.userData.size(); i++) {

            String[] info = UserAction.userData.get(i).split(" ");

            if (choice.equals(info[0])) {
                info[4] = String.valueOf(Integer.parseInt(info[4]) + 1);
                String modifiedLine = String.join(" ",info);
                System.out.println(modifiedLine);
                modifiedUserData.set(i,modifiedLine);
            } else {
                modifiedUserData.set(i,UserAction.userData.get(i));
            }

        }
        new ReadWriteFiles().writeFile(modifiedUserData);
        System.out.println("The teacher has been trained");
    }


}


