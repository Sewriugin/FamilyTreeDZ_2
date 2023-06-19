package idea.scr.OOP;

import java.util.Comparator;

public class HumanComparatorById implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        return Integer.compare(o2.getId(), o1.getId());
    }
}
