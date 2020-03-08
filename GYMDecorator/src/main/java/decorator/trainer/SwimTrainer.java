package decorator.trainer;

import membership_type.Base;

public class SwimTrainer extends Trainer {
    public SwimTrainer(Base add2basemembership) {
        super(add2basemembership);
        this.price = 200;
    }

    @Override
    public String getDescription() {
        return basemembership.getDescription();
    }
}
