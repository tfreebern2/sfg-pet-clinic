package tim.freebern.sfgpetclinic.services;

import org.springframework.data.repository.CrudRepository;
import tim.freebern.sfgpetclinic.model.Visit;

public interface VisitService extends CrudService<Visit, Long> {
}
