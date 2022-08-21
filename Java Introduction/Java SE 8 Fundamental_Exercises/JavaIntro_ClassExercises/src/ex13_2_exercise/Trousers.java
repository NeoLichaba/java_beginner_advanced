package ex13_2_exercise;

public class Trousers extends Item {
    private int size;
    private char gender;
    private String fit;
    
    public Trousers(double price, int size, char colorCode, String fit,char gender){
        super ("Trousers", price, colorCode);
        this.setSize(size);
        this.setGender(gender);
        this.setFit(fit);
    }
    
    public void display(){
        super.display();
        System.out.println("\tSize: "+getSize());
        System.out.println("\tGender: "+ getGender());
        System.out.println("\tFit: "+ getFit());
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFit() {
        return fit;
    }

    public void setFit(String fit) {
        this.fit = fit;
    }
}
