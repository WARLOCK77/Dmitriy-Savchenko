

public class Pets {
    public static final String FILE_NAME="Pets.txt";
    public String name;
    public Owners owner;
    public  String age;

    public Pets(){

    }

    public void setName(String val){
        name=val;
    }
    public void setAge(String val){
        age=val;
    }

    //public void setOwner(Owners owner) {
        //this.owner=owner;
    //}

    //public static class Builder {
        //String name;
        //String age;

        //public Builder(String val){
            //this.name=val;
        //}
        //public Builder age(String val){
            //age=val;
            //return this;
       // }
        //public Pets build(){
            //return new Pets(this);
        //}
    //}

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pets)) {
            return false;
        }
        Pets other = (Pets) obj;

        return this.name != null && this.name.equals(other.name) &&
                this.owner != null && this.owner.equals(other.owner) &&
                this.age != null && this.age.equals(other.age);
    }
}

