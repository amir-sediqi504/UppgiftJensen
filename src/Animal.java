import java.util.ArrayList;
import java.util.Scanner;

public class Animal {

   public void hungrySounds(){
       System.out.println("buhuuuu i'm hungry");
   }

    ArrayList<String> animals = new  ArrayList<String>();
    Scanner addAnimal = new Scanner(System.in);
    Scanner createAnimal = new Scanner(System.in);
    public void addAnimal(){

             System.out.println("add animal: ");
             animals.add(addAnimal.next());
             System.out.println("animal added");
             System.out.println(animals);

    }

    public void listAllAnimals(){
        System.out.println(animals);
    }

    public void endProgram(){
        System.out.println("program avslutas");
        System.exit(0);
    }


}