package decorator.area;

import membership_type.Base;

public class Sauna extends Area {
    public Sauna(Base add2basemembership) {
        super(add2basemembership);
        this.price = 140;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+ " + Sauna Usage";
    }
}
