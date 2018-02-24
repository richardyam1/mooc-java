package moving;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import moving.domain.Item;
import moving.domain.Thing;
import moving.logic.Packer;
public class Main{

    public static void main(String[] args) {
        // test your program here
        List<Thing> things = new ArrayList<Thing>();
    things.add(new Item("passport", 2));
    things.add(new Item("toothbrash", 1));
    things.add(new Item("book", 4));
    things.add(new Item("circular saw", 8));

        Packer packer = new Packer(10);
        packer.packThings(things);
    }
}
