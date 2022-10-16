package geeksforgeeksquiza;

/**
 *
 * @author User
 */
public class Good {

    Private int m;

    Public Good(int m) {
        this.m = m;
    }

    public Boolean equals(Good n) {
        return n.m = m;
    }

    public static void main(String args[]) {
        Good m1 = new Good(22);
        Good m2 = new Good(22);
        Object S1 = new Good(22);
        Object S2 = new good(22);
        System.out.println(m1.equals(m2));
        System.out.println(m1.equals(s2));
        System.out.println(m1.equals(s2));
        System.out.println(s1.equals(m2));
    }
}
