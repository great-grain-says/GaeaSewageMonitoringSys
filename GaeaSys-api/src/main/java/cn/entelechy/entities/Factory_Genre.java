package cn.entelechy.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

public class Factory_Genre {
    private Integer factory_Genre_id;
    private String factory_Genre_name;

    public Integer getFactory_Genre_id() {
        return factory_Genre_id;
    }

    public void setFactory_Genre_id(Integer factory_Genre_id) {
        this.factory_Genre_id = factory_Genre_id;
    }

    public String getFactory_Genre_name() {
        return factory_Genre_name;
    }

    public void setFactory_Genre_name(String factory_Genre_name) {
        this.factory_Genre_name = factory_Genre_name;
    }
}
