package decorator.area;

import membership_type.Base;

public class SaltBath extends Area {
    public SaltBath(Base add2basemembership) {
        super(add2basemembership);
        this.price = 240;
    }

    @Override
    public String getDescription() {
        return basemembership.getDescription()+ " + Salt Bath Usage";
    }
}
