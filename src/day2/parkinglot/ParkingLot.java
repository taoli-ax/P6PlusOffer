package day2.parkinglot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<Level> levels;
    private List<Car> cars;
    private float hourlyRate;


    public int getAvailableCount() {
        int count = 0;
        for(Level level : levels) {
            count += level.getAvailableCount();
        }
        return count;
    }
    public Ticket parkVehicle(Vehicle vehicle) {
        return new Ticket();
    }
    public void clearSpot(Ticket ticket) {

    }

    public void checkOutPrice(){

    }
    public void findAvailableSpotForVehicle(Vehicle v){

    }

    public float calculatePrice(Ticket ticket) {
        return hourlyRate;
    }

    public static ParkingLot _instance = null;

    public ParkingLot() {
        levels = new ArrayList<Level>();
    }

    // singleTon
    // 线程安全式
    public static synchronized ParkingLot getInstance() {
        if (_instance == null) {
            _instance = new ParkingLot();
        }
        return _instance;
    }
    // 静态内部类
    private static class lazyInstance{
          static final ParkingLot _instance = new ParkingLot();
    }


    public static ParkingLot getLazyInstance(){
        return lazyInstance._instance;
    }

}
