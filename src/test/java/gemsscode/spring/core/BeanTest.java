package gemsscode.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import gemsscode.spring.core.data.Foo;

public class BeanTest {

    @Test
    void testCreateBean() {

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);

        Assertions.assertNotNull(context);

    }

    @Test
    void testGetBean() {

        ApplicationContext context1 = new AnnotationConfigApplicationContext(BeanConfiguration.class);

        Foo foo1 = context1.getBean(Foo.class);
        Foo foo2 = context1.getBean(Foo.class);

        Assertions.assertSame(foo1, foo2);
    }

}