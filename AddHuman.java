package idea.scr.OOP;

import java.util.List;

public interface AddHuman<T> extends java.lang.Iterable<T> {
    void addHuman(T human);
    List<T> getHumanList();
}
