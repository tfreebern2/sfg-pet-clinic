package tim.freebern.sfgpetclinic.respositories;

import org.springframework.data.repository.CrudRepository;
import tim.freebern.sfgpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
