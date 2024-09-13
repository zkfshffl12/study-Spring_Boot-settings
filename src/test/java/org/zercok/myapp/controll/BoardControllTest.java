package org.zercok.myapp.controll;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;

@Slf4j

@NoArgsConstructor

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class BoardControllTest {

    @Autowired private BoardController bcr;

    @BeforeAll
        void BeforeAll(){
        log.info("BeforeAll() invoked");

        Objects.requireNonNull(bcr);
        log.trace("\t+bcr: {} invoked");

    }


    void testHello(){
        log.trace("testHello() invoked");

        final String name ="bee";
        String result =this.controller.hello(name);

        asserEquals("hello bee",result);

    }
}
