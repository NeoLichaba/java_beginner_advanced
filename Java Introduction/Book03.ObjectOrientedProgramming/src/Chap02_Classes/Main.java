
package Chap02_Classes;

/* Examples displaying overloaded method
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        
        int x = add(1,2,3);
        System.out.println(x);
                
    }
    static int add(int a, int b){
        System.out.println("Overloaded method 1");
        return a+b;
        
    }
    static int add(int a, int b, int c){
        System.out.println("Overloaded method 2");
        return a+b+c;
    
}
}
