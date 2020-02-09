package pl.sda.person;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonBeneficiaryValidatorTest {

    @Test
    public void testIsPersonDataNotValid() {
        PersonBeneficiaryValidator validator = new PersonBeneficiaryValidator();
        boolean isPersonValid = validator.validate(new Beneficiary(null, null, 0, 0));
        Assertions.assertFalse(isPersonValid);
    }

    @Test
    public void testIsPersonDataValid() {
        PersonBeneficiaryValidator validator = new PersonBeneficiaryValidator();
        boolean isPersonValid = validator.validate(new Beneficiary("Kasia", "Nowak", 20, 100));
        Assertions.assertTrue(isPersonValid);
    }

}