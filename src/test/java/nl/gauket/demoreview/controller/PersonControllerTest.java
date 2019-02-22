package nl.gauket.demoreview.controller;

import nl.gauket.demoreview.model.Person;
import nl.gauket.demoreview.service.PersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(PersonController.class)
public class PersonControllerTest {

    private static final String PERSONS_ENDPOINT = "/persons";
    private static final String SPECIFIC_PERSON_ENDPOINT = "/persons/";

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PersonService personService;

    @Test
    public void shouldReturnAllPersons() throws Exception {
        when(personService.getAllPersons())
                .thenReturn(
                        Arrays.asList(
                                new Person("Hello", "World"),
                                new Person("Foo", "Bar")
                        )
                );

        this.mockMvc.perform(get(PERSONS_ENDPOINT)
                .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("{\"name\":\"Foo\",\"email\":\"Bar\"}")));
    }

    @Test
    public void shouldReturnSpecificPerson() throws Exception {
        when(personService.getOnePerson("Foo"))
                .thenReturn(
                        new Person("Foo", "Bar")
                );

        this.mockMvc.perform(get(SPECIFIC_PERSON_ENDPOINT + "Foo")
                .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("{\"name\":\"Foo\",\"email\":\"Bar\"}")));
    }
}
