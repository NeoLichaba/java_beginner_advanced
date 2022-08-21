
package ex11_2_exercise;

public class ShoppingCart {
    public static void main(String[] args) {
        String name;
        int age;

        // Parse the args array to populate name and age.
        name = args[0];
        age = Integer.parseInt(args [1]);
        System.out.println("Name: " + name + " , " + "Age: " + age);
	// Print an error message if fewer than 2 args are passed in.
        if (args.length < 2) {
            System.out.println("Invalid arguments passed");
        }
        
    }
}
