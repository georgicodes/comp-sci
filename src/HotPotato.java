import java.util.AbstractQueue;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by catrapture on 30/03/2014.
 */
public class HotPotato {

    public static String hotPotato(List<String> list, int num) {
        Queue<String> pots = new LinkedList<String>();

        for (String s : list) {
            pots.add(s);
        }

        while (pots.size() > 1) {

            for (int i = 0; i < num; i++) {
                pots.add(pots.remove());
            }

            pots.remove();
        }

        return pots.remove();
    }
}
