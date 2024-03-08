package com.pandi;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ControllerTest {


    @Autowired
    private TestController testController;

    @Test
    public void loadContext(){
        assertThat(testController).isNotNull();
    }

    @SpringBootApplication
    static class TestConfiguration {

    }
}
