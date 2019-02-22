package nl.gauket.demoreview.service;

import nl.gauket.demoreview.model.Person;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class PersonServiceTest {

    @Autowired
    PersonService personService;

    @Test
    public void shouldReturnAllPersons() throws Exception {
        List<Person> persons = personService.getAllPersons();

        Assert.assertTrue(!persons.isEmpty());
        Assert.assertEquals("Hello", persons.get(0).getName());
        Assert.assertEquals("Bar", persons.get(1).getEmail());
    }

    @Test
    public void shouldReturnSpecificPerson() throws Exception {
        Person person = personService.getOnePerson("Foo");

        Assert.assertEquals("Foo", person.getName());
    }
}
