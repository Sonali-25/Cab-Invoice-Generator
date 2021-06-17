package com.magic.cabinvoicegenerator;

import java.lang.reflect.Array;
import java.util.*;
public class RideRepository {
    Map<String, ArrayList<Rides>> userRides = null;

    public RideRepository() {
        this.userRides = new HashMap<>();
    }

    public void addRides(String userName, Rides[] ride) {
        ArrayList<Rides> rideList = this.userRides.get(userName);
        if (rideList == null)
            this.userRides.put(userName, new ArrayList<>(Arrays.asList(ride)));
    }

    public Rides[] getRide(String userName) {
        return userRides.get(userName).toArray(new Rides[0]);
    }
}


