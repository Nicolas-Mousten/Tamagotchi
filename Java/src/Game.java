import java.util.Scanner;

public class Game {
    //---------------------------------------------------------
    public static Tamagotchi output;

    //---------------------------------------------------------
    public static Scanner scanner(){
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Tamagotchi! \nWhat animal would you like your digital animal to be? Cat/Dog");
        boolean isDogOrCat = true;
        while (isDogOrCat) {
            String digitalAnimalChoice = scanner().nextLine();
            if(digitalAnimalChoice.equalsIgnoreCase("Cat")){
                Tamagotchi output = catCreator();
                isDogOrCat = false;
            }else if(digitalAnimalChoice.equalsIgnoreCase("Dog")){
                Tamagotchi output = dogCreator();
                isDogOrCat = false;
            }
        }
        System.out.println(output);
        System.out.println("Out of loop");
    }
    public static Dog dogCreator(){
        System.out.println("What name would you like your dog to have?");
        String dogName = scanner().nextLine();
        Dog dog = new Dog(dogName, 10, 10, 10);
        return dog;
    }
    public static Cat catCreator(){
        System.out.println("What name would you like your cat to have?");
        String catName = scanner().nextLine();
        Cat cat = new Cat(catName, 10, 10, 10);
        return cat;
    }
}
