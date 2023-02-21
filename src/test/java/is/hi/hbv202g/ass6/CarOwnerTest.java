package is.hi.hbv202g.ass6;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class CarOwnerTest {

    private static final String CAR_NAME = "Beetle";
    private static final String OWNER_NAME = "John Doe";
    private Car car;
    private CarOwner carOwner;

    @Test
    public void getName() {
        assertEquals(OWNER_NAME, carOwner.getName());
    }

    @Before 
    public void setUp() {
        car = new Car(CAR_NAME);
        carOwner = new CarOwner(OWNER_NAME, car);
    }
}