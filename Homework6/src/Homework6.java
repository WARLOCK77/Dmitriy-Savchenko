import java.util.Arrays;

public class Homework6 {
    public static final String PETS_AND_OWNERS="PetsAndOwners.txt";
    public static void main(String[] args) {
        ReadFromFile readFromFile=new ReadFromFile();
        byte[] bytes=readFromFile.fileReader(PETS_AND_OWNERS);
        System.out.println(new String(bytes));
        String[][] srt=readFromFile.readArray(PETS_AND_OWNERS);
        System.out.println(Arrays.deepToString(srt));
    }
}
