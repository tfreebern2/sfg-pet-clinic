package tim.freebern.sfgpetclinic.respositories;

import org.springframework.data.repository.CrudRepository;
import tim.freebern.sfgpetclinic.model.Speciality;

public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
