import java.util.*;


    public class as {
        public static void main(String[] args) {

            System.out.print("-------------------------------------------------------------");
            System.out.println("\nFaculty of Humanities and Social Sciences ran a marathon");
            System.out.println("-------------------------------------------------------------\n");

            // Create a HashMap object called capitalCities
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

            boolean result = false;


            // Create a HashMap object called capitalCities
            Map<String, Integer>  m_temp = new HashMap<>();
            do {
                result = false;

                Scanner input = new Scanner(System.in);
                // user Input
                System.out.print("Input User Name : ");
                String user_name = input.nextLine();

                System.out.print("Input Minutes : ");
                int user_minute = input.nextInt();

                m_temp.put(user_name,user_minute);

                System.out.print("do they want to add  details of another participant. (Enter Yes or No ) : ");
                String user_result = input.next();

                if (user_result.equals("Yes")){
                    result = true;
                }
            }


            while (result==true);


            // Using entrySet() to get the entry's of the map
            Set<Map.Entry<String, Integer>> set = m.entrySet();


            //object called and sort
            List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(set);
            Collections.sort( list, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 ) {
                    return (o1.getValue()).compareTo( o2.getValue() );
                }
            } );


            System.out.println("\n-------------------------------------------------------------");
            System.out.println(" Old All Runners Details : ");
            System.out.println("-------------------------------------------------------------");

            // getting the value for each key
            for(Map.Entry<String, Integer> entry:list){
                System.out.println(entry.getKey()+" => "+entry.getValue());
            }


            //object called and sort
            Set<Map.Entry<String, Integer>> set_1 = m_temp.entrySet();
            List<Map.Entry<String, Integer>> list_1 = new ArrayList<Map.Entry<String, Integer>>(set_1);
            Collections.sort( list_1, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 ) {
                    return (o1.getValue()).compareTo( o2.getValue() );
                }
            } );


            System.out.println();
            System.out.println("-------------------------------------------------------------");
            System.out.println("New All Runners Details : ");
            System.out.println("-------------------------------------------------------------");

            // getting the value for each key
            for(Map.Entry<String, Integer> entry:list_1){
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }

            // getting the value for each key
            for (Map.Entry<String, Integer> entry : m.entrySet()) {
                m_temp.put(entry.getKey(),entry.getValue());
            }


            //object called and sort
            Set<Map.Entry<String, Integer>> set_2 = m_temp.entrySet();
            List<Map.Entry<String, Integer>> list_2 = new ArrayList<Map.Entry<String, Integer>>(set_2);
            Collections.sort( list_2, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 ) {
                    return (o1.getValue()).compareTo( o2.getValue() );

                }
            } );

            System.out.println();
            System.out.println("-------------------------------------------------------------");
            System.out.println("All Runners Details : ");
            System.out.println("-------------------------------------------------------------");

            // getting the value for each key
            for(Map.Entry<String, Integer> entry:list_2){
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }

        }}




