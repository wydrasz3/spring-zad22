package pl.sda.person;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonValidatorTest {

    @Test
    public void testIsPersonDataNotValid() {
        PersonValidator validator = new PersonValidator();
        boolean isPersonValid = validator.validate(new Person(null, null, 0));
        Assertions.assertFalse(isPersonValid);
    }

    @Test
    public void testIsPersonDataValid() {
        PersonValidator validator = new PersonValidator();
        boolean isPersonValid = validator.validate(new Person("Kasia", "Nowak", 20));
        Assertions.assertTrue(isPersonValid);
    }
}