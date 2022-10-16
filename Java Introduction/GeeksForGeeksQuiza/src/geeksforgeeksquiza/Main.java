package geeksforgeeksquiza;

/**
 *
 * @author User
 */



class Base {
  public final void show() {
       System.out.println("Base::show() called");
    }
}
class Derived extends Base {
    @Override
    public void show() {  
       System.out.println("Derived::show() called");
    }
}
public class Main {
    public static void main(String[] args) {
        Base b = new Derived();
        b.show();
    }
}