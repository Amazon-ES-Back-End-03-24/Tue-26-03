package animals;

public class Cat extends Animal {

    // default value false
    private boolean isFeral;

    // default value null
    private String petName;

    // default value 0
    private int numberOfEars;

    public Cat(String name, int age, boolean isFeral) {
        super(name, age);
        this.isFeral = isFeral;
    }

    public Cat(int age) {
        super(age);
        this.isFeral = isFeral;
    }

    public Cat() {
        super("Generic Name", 1);
    }

    //Annotation
    @Override
    public void makeSound(){
        System.out.println("Miauuuu");
    }

    public void isFeral(){
        System.out.println("This cat is feral " + this.isFeral);
    }

    public void callPet(){
        System.out.println(this.petName);
    }

    public void countEars(){
        System.out.println(this.numberOfEars);
    }
}
