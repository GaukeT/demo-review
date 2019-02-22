package nl.gauket.demoreview;

import nl.gauket.demoreview.controller.PersonController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class DemoReviewApplicationTests {

    @Autowired
    private PersonController personController;

    @Test
    public void contextLoads() {
        assertThat(personController).isNotNull();
    }

}

