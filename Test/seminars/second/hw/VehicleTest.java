package seminars.second.hw;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.*;

public class VehicleTest {
    Car car = new Car("Lada", "Vesta", 2020);
    Motorcycle motorcycle = new Motorcycle("Yamaha", "FZ1", 2009);

    @Test
    public void testCarInVehicle() {
        assertTrue(car instanceof Vehicle);
    }

    @Test
    public void testCar4numWheels() {
        assertEquals(4, car.getNumWheels());
    }

    @Test
    public void testMotorcycle2numWheels() {
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    public void testCarTestSpeed() {
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    public void testMotorcycleTestSpeed() {
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    public void testCarPark() {
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    public void testMotorcyclePark() {
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }

}