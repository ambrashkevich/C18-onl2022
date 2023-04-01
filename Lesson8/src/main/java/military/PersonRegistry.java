package military;

import java.util.List;

public class PersonRegistry {

    private final List<Person> personList;

    PersonRegistry(List<Person> personList) {
        this.personList = personList;
    }

    public List<Person> getPersonList() {
        return personList;
    }
}
