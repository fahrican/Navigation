package navigation;

import data.Point;
import model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class NavHandler {

    private Point currentPos;
    private List<Vehicle> vehicles = new ArrayList<>();

    public NavHandler(Point currentPos) {
        this.currentPos = currentPos;
    }

    public Point getCurrentPos() {
        return currentPos;
    }

    public void addVehicle(Vehicle vehicle) {

        this.vehicles.add(vehicle);
    }

    public void findVehicles(float distance) {

        Point pointPlusDistance = new Point(getCurrentPos().getPosX() + distance,
                getCurrentPos().getPosY() + distance);

        Point pointMinusDistance = new Point(getCurrentPos().getPosX() - distance,
                getCurrentPos().getPosY() - distance);

        for (Vehicle vehicle : this.vehicles) {

            if (this.getCurrentPos().checkForSamePosition(vehicle.getPosition())) {

                System.out.println("Vehicle is at X:" + vehicle.getPosition().getPosX()
                        + ", Y:" + vehicle.getPosition().getPosY());

            } else if (pointPlusDistance.checkForSamePosition(vehicle.getPosition())) {

                System.out.println("Vehicle is at X:" + vehicle.getPosition().getPosX()
                        + ", Y:" + vehicle.getPosition().getPosY());

            } else if (pointMinusDistance.checkForSamePosition(vehicle.getPosition())) {

                System.out.println("Vehicle is at X:" + vehicle.getPosition().getPosX()
                        + ", Y:" + vehicle.getPosition().getPosY());
            }
            else {

                System.out.println("Sorry, there is no vehicle near by!");
            }
        }
    }

    public void findVehicles(String company) {

        for (Vehicle vehicle : this.vehicles) {

            if (vehicle.getOwnerCompany().equals(company)) {

                System.out.println(vehicle);
            } else {
                System.out.println("Sorry, there is no vehicle with this company name!");
            }
        }
    }

    public void findVehicles(float distance, String company) {

        findVehicles(company);
        findVehicles(distance);
    }

    public boolean removeVehicle(Vehicle vehicle) {

        if (this.vehicles.contains(vehicle)) {

            this.vehicles.remove(vehicle);
            return true;
        }
        return false;
    }

}
