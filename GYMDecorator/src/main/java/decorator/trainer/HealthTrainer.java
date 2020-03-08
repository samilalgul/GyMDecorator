package decorator.trainer;

import membership_type.Base;

public class HealthTrainer extends Trainer {
    public HealthTrainer(Base add2basemembership) {
        super(add2basemembership);
        this.price = 200;
    }

    @Override
    public String getDescription() {
        return basemembership.getDescription() + " + Health Trainer";
    }
}
