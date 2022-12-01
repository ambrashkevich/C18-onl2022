package Military;



import java.util.ArrayList;
import java.util.List;

public class MilitaryOffice {
    private final PersonRegistry registry;

    MilitaryOffice(PersonRegistry registry) {
        this.registry = registry;
    }

    public List<Person> getFilteredConscripts() {

        List<Person> persons = new ArrayList<>();


        for (Person person : registry.getPersonList()) {
            if (person.getAge() >= 18 && person.getAge() <= 27 && person.getSex() == Sex.MALE) {
                persons.add(person);
            }
        }
        return persons;
    }

    public List<Person> getConscriptsInMinsk() {

        List<Person> persons = new ArrayList<>();
        for (Person person : registry.getPersonList()) {
            if (person.getAge() >= 18
                    && person.getAge() <= 27
                    && person.getSex() == Sex.MALE
                    && person.getAddress().getCity().equalsIgnoreCase("Minsk")) {
                persons.add(person);
            }
        }
        return persons;
    }

    public List<Person> getConscriptsWithinRange() {

        List<Person> persons = new ArrayList<>();
        for (Person person : registry.getPersonList()) {
            if (person.getAge() >= 25 && person.getAge() <= 27 && person.getSex() == Sex.MALE) {
                persons.add(person);
            }
        }

        return persons;
    }

    public List<Person> getConscriptsByName(String name) {
        List<Person> persons = new ArrayList<>();
        for (Person person : registry.getPersonList()) {
            if (person.getName().equalsIgnoreCase(name)) {
                persons.add(person);
            }
        }
        return persons;
    }


}
