package temp;

/**
 * Created by catrapture on 30/03/2014.
 */
public class CalculatedLocation extends Location {
    public double distance;

    public CalculatedLocation(int x, int y, double distance) {
        this.x = x;
        this.y = y;
        this.distance = distance;
    }
}
