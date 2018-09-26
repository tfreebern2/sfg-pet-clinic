package tim.freebern.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import tim.freebern.sfgpetclinic.model.Speciality;
import tim.freebern.sfgpetclinic.model.Vet;
import tim.freebern.sfgpetclinic.services.SpecialtyService;
import tim.freebern.sfgpetclinic.services.VetService;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    final private SpecialtyService specialtyService;

    public VetServiceMap(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {

        if  (object.getSpecialties().size() > 0) {
            object.getSpecialties().forEach(speciality ->  {
                if (speciality.getId() == null) {
                    Speciality savedSpeciality = specialtyService.save(speciality);
                    speciality.setId(savedSpeciality.getId());
                }
            });
        }
        return super.save(object);
    }

    @Override
    public void delete(Vet object) {
       super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
