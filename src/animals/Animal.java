package animals;

public class Animal {
    //attribute - class variable, like a characteristic
    private String name;
    private int age;


    //constructor
    public Animal (String name, int age){
        this.name = name;
        this.age = age;
    }
    public Animal (int age){
        this.name = "Forced name";
        this.age = age;
    }

    // methods
    public void makeSound(){
        System.out.println("Making a sound");
    }

    public void printDetails(){
        System.out.println("Animal name " + name);
        System.out.println("Animal age " + age);
    }
}
