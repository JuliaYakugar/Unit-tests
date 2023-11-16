package seminars.second.hw;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.*;

public class VehicleTest {

    @Test
    public void testCarInVehicle() {
        Car car = new Car("Lada", "Vesta", 2020);
        assertTrue(car instanceof Vehicle);
    }

    @Test
    public void testCar4numWheels() {
        Car car = new Car("Lada", "Vesta", 2020);
        assertEquals(4, car.getNumWheels());
    }

    @Test
    public void testMotorcycle2numWheels() {
        Motorcycle motorcycle = new Motorcycle("Yamaha", "FZ1", 2009);
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    public void testCarTestSpeed() {
        Car car = new Car("Lada", "Vesta", 2020);
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    public void testMotorcycleTestSpeed() {
        Motorcycle motorcycle = new Motorcycle("Yamaha", "FZ1", 2009);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    public void testCarPark() {
        Car car = new Car("Lada", "Vesta", 2020);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    public void testMotorcyclePark() {
        Motorcycle motorcycle = new Motorcycle("Yamaha", "FZ1", 2009);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }

}