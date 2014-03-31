package temp;

import org.junit.Test;

/**
 * Created by catrapture on 30/03/2014.
 */
public class LocationRunnerTest {

    @Test
    public void asd() {
//        [ {1,2}, {2,2}, {2,1} ], k: 2}
        Location[] ints = new Location[3];
        Location location = new Location();
        location.x = 1;
        location.y = 2;
        ints[0] = location;

        Location location2 = new Location();
        location2.x = 2;
        location2.y = 2;
        ints[1] = location2;

        Location location3 = new Location();
        location3.x = 2;
        location3.y = 1;
        ints[2] = location3;

        Location[] customerLocations = LocationsRunner.findClosestLocations(ints, 2);
        System.out.println(customerLocations.length);
    }
}
