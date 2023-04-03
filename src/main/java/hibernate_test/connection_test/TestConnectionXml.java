package hibernate_test.connection_test;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestConnectionXml {
    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        try (SessionFactory sessionFactory = cfg.buildSessionFactory()) {
            System.out.println("Connection successful!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
