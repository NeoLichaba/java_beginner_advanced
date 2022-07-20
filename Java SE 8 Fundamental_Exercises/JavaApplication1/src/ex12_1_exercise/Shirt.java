
package ex12_1_exercise;

//Shirt class created iherits from Item
    public class Shirt extends Item{
        private int size;
        private char colorCode;

     public Shirt (int price, char size, char colorCode){
        super("Shirt",price);
        this.setSize(size);
        this.setColorCode(colorCode);
    }
     
//    public Shirt (char size, char colorCode){
//        this('S', 'P');
//    }
    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the colorCode
     */
    public char getColorCode() {
        return colorCode;
    }

    /**
     * @param colorCode the colorCode to set
     */
    public void setColorCode(char colorCode) {
        this.colorCode = colorCode;
    }
    }
    
   