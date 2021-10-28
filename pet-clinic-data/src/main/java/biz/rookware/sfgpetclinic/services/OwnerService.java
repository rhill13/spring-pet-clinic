package biz.rookware.sfgpetclinic.services;

import biz.rookware.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
    
}
