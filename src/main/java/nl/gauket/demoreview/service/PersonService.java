package nl.gauket.demoreview.service;

import nl.gauket.demoreview.model.Person;
import nl.gauket.demoreview.repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private static final Logger logger = LoggerFactory.getLogger("n.g.d.service.PersonService");

    @Autowired
    PersonRepository personRepository;

    public List<Person> getAllPersons() {
        logger.info("return all persons");
        return personRepository.getAllPersons();
    }

    public Person getOnePerson(String name) {
        logger.info("return a specific person");
        return personRepository.getAllPersons()
                .stream()
                .filter(person -> name.equalsIgnoreCase(person.getName()))
                .findAny().orElse(null);
    }
}
