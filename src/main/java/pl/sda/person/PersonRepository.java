package pl.sda.person;

import org.springframework.stereotype.Component;

@Component
public class PersonRepository<T extends Person> {

    void save(T person) {
        System.out.println("Save person" + person);
    }
}
