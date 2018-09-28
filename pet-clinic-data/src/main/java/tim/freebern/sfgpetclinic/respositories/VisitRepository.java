package tim.freebern.sfgpetclinic.respositories;

import org.springframework.data.repository.CrudRepository;
import tim.freebern.sfgpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
