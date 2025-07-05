package gemsscode.spring.core.data;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Connection implements InitializingBean, DisposableBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        // TODO Auto-generated method stub
        log.info("Connection is ready to be used");
    }

    @Override
    public void destroy() throws Exception {
        // TODO Auto-generated method stub
        log.info("Connection is closed");
    }

}