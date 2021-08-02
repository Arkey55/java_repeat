package ru.romankuznetsov.builder;

public class App {
    public static void main(String[] args) {
        Person person = new Person.Builder()
                .setFirstName("Donald")
                .setLastName("Duck")
                .setAddress("someAdress")
                .setCountry("someCountry")
                .build();

        System.out.println(person);
    }
}
