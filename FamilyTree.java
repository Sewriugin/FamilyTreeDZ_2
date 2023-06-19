package idea.scr.OOP;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class FamilyTree<T> implements Iterable<E> {
    private List<T> humanList;

    public FamilyTree() {
        humanList = new ArrayList<>();
    }

    public void addHuman(T human){
        humanList.add((T) human);
    }

    @Override
    public Iterator<T> iterator() {
        return new HumanIterator<>(humanList);
    }
    public void sortByIde(){
        humanList.sort((Comparator<? super T>) new HumanComparatorById());
    }

    public void sortByName(){
        humanList.sort((Comparator<? super T>) new HumanComparatorByName());
    }

    @Override
    public void sortedNamePerson(ArrayList<idea.scr.familyTree1.Human> listHuman) {

    }

    @Override
    public void sortedDatePerson(ArrayList<idea.scr.familyTree1.Human> listHuman) {

    }
}