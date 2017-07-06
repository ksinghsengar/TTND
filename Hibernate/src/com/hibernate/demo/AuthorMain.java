package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class AuthorMain {


    public static void main(String[] args) {
        SessionFactory sessionFactory =new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Author author = new Author();
        session.beginTransaction();
        author.setAge(25);
        author.setFirstName("Ram");
        author.setLastName("");

        session.save(author);
        session.getTransaction().commit();
        session.close();
//       createTable();
    }
    /*void createTable(){
        SessionFactory sessionFactory =new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Author author = new Author();
        session.beginTransaction();
        author.setAge(25);
        author.setFirstName("Ram");
        author.setLastName("");

        session.save(author);
        session.getTransaction().commit();
        session.close();
    }*/
}
