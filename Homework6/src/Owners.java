

public class Owners {
    public static final String FILE_NAME="Owners.txt";
     String firstName;
     String lastName;
     String age;
     String address;
     String phone;

     public Owners (){

    }
    public void setFirstName(String val){
         firstName=val;
    }
    public void setLastName(String val){
        lastName=val;
    }
    public void setAge(String val){
        age=val;
    }
    public void setAddress(String val){
        address=val;
    }
    public void setPhone(String val){
        phone=val;
    }


    //public static class Builder {
         //String firstName;
         //String lastName;
         //String age;
         //String address;
         //String phone;

        //public Builder (String val){
            //this.firstName=val;
        //}
        //public Builder lastName(String val){
            //lastName=val;
            //return this;
        //}
        //public Builder age(String val){
            //age=val;
            //return this;
        //}
        //public Builder address(String val){
            //address=val;
            //return this;
        //}
        //public Builder phone(String val){
            //phone=val;
            //return this;
        //}
        //public Owners build(){
            //return new Owners(this);
        //}
    //}

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Owners)) {
            return false;
        }
        Owners other = (Owners) obj;

        return this.firstName != null && this.firstName.equals(other.firstName) &&
                this.lastName != null && this.lastName.equals(other.lastName) &&
                this.age != null && this.age.equals(other.age) &&
                this.address != null && this.address.equals(other.address) &&
                this.phone != null && this.phone.equals(other.phone);
    }

}

