package org.zercok.myapp;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.TimeUnit;

@Slf4j

@NoArgsConstructor

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)

public class BoardServiceTests {
    @Autowired private  BoardServ;

    //unit = TimeUnit.MINUTES
    //@Disabled
    @Order(1)
    @Test
    //@RepeatedTest(1)
    @DisplayName("contextLoads")
    @Timeout(value = 1L, unit = TimeUnit.MINUTES)
    void contextLoads(){
        log.trace("contextLoads() invoked ");

        final String name="bee";
        String result = this.service.hello(name);

    }

    @Order(2)
    @Test
    //@RepeatedTest(1)
    @DisplayName("2,testFindBoard")
    @Timeout(value = 1L, unit = TimeUnit.MINUTES)
    void testFindBoard(){
        log.trace("testFindBoard() invoked ");

        final Integer boardSeq=33;

        BoardVo vo = this.service.findBoard(boardSeq);
    }


    @Order(3)
    @Test
    //@RepeatedTest(1)
    @DisplayName("3,testFindBoard")
    @Timeout(value = 1L, unit = TimeUnit.MINUTES)
    void testFindAllBoards(){
        log.trace("testFindAllBoards() invoked ");;
    }
}
