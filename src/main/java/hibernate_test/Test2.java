package hibernate_test;


import hibernate_test.entity.Employees;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employees.class)
                .buildSessionFactory();

        try {
            Session session = sessionFactory.getCurrentSession();
            Employees employee = new Employees("SomeName5", "SomeSurName5", "SALES", 6000);
            session.beginTransaction();
//            session.save(employee);
            session.getTransaction().commit();

            int myId = employee.getId();

            session = sessionFactory.getCurrentSession();
            session.beginTransaction();
//            Employees getEmployee = session.get(Employees.class, myId); //SELECT
            session.getTransaction().commit();

//            System.out.println(getEmployee);
            System.out.println("Done!");
        } finally {
            sessionFactory.close();
        }
    }
}
