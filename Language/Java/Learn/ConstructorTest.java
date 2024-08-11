public class ConstructorTest {
    // static int count = 0;
    // {
    //     count++; // instance block
    // }

    // overloading of constructors
    ConstructorTest() {
        this(10);
        System.out.println("no-args");
    }
    
    ConstructorTest(int i) {
        this(10.5);
        System.out.println("int-args");
    }
    
    ConstructorTest(double d) {
        System.out.println("double-args");
    }

    public static void main(String[] args) {
        // constructorTest ct1 = new constructorTest();
        // System.out.println();
        // constructorTest ct2 = new constructorTest(10);
        // System.out.println();
        // constructorTest ct3 = new constructorTest(10.3);
        // System.out.println();
        // constructorTest ct4 = new constructorTest(10l);
        // System.out.println(count);
    }
}
