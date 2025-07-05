package gemsscode.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "gemsscode.spring.core.configuration"
})
public class ScanConfiguration {

}