package practice23;

/* Building a droid in a robot workshop
 *
 * @author Neo
 */
public class Droid {

    int batteryLevel;
    String name;

    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;
    }

    public void performTask(String task) {
        batteryLevel = batteryLevel - 10;
        System.out.println(name + " is performing a task: " + task);

    }

   public String toString() {
        return "Hello, I'm the droid " + name;
    }

    public static void main(String[] args) {
        Droid codey = new Droid("Codey");
        System.out.println(codey);
        codey.performTask("coding");
        codey.performTask("dancing");
    }
}
