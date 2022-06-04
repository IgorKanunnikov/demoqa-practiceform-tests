package tests;

import com.github.javafaker.Faker;
import utils.RandomGenerator;

import java.util.Locale;

public class TestDataProfile {
    Faker faker = new Faker(new Locale("en"));
    String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            gender = RandomGenerator.randomGender(),
            phone = String.valueOf(faker.number().randomNumber(10, true)),
            day = String.valueOf(faker.number().numberBetween(1, 28)),
            month = RandomGenerator.randomMonth(),
            year = String.valueOf(faker.number().numberBetween(1925, 2022)),
            subShort = "E",
            subFull = "English",
            hobbies = "Music",
            file = "orig.jpg",
            address = faker.address().fullAddress(),
            state = "Rajasthan",
            city = "Jaipur";
}
