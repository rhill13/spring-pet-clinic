package biz.rookware.sfgpetclinic.model;

import java.util.Set;

public class Vet extends Person{
    
    // Properties
    private Set<Specialty> specialties;

    // Getters and Setters
    public Set<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Set<Specialty> specialties) {
        this.specialties = specialties;
    }
    
}
