package nl.gauket.demoreview.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class PersonControllerTest {

    private static final String PERSONS_ENDPOINT = "/persons";
    private static final String SPECIFIC_PERSON_ENDPOINT = "/persons/";


    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnPersons() throws Exception {
        this.mockMvc.perform(get(PERSONS_ENDPOINT))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    public void shouldReturnSpecificPersons() throws Exception {
        this.mockMvc.perform(get(SPECIFIC_PERSON_ENDPOINT + "Foo"))
                .andDo(print())
                .andExpect(status().isOk());
    }
}