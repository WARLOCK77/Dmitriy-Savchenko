import java.io.FileInputStream;

public class ReadFromFile {
    public byte[] fileReader(String fileName){
        try(FileInputStream fis = new FileInputStream(fileName)) {
            int available = fis.available();
            byte[] buffer = new byte[available];
            fis.read(buffer);
            return buffer;
        }catch (Exception ignored) {

        }
        return new byte[]{};
    }

    public String [][] readArray(String fileName) {
        String result = new String(fileReader(fileName));
        String[] lines = result.split(";");
        String[][] array = new String[lines.length][];
        for (int i = 0; i < array.length; i++) {
            String[] columns = lines[i].split(",");
            array[i] = new String[columns.length];
            for (int j = 0; j < columns.length; j++) {
                array[i][j] = columns[j];
            }
        }
        return array;
    }
}
