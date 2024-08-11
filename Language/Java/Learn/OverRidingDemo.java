public class OverRidingDemo {
    public static class P{
        public void m1(){
            System.out.println("Parent");
        }
    }
    public static class C extends P{
        public void m1(){
            System.out.println("Child");
        }
    }
    public static void main(String[] args) {
        P p = new P();
        p.m1();
        C c = new C();
        c.m1();
        P p1 = new C();     //child is used and not parent bcz COMPILER(left part is checked) will choose Parent but RUNTIME will choose CHILD(right part is checked)
        p1.m1();
    }
}
