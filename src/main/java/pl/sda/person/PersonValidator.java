package pl.sda.person;

import org.springframework.stereotype.Component;

@Component
public class PersonValidator extends AbstractPersonValidator {

    public boolean validate(Person person) {
        boolean isFirstNameValid = validateName(person.getFirstName(), 3, 100);
        boolean isLastNameValid = validateName(person.getLastName(), 2, 200);
        boolean isAgeValid = validateAge(person.getAge());
        return isFirstNameValid && isLastNameValid && isAgeValid;
    }


    private boolean validateName(String name, int minLength, int maxLength) {
        return name != null && name.length() > minLength && name.length() < maxLength && isContainsVowelAndNotSpecial(name);
    }

    private boolean isContainsVowelAndNotSpecial(String name) {
        return name.matches(".*[AEIOUaeiou].*") && !name.matches("[^a-zA-Z0-9 ]");
    }

    private boolean validateAge(int age) {
        return age > 0 && age < 150;
    }

}
