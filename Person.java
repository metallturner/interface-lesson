package Interfacec;

public class Person implements Info {
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hey, Hello!");
    }


    @Override
    public void showInfo() {
        System.out.println("name is "+this.name);
    }
}

