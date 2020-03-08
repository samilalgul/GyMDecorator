package decorator.trainer;

import membership_type.Base;

public class PilatesTrainer extends Trainer {
    public PilatesTrainer(Base add2basemembership) {
        super(add2basemembership);
        this.price = 150;
    }

    @Override
    public String getDescription() {
        return basemembership.getDescription() + " + Pilates Trainer";
    }
}
