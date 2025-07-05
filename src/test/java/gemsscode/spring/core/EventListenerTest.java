package gemsscode.spring.core;

import gemsscode.spring.core.listener.LoginAgainSuccessListener;
import gemsscode.spring.core.listener.LoginSuccessListener;
import gemsscode.spring.core.listener.UserListener;
import gemsscode.spring.core.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class EventListenerTest {

    @Configuration
    @Import({
            UserService.class,
            LoginSuccessListener.class,
            LoginAgainSuccessListener.class,
            UserListener.class
    })
    public static class TestConfiguratio {

    }

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(TestConfiguratio.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void TestEvent() {
        UserService userService = applicationContext.getBean(UserService.class);
        userService.login("wahyu", "wahyu");
        userService.login("wahyu", "salah");
        userService.login("ramadhan", "salah");
    }
}
