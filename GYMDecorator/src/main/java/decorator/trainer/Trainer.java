package decorator.trainer;

import decorator.BaseDecorator;
import membership_type.Base;

public abstract class Trainer extends BaseDecorator {

    public Base basemembership;

    public Trainer(Base add2basemembership) { this.basemembership = add2basemembership;}

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public int getPrice() {
        return (this.basemembership.getPrice() + this.price);
    }
}
