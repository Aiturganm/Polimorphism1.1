import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Shark(),
                new Turtle(),
                new Eagle()
        };
        for (int i = 0; i < animals.length; i++) {
            if(animals[i] instanceof Shark){
                ((Shark) animals[i]).attack();
            }else if(animals[i] instanceof Turtle){
                ((Turtle) animals[i]).swim();
            }else if(animals[i] instanceof Eagle){
                ((Eagle) animals[i]).fly();
            }
        }

        for (Animal animal:animals) {
            if(animal instanceof Shark){
                Shark[] sharks = new Shark[]{(Shark)animal};
            }else if(animal instanceof Turtle){
                Turtle[] turtles = new Turtle[]{(Turtle) animal};
            }else if(animal instanceof Eagle){
                Eagle[] eagles = {(Eagle) animal};
            }
        }
    }
}