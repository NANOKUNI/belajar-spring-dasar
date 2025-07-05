package gemsscode.spring.core.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import gemsscode.spring.core.aware.IdAware;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class PrefixIdGeneratorBeanPostProcessor implements BeanPostProcessor, Ordered {

    @Override
    public int getOrder() {
        // TODO Auto-generated method stub
        return 2;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("Prefix ID Generator Processor for Bean {}", beanName);
        if (bean instanceof IdAware) {
            log.info("Set Prefix ID Generator for Bean {}", beanName);

            IdAware idAware = (IdAware) bean;
            idAware.setId("GMC-" + idAware.getId());
        }

        return bean;
    }

}