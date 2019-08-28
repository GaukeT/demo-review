package nl.gauket.demoreview.controller;

import nl.gauket.demoreview.model.Person;
import nl.gauket.demoreview.model.Status;
import nl.gauket.demoreview.service.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {
    private static final Logger logger = LoggerFactory.getLogger("n.g.d.controller.PersonController");

    @Autowired
    PersonService personService;

    @GetMapping(path = "/persons")
    public List<Person> getPersons() {
        logger.info("return all persons");
        return personService.getAllPersons();
    }

    @GetMapping(path = "/persons/{name}")
    public Person getPerson(@PathVariable("name") String name) {
        logger.info("return a specific person");
        return personService.getOnePerson(name);
    }

    @GetMapping(path = "/status")
    public Status getStatus() {
        return personService.getStatus();
    }
}
