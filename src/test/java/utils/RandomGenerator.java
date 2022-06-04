package utils;

import java.util.Random;

public class RandomGenerator {

    public static String randomGender() {
        String[] gender = new String[] {"Male","Female","Other"};
        Random random = new Random();
        return gender[random.nextInt(gender.length)];
    }

    public static String randomMonth() {
        String[] gender = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        Random random = new Random();
        String randomM = gender[random.nextInt(gender.length)];
        return randomM;
    }
}
