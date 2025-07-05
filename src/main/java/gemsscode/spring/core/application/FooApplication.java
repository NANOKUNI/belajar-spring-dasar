package gemsscode.spring.core.application;

import gemsscode.spring.core.data.Foo;
import gemsscode.spring.core.listener.AppStartingListener;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class FooApplication {

//    public static void main(String[] args) {
//        ConfigurableApplicationContext applicationContext = SpringApplication.run(FooApplication.class, args);
//
//        Foo foo = applicationContext.getBean(Foo.class);
//
//        System.out.println(foo);
//    }

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(FooApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.setListeners(List.of(new AppStartingListener()));

        ConfigurableApplicationContext applicationContext = application.run(args);

        Foo foo = applicationContext.getBean(Foo.class);
        System.out.println(foo);
    }

    @Bean
    public Foo foo() {
        return new Foo();
    }

}
