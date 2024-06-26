package _01_spring_introduction.lesson001_013._013;

/**
 кратко о модификаторах доступа в Java:
 public: доступен из любого места в программе.
 private: доступен только внутри класса, в котором он объявлен.
 protected: доступен внутри того же пакета и в подклассах (даже если они находятся в другом пакете).
 default (называют еще package-private): доступен только внутри того же пакета.
 */

public class Person {
    private String name;
    private int age;

    public Person() {
        System.out.println("Person bean is created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void init() {
        // open resources
        System.out.println("Person bean is going through init.");
    }

    public void destroy() {
        // resources close
        System.out.println("Person bean will destroy now.");
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
