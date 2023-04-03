package hibernate_test;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import hibernate_test.entity.Employee;

public class Test1 {
    public static void main(String[] args) {

        // установка параметров подключения к базе данных
        Properties properties = new Properties();
        properties.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
        properties.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/my_db?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true");
        properties.setProperty("hibernate.connection.username", "bestuser");
        properties.setProperty("hibernate.connection.password", "bestuser");
        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        properties.setProperty("hibernate.show_sql", "true");
        properties.setProperty("hibernate.current_session_context_class", "thread");

        // создание и настройка объекта ServiceRegistry
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .applySettings(properties)
                .build();

        // создание объекта SessionFactory
        SessionFactory sessionFactory = new MetadataSources(registry)
                .addAnnotatedClass(Employee.class)
                .buildMetadata()
                .buildSessionFactory();

        try {
            // создание объекта Session и начало транзакции
            Session session = sessionFactory.getCurrentSession();
            Employee employee = new Employee("Oleg", "Chumin", "IT", 10_400);
            session.beginTransaction();

            // сохранение объекта Employee в базе данных
            session.save(employee);

            // коммит транзакции и закрытие сессии
            session.getTransaction().commit();
            System.out.println("Done!");
            System.out.println(employee);
        } finally {
            // закрытие объекта SessionFactory
            sessionFactory.close();
        }
    }
}
