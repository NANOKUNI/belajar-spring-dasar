package gemsscode.spring.core.processor;

import java.util.UUID;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import gemsscode.spring.core.aware.IdAware;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class IdGeneratorBeanPostProcessor implements BeanPostProcessor, Ordered {

    @Override
    public int getOrder() {
        // TODO Auto-generated method stub
        return 1;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("ID Generator Processor for Bean {}", beanName);

        // Check kalau Id instabce dari IdAware maka akan di set UUIDnya
        if (bean instanceof IdAware) {
            log.info("Set ID Generator for Bean {}", beanName);

            IdAware idAware = (IdAware) bean;
            idAware.setId(UUID.randomUUID().toString());
        }

        return bean;
    }

}