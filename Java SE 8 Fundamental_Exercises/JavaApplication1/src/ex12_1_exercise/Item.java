
package ex12_1_exercise;

public class Item {
    private int id;
    private String desc;
    private double price;
    static int nextId = 1;
    
    public Item(){
    // set default values
        setId();
        setDesc("No description assigned.");
        setPrice(0.00);
    }
    
    public Item(String desc, double price) {
        setId();
        setDesc(desc);
        setPrice(price);
    }
    
    

    public void display(){
        System.out.println("Item description: "+getDesc());
        System.out.println("\tID: "+getId());
        System.out.println("\tPrice: "+getPrice());
    }

    private void setId() {
        id = Item.nextId++;
    }

    public int getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    private void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        this.price = price;
    }    
}
