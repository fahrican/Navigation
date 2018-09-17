package app;

import data.Point;
import model.Lorry;
import model.Ship;
import navigation.NavHandler;

public class MyApp {

    public static void main(String[] args) {

        Lorry lorry = new Lorry("This is a lorry to transport oil", "GA56", "MAN", new Point((float)1.2, (float)3.3));
        Ship ship = new Ship("Contains TNT", "WaveBreaker 23", "Lego", new Point(-10.1f, -10.1f));
        NavHandler handler = new NavHandler(new Point(-1.1f, -1.1f));
        handler.addVehicle(lorry);
        handler.findVehicles("MAN");
        handler.findVehicles(1.1f);
        handler.findVehicles(0.1f);
        handler.addVehicle(ship);
        handler.findVehicles(9.0f, "Lego");
    }
}
