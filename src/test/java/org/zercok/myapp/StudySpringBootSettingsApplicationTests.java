package org.zercok.myapp;

import lombok.NoArgsConstructor;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.GenericWebApplicationContext;

import java.util.Objects;
import java.util.concurrent.TimeUnit;


@Slf4j
@NoArgsConstructor

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.class)

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
class StudySpringbootTestAppTests {



	// Spring Context (== Spring Beans Container) 를 주입받자!
	@Autowired(required = false)	// 선택주입
			WebApplicationContext ctx;





//	@Test
//	void contextLoads() {
//		log.trace("contextLoads() invoked.");
//
//		Objects.requireNonNull(this.ctx);
//		log.info("\t+ this.ctx: {}", this.ctx);
//	} // contextLoads


	void BeforeAll(){
		log.trace("BeforeAll () invoked");
		Objects.requireNonNull(ctx);
		log.trace("\t+ctx: {} invoked");
	}

	//unit = TimeUnit.MINUTES
	//@Disabled
	@Order(1)
	@Test
	//@RepeatedTest(1)
	@DisplayName("contextLoads")
	@Timeout(value = 1L, unit = TimeUnit.MINUTES)
	void contextLoads(){
		log.trace("contextLoads() invoked ");

		int BtoaBannCount= this.ctx.getBeanDefinitionCount();

		log.info("btoaBannCount({})",BtoaBannCount);

		String[] beanNames =this.ctx.getBeanDefinitionNames();
	}

} // end class

