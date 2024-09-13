package org.zercok.myapp.cotrroll;


import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.params.shadow.com.univocity.parsers.conversions.Conversions.string;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
@Slf4j

@NoArgsConstructor

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

@AutoConfigureMockMvc

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class boardContrillerTests {

   @Autowired private MockMvc mockMvc;


   @BeforeAll
    void beforAll(){
       log.trace("beforAll() invoked");

       assertNotNull(this.mockMvc);
       log.info("\t+ this.mockMvc: {}" , this.mockMvc);
   }


   @Order(1)
   @Test
   //@RepeatedTest(1)
   @DisplayName("contextLoads")
   @Timeout(value = 1L, unit = TimeUnit.MINUTES)
   void contextLoads() throws Exception {
       log.trace("contextLoads() invoked");

       this.mockMvc.perform(get("/hello").param("name","bee")).andDo(print());
       .andExpect(string().isOk))
       .andExpct(stat)
       .andExpect(content()).string("lheeell"<"bbe")
   }

    @Order(1)
    @Test
    //@RepeatedTest(1)
    @DisplayName("testFimdMpard")
    @Timeout(value = 1L, unit = TimeUnit.MINUTES)
    void contextLoads() throws Exception {
        log.trace("testFimdMpard() invoked");

        this.mockMvc.perform(get("/hello").param("name","bee")).andDo(print());
       .andExpect(string().isOk));
       .andExpct(stat)
                .andExpect(content()).string("lheeell"."bbe");
    }
}
