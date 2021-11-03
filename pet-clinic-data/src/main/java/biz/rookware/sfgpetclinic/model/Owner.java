package biz.rookware.sfgpetclinic.model;

import java.util.Set;

public class Owner extends Person {
    
    // Properties
    private Set<Pet> pets;

    // Getters and Setters
    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
