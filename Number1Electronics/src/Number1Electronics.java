public class Number1Electronics {
    public static void main(String[] args) {

        // Single-dimensional array - Cities (Requirement)
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};

        // Single-dimensional array - Console types for header
        String[] consoles = {"PS5", "XBOX", "SWITCH"};

        // Two-dimensional array - Sales data [city][console]
        int[][] sales = {
            {1000, 2000, 3000}, // Cape Town
            {2000, 3000, 4000}, // Port Elizabeth
            {1500, 1100, 1200} // Pretoria
        };

        // Array to store total per city
        int[] cityTotals = new int[3];

        // Variables for city with most sales
        int maxSales = 0;
        String topCity = "";

        // ================= REPORT =================
        System.out.println("=================================================");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("-------------------------------------------------");
        System.out.printf("%-20s %-10s %-10s %-10s\n", "", consoles[0], consoles[1], consoles[2]);
        System.out.println("-------------------------------------------------");

        // Loop through cities and calculate totals
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s %-10d %-10d %-10d\n", cities[i], sales[i][0], sales[i][1], sales[i][2]);

            // Calculate total for this city
            int total = 0;
            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }
            cityTotals[i] = total;

            // Check for most sales
            if (total > maxSales) {
                maxSales = total;
                topCity = cities[i];
            }
        }

        System.out.println("-------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("-------------------------------------------------");

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s %d\n", cities[i], cityTotals[i]);
        }

        System.out.println();
        System.out.println("CITY WITH THE MOST SALES: " + topCity);
        System.out.println("=================================================");
    }
}