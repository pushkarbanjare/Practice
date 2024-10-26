public class VariablesDemo {
    int x = 10;
    static int y = 10;

    public void display(){
        // System.out.println(x);   // can access 'x' as it is not static
        // System.out.println(y);  // can be accessed normally too
    }
    public static void main(String[] args) {
        // System.out.println(x);   // cant be run like this as 'x' is instance var and main() is static

        // variables v = new variables();   // need to create obj to access instance variable     
        // System.out.println(v.x);


        // variables v = new variables();
        // System.out.println(v.y);    // not recommended to use as its instance var way
        // System.out.println(variables.y);    //recommended to use this for static var
        // System.out.println(y);  //can also be used = simple
    }
}