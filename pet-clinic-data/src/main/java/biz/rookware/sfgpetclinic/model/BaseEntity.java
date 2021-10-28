package biz.rookware.sfgpetclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {
    
    // Props
    private Long id;

    // Getter and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
}
