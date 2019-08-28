package nl.gauket.demoreview.repository;

import nl.gauket.demoreview.model.Person;
import nl.gauket.demoreview.model.Status;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class PersonRepository {
    private static final Logger logger = LoggerFactory.getLogger("n.g.d.repository.PersonRepository");

    private List<Person> persons = new ArrayList<>(
            Arrays.asList(
                    new Person("Hello", "World"),
                    new Person("Foo", "Bar")
            )
    );

    public List<Person> getAllPersons() {
        logger.info("return all persons");
        return persons;
    }

    public Status getStatus() {
        return new Status();
    }
}
