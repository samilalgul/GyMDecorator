package decorator.trainer;

import membership_type.Base;

public class FitnessTrainer extends Trainer {
    public FitnessTrainer(Base add2basemembership) {
        super(add2basemembership);
        this.price = 100;
    }

    @Override
    public String getDescription() {
        return basemembership.getDescription() + " + Fitness Trainer";
    }
}
