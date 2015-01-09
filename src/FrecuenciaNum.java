import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class FrecuenciaNum {


    public static void main(String[] args) {

        int[] vector = {2, 2, 11, 4, 2, 6, 11, 2, 3, 5, 11, 5};

        HashMap<Integer, Integer> frequencies = new HashMap<Integer, Integer>();

        for (Integer i : vector) {
            if (frequencies.containsKey(i)) {
                frequencies.put(i, frequencies.get(i) + 1);
            } else {
                frequencies.put(i, 1);
            }
        }

        System.out.println(frequencies.entrySet());

        int mostFrequentKey = 0;
        int mostFrequentValue = 0;

        for (HashMap.Entry<Integer, Integer> entry : frequencies.entrySet()) {
            if (entry.getValue() > mostFrequentValue) {
                mostFrequentKey = entry.getKey();
                mostFrequentValue = entry.getValue();
            }
        }

        System.out.println(mostFrequentKey + " => " + mostFrequentValue);


    }

}
