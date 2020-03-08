package decorator.trainer;

import membership_type.Base;

public class BoxTrainer extends Trainer {
    public BoxTrainer(Base add2basemembership){
        super(add2basemembership);
        this.price = 170;
    }

    @Override
    public String getDescription() {
        return basemembership.getDescription() + " + Box Trainer";
    }
}
