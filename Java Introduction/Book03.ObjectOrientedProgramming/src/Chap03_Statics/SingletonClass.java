package Chap03_Statics;

/* Program demonstrates Singleton Class Design Pattern
 * Class that only has one instance of a class (i.e. object) created at a time
 * Purpose is to limit the number of object creation - access control 
 * Returns same object to customer instead of creating a new one therefore memory wastage does not occur
 * Great for storing data shared by the same application
 */
class SingletonClass {

    private static SingletonClass instance;                                     //static data member declared which is an instance of a singleton class

    /* A private Constructor prevents any other
    * class from instantiating.
     */
    private SingletonClass() {
    }

                                                                                // Static 'instance' method //
    public static SingletonClass getInstance() {            
        if (instance == null) {                                                 //if instance object is null, create a new object
            instance = new SingletonClass();                
        }
        return instance;                                                        //if not null, return same object
    }

    public static void main(String[] args) {        
        
        SingletonClass s1 = SingletonClass.getInstance();                       //getInstance() method called twice and only then is it instantiated - lazy instantiation
        SingletonClass s2 = SingletonClass.getInstance();                       //Singleton classes are only created when needed

        {
            if (s1 == s2) {
                System.out.println("The objects are the same");
            } else {
                System.out.println("The objects are not the same");
            }
        }
    }
}
