public class Tamagotchi {
    public String name;
    public int age;
    public int mood;
    public int energy;
    public Tamagotchi(String name, int age, int mood, int energy){
        this.name = name;
        this.age = age;
        this.mood = mood;
        this.energy = energy;
    }
    @Override
    public String toString() {
        return "Tamagotchi{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mood=" + mood +
                ", energy=" + energy +
                '}';
    }
}

class Cat extends Tamagotchi{
    public Cat(String name, int age, int mood, int energy){
        super(name, age, mood, energy);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mood=" + mood +
                ", energy=" + energy +
                '}';
    }
}

class Dog extends Tamagotchi{
    public Dog(String name, int age, int mood, int energy){
        super(name, age, mood, energy);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mood=" + mood +
                ", energy=" + energy +
                '}';
    }
}
