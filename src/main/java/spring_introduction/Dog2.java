package spring_introduction;

public class Dog2 implements Pet{
    private String name;
    public Dog2() {
        System.out.println("Dog bean is created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void say() {
        System.out.println("Dog is barking Bow-wow");
    }
}
