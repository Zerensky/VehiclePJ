import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class VehicleTest {

    @Test
    public void testCarIsInstanceOfVehicle() {
        Vehicle car = new Car("Toyota", "Corolla", 2020);
        assertTrue(car instanceof Vehicle);
    }

    @Test
    public void testCarHasFourWheels() {
        Car car = new Car("Toyota", "Corolla", 2020);
        assertEquals(4, car.getNumWheels());
    }

    @Test
    public void testMotorcycleHasTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR", 2020);
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    public void testCarSpeedInTestDrive() {
        Car car = new Car("Toyota", "Corolla", 2020);
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    public void testMotorcycleSpeedInTestDrive() {
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR", 2020);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    public void testCarSpeedAfterParking() {
        Car car = new Car("Toyota", "Corolla", 2020);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    public void testMotorcycleSpeedAfterParking() {
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR", 2020);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}

