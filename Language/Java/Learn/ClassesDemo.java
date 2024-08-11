import java.util.Date;  //this is considered
// import java.sql.*;      //this is not considered

public class ClassesDemo {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d.getClass().getName());
    }
}
