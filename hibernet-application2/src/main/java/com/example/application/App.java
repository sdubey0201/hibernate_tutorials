package com.example.application;

import com.example.application.entities.HbApp2Student;
import com.example.application.util.HibernateHelperUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        HbApp2Student hbApp2Student = new HbApp2Student();
        hbApp2Student.setName("Amitabh");
        hbApp2Student.setCollageName("Delhi  collage");
        hbApp2Student.setFatherName("Ashok");
        hbApp2Student.setAbout("History student");
        hbApp2Student.setActive(true);
        SessionFactory sessionFactory = HibernateHelperUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.persist(hbApp2Student);
            transaction.commit();
            System.out.println( "Saved.." );

        } catch (Exception e) {
            assert transaction != null;
            transaction.rollback();;
            System.out.println( "Error:: session persist :: "+e.getMessage() );
        }finally {
            session.close();
        }
        System.out.println(sessionFactory);
    }
}
