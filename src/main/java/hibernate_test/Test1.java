package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {


        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();



        try {
            Session session = sessionFactory.getCurrentSession();
            Employee employee =  new Employee("SomeName4", "SomeSurName4", "IT", 3400);
            session.beginTransaction();
//            session.save(employee);
            session.clear();
            session.getTransaction().commit();
            System.out.println("Done!");
            System.out.println(employee);
        } finally {
            sessionFactory.close();
        }
    }
}
