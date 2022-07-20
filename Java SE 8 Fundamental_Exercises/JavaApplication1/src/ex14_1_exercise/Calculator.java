package ex14_1_exercise;

public class Calculator {
    public int add(int x, int y){
        y = 0;
        return x + y;
    }
    // This method could throw an ArithmeticException
    public double divide(int x, int y){
        return x / y;
    }
}
