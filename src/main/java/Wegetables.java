import java.util.ArrayList;
import java.util.Random;

public class Wegetables implements Category {
    public ArrayList<String> wegetables;
    public Random rand;

    public Wegetables (){
        wegetables = new ArrayList<String>();
        wegetables.add("asparagus");
        wegetables.add("artichoke");
        wegetables.add("beetroot");
        wegetables.add("pepper");
        wegetables.add("broccoli");
        wegetables.add("brussels");
        wegetables.add("cabbage");
        wegetables.add("carrot");
        wegetables.add("cauliflower");
        wegetables.add("celery");
        wegetables.add("corn");
        wegetables.add("cucumber");
        wegetables.add("eggplant");
        wegetables.add("bean");
        wegetables.add("lettuce");
        wegetables.add("mushroom");
        wegetables.add("onion");
        wegetables.add("pea");
        wegetables.add("potato");
        wegetables.add("pumpkin");
        wegetables.add("radish");
        wegetables.add("tomato");
        wegetables.add("zucchini");
        rand = new Random();
    }

    public String randObject() {
        int index = rand.nextInt(22);
        return wegetables.get(index);
    }

    public String getCategory() {
        return "Wegetables";
    }


}
