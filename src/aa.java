import java.util.Arrays;

    public class aa {
        public static void main(String[] args) {
            String[] Name = {"Shiran", "Hasini", "Chanchala", "Priyankara", "Mayuri",
                    "Sameera", "Supun", "Supuni", "Kavindu", "Nadeeka"};

            int[] time = {342, 448, 398, 399, 350, 321, 299, 378, 384, 440};

            Won_Prizes(Name,time);

        }

        public static void Won_Prizes(String[] name, int[] time) {
            int[] New = {342, 448, 398, 399, 350, 321, 299, 378, 384, 440};
            Arrays.sort(New);

            for (int i = 1; i < time.length  ; i++)
                if (New [0] == time[i]){
                    System.out.println("Won The Prize is " + name[i] + " whose time in minutes is " + time[i]);
                }
            for (int i = 1; i < time.length  ; i++)
                if (New[1] == time[i]){
                    System.out.println("The First Runner Up is " + name[i] + " whose time in minutes is " + time[i]);
                }
        }
}
