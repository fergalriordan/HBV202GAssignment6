package is.hi.hbv202g.ass6;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class CarTest {
    private Car car;

    @Test
    public void getNameOfCar() {
        assertEquals("Beetle", car.getName());
    }

    @Before
    public void setUp() {
        car = new Car("Beetle");
    }

}
