package decorator.area;

import membership_type.Base;

public class Pool extends Area {
    public Pool(Base add2basemembership) {
        super(add2basemembership);
        this.price = 200;
    }

    @Override
    public String getDescription() {
        return basemembership.getDescription()+ " + Pool Usage";
    }
}
