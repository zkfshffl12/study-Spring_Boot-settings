package org.zercok.myapp.pers;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Repository;

import java.util.Objects;

@Slf4j
@NoArgsConstructor


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class boardRepositoryTests {
    /*
    *개발자가 테스트 하길 원하는 계층(웹3계층)의 spring  Bean componebt를 주입받을 필드을 선언하고
    *  Spring context 에 주입 시그널을 보내기 위해
    *   @Autowired 같은 어노테이션을 붙여서 런타임시에 테스트 대상 객체를 확보해야합니다
    *
     */

    @Autowired(required = true)
    private BoardRepository dao;

    @BeforeAll
    void BeforeAll(){
        log.trace("BeforeAll() invoked");
        Objects.requireNonNull(this.dao);
        log.info("\t+ this.dao: {}", this.dao);
    }
}
