import java.util.HashMap;
import java.util.Map;
import java.util.Set;

    public class Maps {
        public static void main(String[] args) {
            Map<String, Integer> map = new HashMap<>();
            map.put("A", 1);
            map.put("B", 2);
            map.put("C", 3);

            Set<String> keys = map.keySet();

            for (String key : keys) {
                System.out.println(key);
            }
        }
    }
