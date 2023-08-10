package DesignQuestions.CarRentalSystem;

import java.util.List;

public class VehicleRentalSystem {

    List<Store> storeList;

    List<User> userList;

    public VehicleRentalSystem(List<Store> storeList, List<User> userList) {
        this.storeList = storeList;
        this.userList = userList;
    }

    public Store getStoreByLocation(Location location){
        return storeList.get(0);
    }
}
