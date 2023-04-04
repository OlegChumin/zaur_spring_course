package hibernate_test;

import hibernate_test.entity.Employees;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestViaXml {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml") //
                .addAnnotatedClass(Employees.class)
                .buildSessionFactory();

        Session session = null;

        try {
            session = sessionFactory.getCurrentSession();
            Employees employee =  new Employees("Oleg", "Chumin", "IT", 10_400);
            session.beginTransaction();
            session.save(employee);
            session.getTransaction().commit();
            System.out.println("Done!");
            System.out.println(employee);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
            sessionFactory.close();
        }
    }
}
