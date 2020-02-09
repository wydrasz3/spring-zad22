package pl.sda.person;

import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

@Component
public class PersonValidator extends AbstractPersonValidator {

    public boolean validate(Person person) {
        boolean isFirstNameValid = validateName(person.getFirstName(), 3, 100);
        boolean isLastNameValid = validateName(person.getLastName(), 2, 200);
        boolean isAgeValid = validateRange(person.getAge(), 1, 150);
        boolean isNamesEqual = ObjectUtils.nullSafeEquals(person.getFirstName(), person.getLastName());
        return isFirstNameValid && isLastNameValid && isNamesEqual && isAgeValid;
    }

}
