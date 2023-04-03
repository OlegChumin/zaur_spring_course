package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestViaXml {
    public static void main(String[] args) {


        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml") //
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = sessionFactory.getCurrentSession();
            Employee employee =  new Employee("Oleg", "Chumin", "IT", 10_400);
            session.beginTransaction();
            session.save(employee);
//            session.clear();
            session.getTransaction().commit();
            System.out.println("Done!");
            System.out.println(employee);
        } finally {
            sessionFactory.close();
        }
    }
}
