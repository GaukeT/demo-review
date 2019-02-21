package nl.gauket.demoreview.controller;

import nl.gauket.demoreview.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {
    private static final Logger logger = LoggerFactory.getLogger("n.g.d.controller.PersonController");
    private static final List<Person> persons;

    static {
        persons = new ArrayList<>();
        persons.add(new Person("Hello", "World"));
        persons.add(new Person("Foo", "Bar"));
    }

    private PersonController() {
    }

    @GetMapping(path = "/persons")
    public static List<Person> getPersons() {
        logger.info("return all persons");
        return persons;
    }

    @GetMapping(path = "/persons/{name}")
    public static Person getPerson(@PathVariable("name") String name) {
        logger.info("return a specific person");
        return persons.stream()
                .filter(person -> name.equalsIgnoreCase(person.getName()))
                .findAny().orElse(null);
    }
}
