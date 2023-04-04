package hibernate_test.ViaProperties;

import hibernate_test.entity.Employees;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Test {
    public static void main(String[] args) {
        Session session = null;
        try {
            session = HibernateUtil.getSession();
            Employees employee = new Employees("Oleg", "Chumin", "IT", 10_400);
            Transaction transaction = session.beginTransaction();
            session.save(employee);
            transaction.commit();
            System.out.println("Employee saved with id: " + employee.getId());
        } finally {
            HibernateUtil.closeSession(session);
        }
    }
}
