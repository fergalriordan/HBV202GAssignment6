package is.hi.hbv202g.ass6;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class CarTest {
    private static final String CAR_NAME = "Beetle";
    private Car car;

    @Test
    public void getNameOfCar() {
        assertEquals(CAR_NAME, car.getName());
    }

    @Before
    public void setUp() {
        car = new Car(CAR_NAME);
    }

}
