import java.util.HashMap;
import java.util.Map;

public class Assignment01 {




        public static void main(String[] args) {


            System.out.println("\nFaculty of Humanities and Social Sciences ran a marathon");
            System.out.println("------------------------------------------------------------------------");

            Map<String, Integer> m = new HashMap<>();

            m.put("shiran"     ,342);
            m.put("hashini"    ,448);
            m.put("priyankara" ,399);
            m.put("mayuri"     ,350);
            m.put("sameera"    ,321);
            m.put("supun"      ,299);
            m.put("supuni"     ,378);
            m.put("kavindu"    ,384);
            m.put("nadeeka"    ,440);


            for (Map.Entry<String, Integer> entry:m.entrySet() ){
                String key = entry.getKey();
                Integer element = entry.getValue();
                System.out.println( key + "\t  --> " + element);

            }

            Map.Entry<String, Integer> min1 = null;
            Map.Entry<String, Integer> min2 = null;


            //searching the first won
            for(Map.Entry<String, Integer> entry : m.entrySet()){
                if (min1 == null || entry.getValue().compareTo(min1.getValue()) < 0){
                    min1 = entry;

                    System.out.println(entry);
                    System.out.println(min1);
                }
            }
            //searching the runner up
            for(Map.Entry<String, Integer> entry : m.entrySet()) {
                if (entry!= min1 && (min2 == null || (entry.getValue().compareTo(min2.getValue()) < 0))) {
                    min2 =entry;

                    //System.out.println(entry);
                }
            }
            System.out.println("\n\nWINNER OF THE MARATHON");
            System.out.println("-----------------------------");
            System.out.println("\n" + min1.getKey()+"  is Won "+min1.getValue()+" Minutes");

            System.out.println("\n\nFIRST RUNNERUP OF THE MARATHON");
            System.out.println("-----------------------------");
            System.out.println(min2.getKey()+" is Runner Up "+min2.getValue()+" Minutes");

        }

}
