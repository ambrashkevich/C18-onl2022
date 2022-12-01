//Необходимо написать военкомат.
//    1) Создаем класс военкомат MilitaryOffice
//    2) Создать в классе MilitaryOffice конструктор, который принимает PersonRegistry
//    3) PersonRegistry содержит список людей (Person), которые могут быть призваны в армию
//    4) Создать класс Person, который будет содержать следующие поля имя, возраст, пол, адрес(страна, город)
//    Военкомат должен уметь:
//    a) вывести имена всех людей годных к военной службе на текущий момент времени, которые есть в PersonRegistry
//    T.е нужно написать метод в классе MilitaryOffice, который будет отфильтровывать годных к службе призывников
//    (годными считать мущин от 18 до 27 лет, проверяем пол и возраст)
//    б) вывести количество годных призывников в городе Минске.
//    в) вывести количество призывников от 25 до 27 лет
//    г) вывести количество призывников у которых имя Александр.
//    5) Создать класс Main, наполнить PersonRegistry людьми, по желанию можно создавать людей через консоль
//    */
package Military;

import java.util.List;

public class MilitaryTask {

    static void printPersonList(List<Person> personList){
        personList.forEach(System.out::println);
    }


    public static void main(String[] args) {

        PersonRegistry personRegistry = new PersonRegistry(
                List.of(
                        new Person("Vadim", 18, Sex.MALE,new Address( "Belarus", "Minsk")),
                        new Person("Alexander", 20, Sex.MALE,new Address( "Belarus", "Baranovichi")),
                        new Person("Natasha", 23, Sex.FEMALE,new Address ("Belarus", "Grodno")),
                        new Person("Vlad", 24, Sex.MALE,new Address ("Belarus", "Vitebsk")),
                        new Person("Vanya", 25, Sex.MALE,new Address ("Belarus", "Gomel"))
                ));

        MilitaryOffice militaryOffice = new MilitaryOffice(personRegistry);

        System.out.println("Все призывники:");
        printPersonList(militaryOffice.getFilteredConscripts());

        System.out.println("Призывники с именем Александр");
        printPersonList(militaryOffice.getConscriptsByName("Alexander"));

        System.out.println("Призывники в Минске");
        printPersonList(militaryOffice.getConscriptsInMinsk());

        System.out.println("Призывники от 25 до 27 лет");
        printPersonList(militaryOffice.getConscriptsWithinRange());

    }
}
