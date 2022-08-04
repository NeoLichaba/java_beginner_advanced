package Chap03_Statics;

/* Program demonstrates Singleton Class Design Pattern
 * Class that only has one instance of a class (i.e. object) created at a time
 * Purpose is to limit the number of object creation - access control
 * Memory wastage does not occur
 */
class SingletonClass {

    private static SingletonClass instance;

    /* A private Constructor prevents any other
    * class from instantiating.
    */
    private SingletonClass() {
    }

    /* Static 'instance' method */
    public static SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }
    //getInstance() method called twice and only then is it instantiated - lazy instantiation
    //Singleton classes are only created when needed
    SingletonClass s1 = SingletonClass.getInstance();
    SingletonClass s2 = SingletonClass.getInstance();

    {
        if (s1 == s2) {
            System.out.println("The objects are the same");
        } else {
            System.out.println("The objects are not the same");
        }
    }
}
