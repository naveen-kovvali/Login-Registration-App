package model;
public class User {
    private String fname=null;
    private String lname=null;
    private String email=null;
    private String dob=null;
    private String pass=null;    
    public void setfName(String fname){
        this.fname=fname;
        
    }
    public void setlName(String lname){
        this.lname=lname;
    }
    public void setMail(String email){
        this.email=email;
    }
    public void setDob(String dob){
        this.dob=dob;
    }
    public void setpass(String pass){
        this.pass=pass;
    }
    public String getfname(){
        return fname;
    }
    public String getlname(){
        return lname;
        
    }
    public String getEmail(){
        return email;
    }
    public String getDob(){
        return dob;
    }
    public String getpass(){
        return pass;
    }
}
