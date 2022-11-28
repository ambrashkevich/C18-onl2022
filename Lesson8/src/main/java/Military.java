//1) задача!
//    /*
//    Необходимо написать военкомат.
//    1) Создаем класс военкомат MilitaryOffice *
//    2) Создать в классе MilitaryOffice конструктор, который принимает PersonRegistry *
//    3) PersonRegistry содержит список людей (Person), которые могут быть призваны в армию *
//    4) Создать класс Person, который будет содержать следующие поля имя, возраст, пол, адрес(страна, город)*
//    Военкомат должен уметь:
//    a) вывести имена всех людей годных к военной службе на текущий момент времени, которые есть в PersonRegistry
//    T.е нужно написать метод в классе MilitaryOffice, который будет отфильтровывать годных к службе призывников
//    (годными считать мущин от 18 до 27 лет, проверяем пол и возраст)
//    б) вывести количество годных призывников в городе Минске.
//    в) вывести количество призывников от 25 до 27 лет
//    г) вывести количество призывников у которых имя Александр.
//    5) Создать класс Main, наполнить PersonRegistry людьми, по желанию можно создавать людей через консоль
//    */

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Military {
    public static void main(String[] args) {

        PersonRegistry personRegistry = new PersonRegistry(
                List.of(
                        new Person("Vadim", 18, Sex.MALE, "Belarus", "Minsk"),
                        new Person("Alexander", 20, Sex.MALE, "Belarus", "Baranovichi"),
                        new Person("Natasha", 23, Sex.FAMALE, "Belarus", "Grodno"),
                        new Person("Vlad", 24, Sex.MALE, "Belarus", "Vitebsk"),
                        new Person("Vanya", 25, Sex.MALE, "Belarus", "Gomel"),
                        new Person("Andrey", 28, Sex.MALE, "Belarus", "Brest")
                )
        );
        MilitaryOffice militaryOffice = new MilitaryOffice(personRegistry);
        System.out.println("Кол-во годных:");
        militaryOffice.filterConscripts();
        System.out.println("Призывники с именем Александр");
        militaryOffice.findConscriptsByName("Alexander");
        System.out.println("Призывники в городе Минске");
        militaryOffice.findConscriptsInMinsk();
        System.out.println("Кол-во призывников от 25 до 27");
        militaryOffice.findConscriptsWithinRange();

    }
}


class Person {
    private String name;
    private int age;
    private Sex sex;
    private String address;

    public Person(String name, int age, Sex sex, String Country, String city) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = Country + " " + city;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", address='" + address + '\'' +
                '}';

    }

}

class PersonRegistry {
    List<Person> personList;

    PersonRegistry(List<Person> personList) {
        this.personList = personList;
    }

}

class MilitaryOffice {
    PersonRegistry registry;

    MilitaryOffice(PersonRegistry registry) {
        this.registry = registry;
    }

    public void filterConscripts() {
        for (Person person : registry.personList) {
            if (person.getAge() >= 18 && person.getAge() <= 27 && person.getSex() == Sex.MALE) {
                System.out.println(person);
            }
        }


    }

    public void findConscriptsInMinsk() {
        for (Person person : registry.personList) {
            if (person.getAge() >= 18 && person.getAge() <= 27 && person.getSex() == Sex.MALE && person.getAddress().matches(".*\\bMinsk\\b.*")) {
                System.out.println(person);
            }
        }
    }

    public void findConscriptsWithinRange() {
        for (Person person : registry.personList) {
            if (person.getAge() >= 25 && person.getAge() <= 27 && person.getSex() == Sex.MALE) {
                System.out.println(person);
            }
        }
    }

    public void findConscriptsByName(String name) {
        for (Person person : registry.personList) {
            if (person.getName().matches(name)) {
                System.out.println(person);
            }
        }
    }
}


enum Sex {
    MALE,
    FAMALE
}





