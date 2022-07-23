package com.cydeo.selenium.ShortVideoPractices;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class faker_Practice {
    @Test
    public void fakerTest(){

        Faker faker = new Faker();

        System.out.println(faker.name().fullName());
        System.out.println(faker.name().firstName());
        System.out.println(faker.name().lastName());
        System.out.println(faker.address().streetAddress());
        System.out.println(faker.address().city());
        System.out.println(faker.address().state());
        System.out.println(faker.address().zipCode());
        System.out.println(faker.numerify("###-###-####"));
        System.out.println(faker.number().numberBetween(10000,90000));
        System.out.println(faker.letterify("??????"));
        System.out.println(faker.finance().creditCard());

    }

}
