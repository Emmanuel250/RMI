package model;
// Generated Nov 2, 2020 11:27:02 AM by Hibernate Tools 3.6.0



/**
 * Student generated by hbm2java
 */
public class Student  implements java.io.Serializable {


     private Integer no;
     private String fname;
     private String lname;
     private Integer sem;

    public Student() {
    }

    public Student(String fname, String lname, Integer sem) {
       this.fname = fname;
       this.lname = lname;
       this.sem = sem;
    }
   
    public Integer getNo() {
        return this.no;
    }
    
    public void setNo(Integer no) {
        this.no = no;
    }
    public String getFname() {
        return this.fname;
    }
    
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getLname() {
        return this.lname;
    }
    
    public void setLname(String lname) {
        this.lname = lname;
    }
    public Integer getSem() {
        return this.sem;
    }
    
    public void setSem(Integer sem) {
        this.sem = sem;
    }




}

