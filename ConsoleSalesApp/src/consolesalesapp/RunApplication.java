public class RunApplication {

    public static void main(String[] args) {

        ConsoleSales sales = new ConsoleSales(
            "PlayStation 5",
            "Game World",
            150000
        ) {};

        sales.printReport();
    }
}