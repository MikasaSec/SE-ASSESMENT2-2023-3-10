//this class contains two methods that load existing data from users.txt and courses.txt
//and write updated information to txt files.


import java.io.*;
import java.util.ArrayList;

public class ReadWriteFiles {

    public ArrayList<String> readFile(String filepath) {

        ArrayList<String> lines = new ArrayList<String>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filepath));
            String line = reader.readLine();
            while (line != null) {
                lines.add(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return lines;

    }

    public void writeFile(ArrayList<String> modifiedUserData) {
        try {
            FileWriter writer = new FileWriter("users.txt");
            BufferedWriter buffer = new BufferedWriter(writer);

            for (String data : modifiedUserData) {
                buffer.write(data);
                buffer.newLine();
            }

            buffer.flush();
            buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}





