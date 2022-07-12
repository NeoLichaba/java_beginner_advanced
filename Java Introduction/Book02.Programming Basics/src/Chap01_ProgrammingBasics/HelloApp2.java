
package Chap01_ProgrammingBasics;

/* "Hello" message is displayed in the console
    Instance of the greeter class is created
    Greeter object's sayHello method is invoked
    Object - oriented version
*/

public class HelloApp2 {
    
    public static void main(String[] args) {
        Greeter myGreeterObject = new Greeter();
        myGreeterObject.sayHello();
    }
}
