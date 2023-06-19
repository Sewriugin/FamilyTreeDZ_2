package idea.scr.OOP;

import java.time.LocalDate;
import java.time.Period;

public class Human implements Comparable<Human> {
    private int id;                 // идентификационный номер
    private String fullName;        // имя
    private Gender gender;          // признаки пола
    private LocalDate ateOfBirth;   // дата рождения
    private LocalDate currentDate;  // текущая дата (для расчёта возраста)
    private int age;                // возраст


    public Human(int id, String fullName, int age) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
    }


        public Human(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }


    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public Gender getGender() {
        return gender;
    }

//    public LocalDate getAteOfBirth() {
//        return ateOfBirth;
//    }

//    public LocalDate getCurrentDate() {
//        return currentDate;
//    }


    public int calculateAge(LocalDate ateOfBirth, LocalDate currentDate){
        return Period.between(ateOfBirth, currentDate).getYears();
    }

    @Override
    public String toString() {
        return "human.Human{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                '}';
    }


    @Override
    public int compareTo(Human o) {
        return fullName.compareTo(o.getFullName());
    }


}
