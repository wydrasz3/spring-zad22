package pl.sda.person;

import org.springframework.stereotype.Component;

@Component
public class PersonValidator extends AbstractPersonValidator {

    public boolean validate(Person person) {
        return false;
    }
}
