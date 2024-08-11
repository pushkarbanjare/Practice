public class InheritanceDemo {
    static class P{
        public void m1(){
            System.out.println("Parent");
        }
    }
    static class C extends P{
        public void m2(){
            System.out.println("Child");
        }
    }

    public static void main(String[] args) {
        // Case 1
        // P p = new P();
        // p.m1();
        // p.m2(); //cant be accessed here
        
        // // Case 2
        // C c = new C();
        // c.m1();
        // c.m2();
        
        // Case 3
        // P p1 = new C();
        // p1.m1();
        // p1.m2();    //cant be accessed here
        
        // Case 4
        // C c1 = new P();  //illegal to use -> child to parent
    }
}
