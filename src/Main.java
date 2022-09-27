import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Animal a = new Animal(); // Objekt a från Animal klass

        System.out.println("Press 0 to exit program\nPress 1 twice to add animal\npress 2 to list all animals\nPress 3 to create new animal object");
        Scanner userInput = new Scanner(System.in);
        System.out.println("enter num");
        int in;
        while (userInput.nextInt() == 1){

            a.addAnimal(); // add animal then int
            System.out.println("press 1 to add another animal, press 2 2 times to list added animals,\n press 3 3 times to have an inherited object do something or 0 to exit application");

        }
        if (userInput.nextInt() == 2) {
            a.listAllAnimals();
            //userInput.nextInt();
        } else if (userInput.nextInt() == 0) {
            a.endProgram();
        } else if (userInput.nextInt() == 3) {
            Doggy valp = new Doggy();
            valp.hungrySounds();
        }

    }
}