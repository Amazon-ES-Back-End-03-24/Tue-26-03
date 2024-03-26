import animals.Animal;
import animals.Cat;
import vehicles.Automobile;
import vehicles.Vehicle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //uncomment the method to call it
        // scannerExample();
        // fileWriter();
        // fileReader();
        // createAndCallAnimals();
        // createAndCallVehicles();
    }

    private static void createAndCallVehicles() {
        Vehicle lisaVehicle = new Vehicle("Generic brand");
        lisaVehicle.printBrand();

        System.out.println("-------");

        Automobile lisaAutomobile = new Automobile("Renault", "Megane");
        lisaAutomobile.printModel();
        lisaAutomobile.printBrand();
    }

    private static void createAndCallAnimals() {
        Animal myFirstAnimal = new Animal("Pepito",12);
        myFirstAnimal.makeSound();
        myFirstAnimal.printDetails();

        System.out.println("-------");

        Animal mySencondAnimal = new Animal(101);
        mySencondAnimal.printDetails();

        System.out.println("-------");
        Cat myFirstCat = new Cat("Tommy", 15, false);
        myFirstCat.makeSound();
        myFirstCat.printDetails();
        myFirstCat.isFeral();

        System.out.println("-------");
        Cat genericCat = new Cat();
        genericCat.printDetails();
        genericCat.isFeral();
        genericCat.callPet();
        genericCat.countEars();
    }

    private static void fileReader() throws FileNotFoundException {
        String fileName = "demo.txt";
        // File
        File myFile = new File(fileName);

        // scanner that receives file input
        Scanner readerScanner = new Scanner(myFile);

        System.out.println("Reading...");
        while (readerScanner.hasNextLine()) {
            String currentWord = readerScanner.nextLine();
            System.out.println(currentWord);
            System.out.println("Has next line " + readerScanner.hasNextLine());
        }
        System.out.println("Finished reading!");
        readerScanner.close();
    }

    private static void fileWriter() throws IOException {
        // scanner that receives terminal input
        Scanner scanner = new Scanner(System.in);
        String fileName = "demo.txt";

        //FileWriter to create a file
        FileWriter myWriter = new FileWriter(fileName);
        System.out.println("Writing...");
        myWriter.write("My first line in my file\n");
        myWriter.write("My second line in my file\n");


        System.out.println("Write something here:");
        String userInput = scanner.nextLine();
        myWriter.write(userInput);

        // ALWAYS, if not nothing will appear
        myWriter.close();
        scanner.close();
    }

    private static void scannerExample() {
        // scanner that receives terminal input
        Scanner myFirstScanner = new Scanner(System.in);

        //next() -- next input without spaces
        System.out.println("Input your name (just one word)");
        String name = myFirstScanner.next();
        System.out.println("Your name is " + name);

        // next input with spaces and line break \n
        // String ignoredInput = myFirstScanner.nextLine();
        // System.out.println("This is the input i'm ignoring " + ignoredInput);
        myFirstScanner.nextLine();

        //nextLine() -- next input with spaces and "salto de línea" \n
        System.out.println("Input your last name");
        String lastName = myFirstScanner.nextLine();
        System.out.println("Your last name is " + lastName);

        //nextInt()
        System.out.println("Input your age");
        int age = myFirstScanner.nextInt();
        System.out.println("Your age is " + age);


        System.out.println("Input your first and last name and your age");
        String firstName = myFirstScanner.next();
        String lastName2 = myFirstScanner.next();
        int age2 = myFirstScanner.nextInt();
        System.out.println("Your name is " + firstName + " " + lastName2 + " and you're " + age2 + " years old");

        // always close a scanner when finished using it
        myFirstScanner.close();
    }
}