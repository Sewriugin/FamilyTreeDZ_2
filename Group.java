package idea.scr.OOP;

import java.util.List;

public interface Group<T> extends java.lang.Iterable<T> {
    void addHuman(T human);
    List<Human> getHumanList();
}
