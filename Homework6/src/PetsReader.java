import java.nio.charset.StandardCharsets;

public class PetsReader {
        public static Pets [] filePetsReader (){
            byte [] file=ReadFromFile.fileReader(Pets.FILE_NAME);
            if (file.length>0){
                String str=new String(file, StandardCharsets.UTF_8);
                String [] lines=str.split(";");
                Pets [] pets=new Pets[lines.length];
                for (int i=0; i< lines.length; i++) {
                    String [] petsLine=lines[i].split(",");
                    pets[i]= new Pets();
                    pets[i].setName(petsLine[0]);
                    pets[i].setAge(petsLine[2]);
                    System.out.printf(pets[i].name,pets[i].age);

                }
                return pets;
            }
            return new Pets[0];
        }
}
