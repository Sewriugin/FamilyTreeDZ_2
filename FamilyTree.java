package idea.scr.familyTree1;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;



public class FamilyTree implements Serializable {
    private ArrayList<Human> humanN;

    public boolean add(Human human){
        if (human == null) {
            return false;
        }
        if (!humanN.contains(human)){
            humanN.add(human);
            if (human.getFather() != null){
                human.getFather().addChild(human);
            }
            if (human.getMother() != null){
                human.getMother().addChild(human);
            }
            return true;
        }
        return false;
    }

    public Human getName(String name){
        for (Human human: humanN){
            if (human.getName().equals(name)){
                return human;
            }
        }
        return null;
    }

    public String getInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append("В дереве ");
        sb.append(humanN.size());
        sb.append(" объектов: \n");
        for (Human human: humanN){
            sb.append(human.getInfo());
            sb.append("\n");
        }
        return sb.toString();
    }


    public void add(String иван, Gender male, LocalDate of) {
    }
}
