import java.util.*;

public class Marathon{

    // Find the entry with highest value
    public static <K, V extends Comparable<V> > Map.Entry<K, V>
    getMaxEntryInMapBasedOnValue(Map<K, V> map)
    {
        // To store the result
        Map.Entry<K, V> entryWithMaxValue = null;

        // Iterate in the map to find the required entry
        for (Map.Entry<K, V> currentEntry : map.entrySet()) {

            if (
                // If this is the first entry, set result as this
                    entryWithMaxValue == null

                            // If this entry's value is more than the max value
                            // Set this entry as the max
                            || currentEntry.getValue()
                            .compareTo(entryWithMaxValue.getValue())
                            > 0) {

                entryWithMaxValue = currentEntry;
            }
        }

        // Return the entry with highest value
        return entryWithMaxValue;
    }

    // Print the map
    public static void print(Map<String, Integer> map)
    {

        System.out.print("Map: ");
        // If map does not contain any value
        if (map.isEmpty()) {
            System.out.println("[]");
        }

        else {
            System.out.println(map);
        }
    }

    // Driver code
    public static void main(String[] args)
    {

        Map<String, Integer> map
                = new HashMap<>();
        map.put("shiran", 342);
        map.put("hashini", 448);
        map.put("priyankara" ,399);
        map.put("mayuri", 350 );
        map.put("sameera",321);
        map.put("supun",299 );
        map.put("supuni" , 378);
        map.put("kavindu",384) ;
        map.put("nadeeka",440);



        print(map);

        System.out.println(" won the prize : " + getMaxEntryInMapBasedOnValue(map));
    }
}