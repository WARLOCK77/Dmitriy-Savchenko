import java.io.FileInputStream;

public class ReadFromFile {
    public static byte[] fileReader(String fileName){
        try(FileInputStream fis = new FileInputStream(fileName)) {
            int available = fis.available();
            byte[] buffer = new byte[available];
            fis.read(buffer);
            return buffer;
        }catch (Exception ignored) {

        }
        return new byte[]{};
    }
}
