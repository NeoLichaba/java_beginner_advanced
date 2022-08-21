package ex12_3_exercise;

public class Shirt extends Item {

    private char size;
    private char colorCode;

    public Shirt(double price, char size, char colorCode) {
        super("Shirt", price);
        this.size = size;
        this.colorCode = colorCode;
    }

    public void display() {
        super.display();
        System.out.println("\tSize: " + size);
        System.out.println("\tColor Code: " + colorCode);
    }

    // Code a public getColor method that converts the colorCode to a the color name
    // Use a switch statement.  Return the color name. 
    public String getColor() {

        String color = " ";
        switch (this.colorCode) {
            case 'R':
                color = "red";
                break;

            case 'P':
                color = "pink";
                break;

            default:
                color = "no colour";
        }
        return color;
    }
    public String toString(){
        return "Overiding toString of Objects";
    }

}
