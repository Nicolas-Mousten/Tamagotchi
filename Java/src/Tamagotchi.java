public class Tamagotchi {
    public String type;
    public String name;
    public int age;
    public int mood;
    public int energy;
    public Tamagotchi(String name,String type, int age, int mood, int energy){
        this.name = name;
        this.type = type;
        this.age = age;
        this.mood = mood;
        this.energy = energy;
    }

    @Override
    public String toString() {
        return "Tamagotchi{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", mood=" + mood +
                ", energy=" + energy +
                '}';
    }
}

class Cat extends Tamagotchi{
    public Cat(String name, String type, int age, int mood, int energy){
        super(name, type, age, mood, energy);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", mood=" + mood +
                ", energy=" + energy +
                '}';
    }
}

class Dog extends Tamagotchi{
    public Dog(String name, String type, int age, int mood, int energy){
        super(name, type, age, mood, energy);
    }


    @Override
    public String toString() {
        return "Dog{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", mood=" + mood +
                ", energy=" + energy +
                '}';
    }
}
