import java.util.ArrayList;
import java.util.Random;

public class Fruits implements Category {
    public ArrayList<String> fruits;
    public Random rand;

    public Fruits (){
        fruits = new ArrayList<String>();
        fruits.add("orange");
        fruits.add("peach");
        fruits.add("strawberry");
        fruits.add("blueberry");
        fruits.add("pineapple");
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("fig");
        fruits.add("cherry");
        fruits.add("lime");
        fruits.add("kiwi");
        fruits.add("plum");
        fruits.add("lemon");
        fruits.add("coconut");
        fruits.add("grape");
        fruits.add("pear");
        fruits.add("mango");
        fruits.add("papaya");
        fruits.add("watermelon");
        rand = new Random();
    }

    public String randObject() {
        int index = rand.nextInt(18);
        return fruits.get(index);
    }

    public String getCategory() {
        return "Fruits";
    }


}
