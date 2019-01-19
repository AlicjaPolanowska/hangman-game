import java.util.ArrayList;
import java.util.Random;

public class Animals implements Category {
    public ArrayList<String> animals;
    public Random rand;

    public Animals (){
        animals = new ArrayList<String>();
        animals.add("sheep");
        animals.add("cat");
        animals.add("dog");
        animals.add("camel");
        animals.add("crocodile");
        animals.add("bear");
        animals.add("cow");
        animals.add("horse");
        animals.add("pig");
        animals.add("elephant");
        animals.add("giraffe");
        animals.add("goose");
        animals.add("cock");
        animals.add("hen");
        animals.add("fox");
        animals.add("wolf");
        animals.add("elk");
        animals.add("mouse");
        animals.add("frog");
        animals.add("kangaroo");
        animals.add("ant");
        animals.add("owl");
        animals.add("ladybug");
        animals.add("grasshopper");
        animals.add("turtle");
        animals.add("deer");
        animals.add("monkey");
        animals.add("rabbit");
        animals.add("hippo");
        animals.add("butterfly");
        animals.add("bee");
        rand = new Random();
    }

    public String randObject() {
        int index = rand.nextInt(30);
        return animals.get(index);
    }

    public String getCategory() {
        return "Animals";
    }


}
