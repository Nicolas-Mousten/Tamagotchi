import java.util.Scanner;

public class Game {
    //---------------------------------------------------------

    //---------------------------------------------------------
    public static Scanner scanner(){
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }
    public static void main(String[] args) {
        Tamagotchi output = null;
        System.out.println("Welcome to Tamagotchi! \nWhat animal would you like your digital animal to be? Cat/Dog");
        boolean isDogOrCat = true;
        while (isDogOrCat) {
            String digitalAnimalChoice = scanner().nextLine();
            if(digitalAnimalChoice.equalsIgnoreCase("Cat")){
                output = catCreator();
                isDogOrCat = false;
            }else if(digitalAnimalChoice.equalsIgnoreCase("Dog")){
                output = dogCreator();
                isDogOrCat = false;
            }
        }
        //------------------You have gotten your animal with name and full bars on age, mood, energy. now the game begins
        System.out.println("Here is " + output.name);
        if(output.type=="Dog"){
            Pictures.normalDog();
        }else{
            Pictures.normalCat();
        }
        while(output.age != 0){
            System.out.println("What would you like to do?\n1 - Play\n2 - feed\n3 - sleep");
            int choice = scanner().nextInt();
            if(choice == 1){
                System.out.println("You are playing with "+output.name);
                Pictures.unStimulatedCat();
                if(output.mood == 10) {
                    output.age = output.age - 1;
                }else{
                    output.mood = output.mood + 1;
                }
                output.energy = output.energy - 1;

            }else if(choice == 2){
                System.out.println("you are feeding " + output.name);
                Pictures.normalCat();
                if(output.energy == 10){
                    output.age = output.age - 1;
                }else{
                    output.energy = output.energy + 1;
                }
                output.mood = output.mood - 1;
            }else if(choice == 3){
                System.out.println(output.name + " is sleeping");
                Pictures.tiredCat();
                if(output.energy < 10){
                    output.age = output.age - 1;
                }else{
                    output.mood = output.mood + 1;
                    output.energy = output.energy + 1;
                }
            }
            if(output.age <= 0){
                System.out.println(output.name + " died, you should think more about how you take care of your " + output.type);
            }

        }
    }

    public static Dog dogCreator(){
        System.out.println("What name would you like your dog to be named?");
        String dogName = scanner().nextLine();
        Dog dog = new Dog(dogName, "Dog", 10, 10, 10);
        return dog;
    }
    public static Cat catCreator(){
        System.out.println("What name would you like your cat to be named?");
        String catName = scanner().nextLine();
        Cat cat = new Cat(catName, "Cat", 10, 10, 10);
        return cat;
    }

}
