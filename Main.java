package idea.scr.familyTree1;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        FamilyTree familyTree = new FamilyTree();
        familyTree.add("Иван", Gender.Male, LocalDate.of(1984, 11, 12));

        System.out.println(familyTree.getInfo());
    }
}
