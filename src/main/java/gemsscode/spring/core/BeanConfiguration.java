package gemsscode.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import gemsscode.spring.core.data.Foo;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class BeanConfiguration {

    /**
     * Jika tidak tersedia anotation Bean maka
     * tidak dianggap sebagai method Bean
     * 
     * @return
     */
    @Bean
    public Foo foo() {
        Foo foo = new Foo();
        log.info("Create new foo");
        return foo;
    }

}