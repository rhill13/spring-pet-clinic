package biz.rookware.sfgpetclinic.model;

import java.time.LocalDate;

public class Pet extends BaseEntity {
    
    // Properties
    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;

    // Getters and Setters
    public PetType getPetType() {
        return petType;
    }
    public void setPetType(PetType petType) {
        this.petType = petType;
    }
    public Owner getOwner() {
        return owner;
    }
    public void setOwner(Owner owner) {
        this.owner = owner;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
