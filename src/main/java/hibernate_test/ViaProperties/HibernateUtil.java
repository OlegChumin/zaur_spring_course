package hibernate_test.ViaProperties;

import java.util.Properties;

import hibernate_test.entity.Employees;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory sessionFactory;

    static {
        Configuration configuration = new Configuration();
        Properties properties = new Properties();
        properties.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
        properties.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/my_db?useSSL=false&amp;serverTimezone=UTC&amp;allowPublicKeyRetrieval=true");
        properties.setProperty("hibernate.connection.username", "bestuser");
        properties.setProperty("hibernate.connection.password", "bestuser");
        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        properties.setProperty("hibernate.show_sql", "true");
        configuration.setProperties(properties);
        configuration.addAnnotatedClass(Employees.class);
        sessionFactory = configuration.buildSessionFactory();
    }

    public static Session getSession() {
        return sessionFactory.openSession();
    }

    public static void closeSession(Session session) {
        if (session != null) {
            session.close();
        }
    }
}
