public class Author2_3 {
    private String name;
    private String email;

    public  Author2_3(String name , String email){
            this.name = name;
            this.email=email;
    }
    public String getName(){
        return name ;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String toString(){
        return("Author[name= "+name+" ,email= "+email+"]");
    }
}
