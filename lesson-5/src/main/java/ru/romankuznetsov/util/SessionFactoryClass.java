package ru.romankuznetsov.util;

import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManagerFactory;

public class SessionFactoryClass {

    public static EntityManagerFactory entityManagerFactory (){
        return new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();
    }

}
