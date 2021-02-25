import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HackerRank {
        /*
            HackerRank:
            Date time
            Collections – Listas/HashMap
            Casting
         */
        public static void main(String[] args) throws InterruptedException {

            Map<Long, Integer> map = new HashMap<>();
            ArrayList<Long> list = new ArrayList<>();

            for(int cont = 0; cont <= 10; cont++){
                Long nanos = (long) LocalDateTime.now().getNano();
                list.add(nanos);
                Thread.sleep(10);
            }

            map.put(list.get(0), 0);
            map.put(list.get(1), 1);

            for(int i = 2;i < list.size();i++) {
                Integer aux = map.get(list.get(i - 1));
                Integer aux2 = map.get(list.get(i - 2));
                map.put(list.get(i), aux + aux2);
            }

            System.out.println("Sequencia normal");
            for(int i = 0;i <= list.size()-1;i++){
                System.out.println(list.get(i) + " -> " +map.get(list.get(i)));
            }

            System.out.println("\nSequencia invertida");
            for(int i = list.size()-1;i >= 0;i--){
                System.out.println(list.get(i) + " -> " +map.get(list.get(i)));
            }
        }
    }
