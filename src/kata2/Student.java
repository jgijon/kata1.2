package kata2;

import java.util.Date;

public class Student {

    private String name;
    private Date birthDate;
    
    private final static double DAYS_PER_YEAR = 364.25;
    private final static long HOURS_PER_YEAR = (long) (24 * DAYS_PER_YEAR);
    private final static long MINUTES_PER_YEAR = 60 * HOURS_PER_YEAR;
    private final static long SECONDS_PER_YEAR = 60 * MINUTES_PER_YEAR;
    private final static long MILLISECONDS_PER_YEAR = 1000 * SECONDS_PER_YEAR;

    public Student(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }
    
    public int getAge() {
        Date today = new Date();
        long millisecondsFromBirth;
        millisecondsFromBirth = today.getTime() - birthDate.getTime();
        return (int) (millisecondsFromBirth / MILLISECONDS_PER_YEAR);
    }
            
    
}
