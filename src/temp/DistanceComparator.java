package temp;

import java.util.Comparator;

/**
 * Created by catrapture on 30/03/2014.
 */
public class DistanceComparator implements Comparator<CalculatedLocation> {

    @Override
    public int compare(CalculatedLocation a, CalculatedLocation b) {
        if (a.distance < b.distance)
            return -1;
        if (a.distance > b.distance)
            return 1;

        return 0;
    }

}
