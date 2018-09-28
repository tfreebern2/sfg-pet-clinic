package tim.freebern.sfgpetclinic.respositories;

import org.springframework.data.repository.CrudRepository;
import tim.freebern.sfgpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
