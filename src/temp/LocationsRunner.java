package temp;

import java.util.PriorityQueue;

/**
 * Created by catrapture on 30/03/2014.
 */
public class LocationsRunner {


    // Time O(n)
// Space O(n)
    static Location[] findClosestLocations(Location[] cLocations, int k) {

        Location[] result = new Location[k];
        PriorityQueue<CalculatedLocation> queue = new PriorityQueue<CalculatedLocation>(cLocations.length, new DistanceComparator());

        for (Location l : cLocations) {
            // calc distance
            double distance = calcDistanceFromOrigin(l);
            queue.add(new CalculatedLocation(l.x, l.y, distance));
        }

        for (int i = 0; i < k; i++) {
            result[i] = queue.remove();
        }

        return result;
    }

    static double calcDistanceFromOrigin(Location l) {
        return  Math.sqrt((l.x * l.x) + (l.y * l.y));
    }
}
