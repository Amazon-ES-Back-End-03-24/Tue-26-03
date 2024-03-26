package vehicles;

public class Vehicle {

    //to use it in override printBrand in Automobile class it is protected
    protected String brand;

    public Vehicle(String myBrand){
        brand = myBrand;
    }

    public void printBrand(){
        System.out.println("My vehicle is a " + brand);
    }
}
