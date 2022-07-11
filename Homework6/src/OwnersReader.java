import java.nio.charset.StandardCharsets;

public class OwnersReader {
    public static Owners [] fileOwnersReader (){
        byte [] file=ReadFromFile.fileReader(Owners.FILE_NAME);
        if (file.length>0){
            String str=new String(file, StandardCharsets.UTF_8);
            String [] lines=str.split(";");
            Owners [] owners=new Owners[lines.length];
            for (int i=0; i< lines.length; i++) {
                String [] ownersLine=lines[i].split(",");
                owners[i]= new Owners();
                owners[i].setFirstName(ownersLine[0]);
                owners[i].setLastName(ownersLine[1]);
                owners[i].setAge(ownersLine[2]);
                owners[i].setAddress(ownersLine[3]);
                owners[i].setPhone(ownersLine[4]);
                System.out.printf("\n"+owners[i].lastName,owners[i].firstName,owners[i].age,
                                  owners[i].address,owners[i].phone);
                }
            return owners;
            }
        return new Owners[0];
        }

    }
