package tim.freebern.sfgpetclinic.model;

import com.sun.xml.internal.rngom.parse.host.Base;

public class PetType extends BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}