import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> students =new HashMap<>();
        students.put("Ali", 85);

        students.put("Ayşe", 92);

        students.put("Mehmet", 78);

        students.put("Zeynep", 90);

        students.put("Burak", 88);

        for (String student:students.keySet()){
            System.out.println(student+"="+students.get(student));

        }

    }
}
