package decorator.area;

import decorator.BaseDecorator;
import membership_type.Base;

public abstract class Area extends BaseDecorator {

    public Base basemembership;

    public Area(Base add2basemembership){
        this.basemembership = add2basemembership;
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public int getPrice() {
        return (this.basemembership.getPrice() + this.price);
    }
}
