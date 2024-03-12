//Polymorphism
// 2)Create a Java class MathOperations with overloaded methods for addition (add) that can accept two integers, three doubles, and two strings, respectively. Demonstrate the usage of these methods in the main method by adding two integers, three doubles, and concatenating two strings.

public class MathOperations{

    public int add(int x, int y) {
        return x + y;
    }
    
    public double add(double x, double y, double z){
        return x + y + z;
    }
    
    public String add(String x, String y){
        return x + y;
    }

    public static void main(String[] args){
        MathOperations operations = new MathOperations();
        int sumInt = operations.add(20, 30);
        System.out.println("Sum of two integers: " + sumInt);
        double sumDouble = operations.add(18.9, 23.42, 13.43);
        System.out.println("Sum of three doubles: " + sumDouble);
        String concatenatedString = operations.add("Hello, ", "How are you!?");
        System.out.println("Concatenation of two strings: " + concatenatedString);
    }
}
