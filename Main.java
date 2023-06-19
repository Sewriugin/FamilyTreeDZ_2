package idea.scr.OOP;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Group group = new FamilyTree() {
            @Override
            public List<Human> getHumanList() {
                return null;
            }
        };
        Service service = new Service((FamilyTree) group);
        service.addHuman("Павел Геннадьевич Иванов", Gender.Male, 34);
        service.addHuman("Мария Петровна Петрова", Gender.Female, 25);
        service.addHuman("Александр Петрович Кузнецов", Gender.Male, 45);
        service.addHuman("Наталья Ивановна Кудряшова", Gender.Female, 5);


        Iterator<T> iterator = group.iterator();
        while (iterator.hasNext()){
            T human = iterator.next();
            System.out.println(T);
        }
//        for (Human human: group){
//            System.out.println(human);
//        }

        service.sortByName();
        System.out.println();


        for (T human: group){
            System.out.println(T);
        }

        service.sortById();
        System.out.println();

        for (T human: group){
            System.out.println(T);
        }

    }
}
