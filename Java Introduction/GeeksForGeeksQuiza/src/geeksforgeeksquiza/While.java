package geeksforgeeksquiza;

/**
 *
 * @author User
 */


    public class First {

        public static int CBSE(int x) {
            if (x < 100) {
                x = CBSE(x + 10);
            }
            return (x - 1);
                        }
      public static void main(String[] args) {
            System.out.print(First.CBSE(60));
        }
    
}
