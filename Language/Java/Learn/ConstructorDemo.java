public class ConstructorDemo {
    public static class Student {
        String name;
        int roll;

        // Constructor: job is to initialize obj and not create job
        Student(String name, int roll) {
            this.name = name;
            this.roll = roll;
        }
    }

    public static void main(String[] args) {
        // Student s = new Student("yash", 100);
    }
}