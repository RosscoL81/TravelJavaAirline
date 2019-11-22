import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void planeHasCapacity(){
        assertEquals(10, plane.getPlanesCapacity());
    }

    @Test
    public void planeHasTotalWeight(){
        assertEquals(50, plane.getPlanesTotalWeight());
    }
}
