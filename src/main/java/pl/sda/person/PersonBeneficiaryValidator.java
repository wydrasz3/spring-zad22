package pl.sda.person;

import org.springframework.stereotype.Component;

@Component
public class PersonBeneficiaryValidator extends AbstractPersonValidator {

    public boolean validate(Beneficiary person) {
        boolean isFirstNameValid = validateName(person.getFirstName(), 3, 100);
        boolean isLastNameValid = validateName(person.getLastName(), 0, 150);
        boolean isShareValid = validateRange(person.getShare(), 1, 100);
        return isFirstNameValid && isLastNameValid && isShareValid;

    }

}
