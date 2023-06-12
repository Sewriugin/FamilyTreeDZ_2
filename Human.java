package idea.scr.familyTree1;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Human implements Serializable{
    private String name;            // имя
    private Gender gender;          // признаки пола
    private LocalDate ateOfBirth;   // дата рождения
    private Human father;           // отец
    private Human mother;           // мать
    private List <Human> children;  // дети

    public Human(String name, Gender gender) {
        this(name, gender, null, null);
    }

    public Human(String name, Gender gender, LocalDate ateOfBirth, Human father, Human mother) {
        this.name = name;
        this.gender = gender;
        this.ateOfBirth = ateOfBirth;
        this.father = father;
        this.mother = mother;
        children = new ArrayList<>();
    }

    public Human(String name, Gender gender, Human father, Human mother) {
        this(name, gender, null, father, mother);
    }

    public boolean addChild(Human child){
        if (!children.contains(child)){
            children.add(child);
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }


    public LocalDate ateOfBirth() {
        return ateOfBirth;
    }


    public Human getFather() {
        return father;
    }

    public Human getMother() {
        return mother;
    }

    public List<Human> getChildren() {
        return children;
    }

    public void setBirthDate(LocalDate ateOfBirth) {
        this.ateOfBirth = ateOfBirth;
    }


    public void setFather(Human father) {
        this.father = father;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Gender getGender() {
        return gender;
    }

    public String getInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append("имя: ");
        sb.append(name);
        sb.append(", ");
        sb.append(getMotherInfo());
        sb.append(", ");
        sb.append(getFatherInfo());
        sb.append(", ");
        sb.append(getChildrenInfo());
        return sb.toString();
    }

    public String getMotherInfo(){
        String res = "мать: ";
        if (mother != null){
            res += mother.getName();
        } else {
            res += "неизвестна";
        }
        return res;
    }

    public String getFatherInfo(){
        String res = "отец: ";
        if (father != null){
            res += father.getName();
        } else {
            res += "неизвестен";
        }
        return res;
    }

    public String getChildrenInfo(){
        StringBuilder res = new StringBuilder();
        res.append("дети: ");
        if (children.size() != 0){
            res.append(children.get(0).getName());
            for (int i = 1; i < children.size(); i++) {
                res.append(", ");
                res.append(children.get(i).getName());
            }
        } else {
            res.append("отсутствуют");
        }
        return res.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Human)){
            return false;
        }
        Human human = (Human) obj;
        return human.getName().equals(getName());
    }

}
