package kata2;

import java.util.Date;

public class Kata2 {

    public static void main(String[] args) {
        Student check = new Student ("Javier", new Date(86,3,3));
        System.out.println(check.getAge());
        System.out.println(check.getName());
    }
}
