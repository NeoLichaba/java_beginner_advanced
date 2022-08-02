package ex09_1_exercise;


public class Customer {
    private String name;
    private String ssn;
   
    // Encapsulate this class.  Make ssn read only.
    
    public String getName(){
        return name;
    }
    public void setName (String newName){
        name = newName;
    }
 
}
