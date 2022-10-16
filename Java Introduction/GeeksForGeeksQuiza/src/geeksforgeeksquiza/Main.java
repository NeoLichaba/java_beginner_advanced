
package geeksforgeeksquiza;

/**
 *
 * @author User
 */
class Test
{
    static int a;
     
    static
    {
        a = 4;
        System.out.println ("inside static blockn");
        System.out.println ("a = " + a);
    }
     
    Test()
    {
        System.out.println ("ninside constructorn");
        a = 10;
    }
     
    public static void func()
    {
        a = a + 1;
        System.out.println ("a = " + a);
    }
     
    public static void main(String[] args)
    {
 
        Test obj = new Test();
        obj.func();
 
    }
}
  