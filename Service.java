package idea.scr.OOP;

import java.util.Comparator;

public class Service {
    private int id;
    private Group group;

    public Service(Group group) {
        this.group = group;
    }

    public void addHuman(String name, Gender male, int age){
        Human human = new Human(id++, name, age);
        group.addHuman(human);
    }

    public void sortByName(){
        group.getHumanList().sort((Comparator<? super Human>) new HumanComparatorByName());
    }

    public void sortById(){
        group.getHumanList().sort((Comparator<? super Human>) new HumanComparatorById());
    }
}

