package tim.freebern.sfgpetclinic.respositories;

import org.springframework.data.repository.CrudRepository;
import tim.freebern.sfgpetclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
