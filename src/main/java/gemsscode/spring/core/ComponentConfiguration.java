package gemsscode.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import gemsscode.spring.core.data.MultiFoo;

@Configuration
@ComponentScan(basePackages = {
        "gemsscode.spring.core.configuration",
        "gemsscode.spring.core.repository",
        "gemsscode.spring.core.service",
})
@Import(MultiFoo.class)
public class ComponentConfiguration {

}