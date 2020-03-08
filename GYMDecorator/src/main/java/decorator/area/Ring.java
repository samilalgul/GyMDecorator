package decorator.area;

import membership_type.Base;

public class Ring extends Area {
    public Ring(Base add2basemembership) {
        super(add2basemembership);
        this.price = 120;
    }

    @Override
    public String getDescription() {
        return basemembership.getDescription()+ " + Ring Usage";
    }
}
