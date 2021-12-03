import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class day2part1 {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        int horizontalPostion = 0;
        int depth = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Walters Laptop\\OneDrive\\advent_of_code\\day2\\input.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                stringArrayList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < stringArrayList.size(); i++) {
            String[] test = stringArrayList.get(i).split(" ");
            if (test[0].equals("forward"))
                horizontalPostion += Integer.parseInt(test[1]);

            if (test[0].equals("down"))
                depth += Integer.parseInt(test[1]);

            if (test[0].equals("up"))
                depth -= Integer.parseInt(test[1]);

        }

        System.out.println(depth * horizontalPostion);
    }
}
