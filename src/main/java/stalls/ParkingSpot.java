package stalls;

import behaviours.IReviewed;

public enum ParkingSpot implements IReviewed {
    A1,
    A2,
    A3,
    A4,
    B1,
    B2,
    B3,
    B4;

    public int getRating() {
        return 0;
    }

    public String getName() {
        return null;
    }
}
