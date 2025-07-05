package gemsscode.spring.core.data;

import org.springframework.stereotype.Component;

import gemsscode.spring.core.aware.IdAware;
import lombok.Getter;

@Component
public class Car implements IdAware {

    @Getter
    private String id;

    @Override
    public void setId(String id) {
        this.id = id;

    }

}