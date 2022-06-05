package utils;

import java.util.Random;

public class RandomGenerator {

    public static String randomGender() {
        String[] gender = new String[] {"Male","Female","Other"};
        Random random = new Random();
        return gender[random.nextInt(gender.length)];
    }

    public static String randomMonth() {
        String[] month = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        Random random = new Random();
        String randomMonths = month[random.nextInt(month.length)];
        return randomMonths;
    }
}
