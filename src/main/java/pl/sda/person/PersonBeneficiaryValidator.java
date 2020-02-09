package pl.sda.person;

import org.springframework.stereotype.Component;

@Component
public class PersonBeneficiaryValidator extends AbstractPersonValidator {

    public boolean validate(Beneficiary person) {
        return false;
    }

}
