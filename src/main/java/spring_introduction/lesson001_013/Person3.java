package spring_introduction.lesson001_013;
//DI by setter

public class Person3 {
    //fields for Person3
    private String name;
    private String surName;
    private int age;

    //Pet
    private Pet pet;


    public Person3() {
        System.out.println("Person3 bean been created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Class Person3: set name");
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        System.out.println("Class Person3: set surName");
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person3: set age");
        this.age = age;
    }

    public void setPet(Pet pet) {
        System.out.println("Class Person3: set pet");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
