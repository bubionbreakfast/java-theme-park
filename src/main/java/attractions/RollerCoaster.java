package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, IReviewed, ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        return false;
    }

    public double defaultPrice() {
        return 8.40;
    }

    public double priceFor(Visitor visitor) {
        return 0;
    }
}
