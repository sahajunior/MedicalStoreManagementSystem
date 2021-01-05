import java.io.FileWriter;

public class FileOperation {
    public void insertMedicine(Medicine m) {
        String line = m.getID() + "," + m.getName();
        try {
            FileWriter fw = new FileWriter("medicine.txt", true);
            fw.write(line);
            fw.close();
            System.out.println(line);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
