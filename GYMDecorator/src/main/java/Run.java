import decorator.area.Pool;
import decorator.area.SaltBath;
import decorator.trainer.BoxTrainer;
import decorator.trainer.FitnessTrainer;
import decorator.trainer.PilatesTrainer;
import decorator.trainer.SwimTrainer;
import membership_type.Base;
import membership_type.Regular;
import membership_type.VIP;

public class Run {
    public static void main(String[] args) {
        Base membership = new Regular();
        System.out.println(membership.getDescription()+" "+ membership.getPrice());

        membership = new FitnessTrainer(membership);

        System.out.println(membership.getDescription()+" "+ membership.getPrice());

        membership = new BoxTrainer(membership);
        System.out.println(membership.getDescription()+" "+ membership.getPrice());

        Base membership1 = new Regular();
        membership1 = new PilatesTrainer(membership1);
        System.out.println(membership1.getDescription()+" "+ membership1.getPrice());

        membership1 =  new Pool(membership1);
        System.out.println(membership1.getDescription()+" "+ membership1.getPrice());

        membership1 = new SaltBath(membership1);
        System.out.println(membership1.getDescription()+" "+ membership1.getPrice());

        Base membership2 = new VIP();
        membership2 = new SwimTrainer(membership2);
        System.out.println(membership2.getDescription()+" "+ membership2.getPrice());

        membership2 = new Pool(membership2);
        System.out.println(membership2.getDescription()+" "+ membership2.getPrice());
    }
}
