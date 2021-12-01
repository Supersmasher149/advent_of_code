import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class day1part2 {
    public static void main(String[] args) {
        int count = 0;
        ArrayList<Integer> stringList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Walters Laptop\\OneDrive\\advent_of_code\\day1\\input.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                stringList.add(Integer.parseInt(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 3; i < stringList.size(); i++) {
            if (stringList.get(i - 3) + stringList.get(i - 2) + stringList.get(i - 1) < stringList.get(i - 2) + stringList.get(i - 1) + stringList.get(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
