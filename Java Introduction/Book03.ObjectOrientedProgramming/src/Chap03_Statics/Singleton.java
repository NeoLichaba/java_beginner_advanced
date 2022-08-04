
package Chap03_Statics;

public class Singleton {

    private static Singleton singleton = new Singleton();

    /* A private Constructor prevents any other
    * class from instantiating.
     */
    private Singleton() {
    }

    /* Static 'instance' method */
    public static Singleton getInstance() {
        return singleton;
    }

    /* Other methods protected by singleton-ness */
    protected static void demoMethod() {
        System.out.println("demoMethod for singleton");
    }
}
