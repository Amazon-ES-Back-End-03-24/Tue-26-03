package vehicles;

public class Automobile extends Vehicle{

    private String model;


    public Automobile(String myBrand, String myModel) {
        super(myBrand);
        model = myModel;
    }

    public void printModel(){
        System.out.println("My automobile is a " + model);
    }

    @Override
    public void printBrand(){
        System.out.println("My automobile is a " + brand);
    }
}
