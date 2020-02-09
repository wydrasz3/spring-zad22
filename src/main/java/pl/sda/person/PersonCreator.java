package pl.sda.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonCreator {

    private final PersonValidator personValidator;
    private final PersonBeneficiaryValidator beneficiaryValidator;
    private final PersonRepository<Person> personRepository;
    private final PersonRepository<Beneficiary> beneficiaryRepository;

    @Autowired
    public PersonCreator(PersonValidator personValidator, PersonBeneficiaryValidator beneficiaryValidator,
                         PersonRepository<Person> personRepository,
                         PersonRepository<Beneficiary> beneficiaryRepository) {
        this.personValidator = personValidator;
        this.beneficiaryValidator = beneficiaryValidator;
        this.personRepository = personRepository;
        this.beneficiaryRepository = beneficiaryRepository;
    }

    boolean createPerson(Person person) {
        if (personValidator.validate(person)) {
            personRepository.save(person);
            return true;
        }
        return false;
    }

    boolean createBeneficiary(Beneficiary beneficiary) {
        if (beneficiaryValidator.validate(beneficiary)) {
            beneficiaryRepository.save(beneficiary);
            return true;
        }
        return false;
    }


}
