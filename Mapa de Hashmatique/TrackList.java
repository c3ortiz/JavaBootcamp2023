import java.util.HashMap;
import java.util.Set;

public class TrackList {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();

        trackList.put("Pepa", "Pepa ama bailar, Pepa ama cantar");
        trackList.put("Pepe", "Pepe ama bailar, Pepe ama cantar");
        trackList.put("Pepi", "Pepi ama bailar, Pepi ama cantar");
        trackList.put("Pepo", "Pepo ama bailar, Pepo ama cantar");
        trackList.put("Pepu", "Pepu ama bailar, Pepu ama cantar");

        Set<String> keys = trackList.keySet();
        for (String key : keys) {
            System.out.printf("Track: %s Lyrics: %s \n", key, trackList.get(key));
        }

        System.out.println(trackList.get("Pepa"));
    }
}
