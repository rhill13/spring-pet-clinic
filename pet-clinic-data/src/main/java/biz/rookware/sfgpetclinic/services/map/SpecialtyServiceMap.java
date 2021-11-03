package biz.rookware.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import biz.rookware.sfgpetclinic.model.Specialty;
import biz.rookware.sfgpetclinic.services.SpecialtyService;

@Service
public class SpecialtyServiceMap extends AbstractMapService<Specialty, Long> implements SpecialtyService {

    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Specialty object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Specialty findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Specialty save(Specialty object) {
        return super.save(object);
    }
    
}
