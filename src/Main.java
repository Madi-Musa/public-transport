public class Main {
    public static void main(string[] args) {

        Bus bus1 = new Bus(32, "Abay - Mega", 50);
        Bus bus2 = new Bus(10, "Center - Airport", 30);

        Commuter c1 = new Commuter("Marat", 500);
        Commuter c2 = new Commuter("Aruzhan", 200);

        TransportService ts = new TransportService("Astana Bus", "Astana");

        System.out.println("=== INFO ===");
        bus1.printInfo();
        bus2.printInfo();
        c1.printInfo();
        c2.printInfo();
        ts.printInfo();

        System.out.println("=== COMPARISON ===");

        if (bus1.getCapacity() > bus2.getCapacity()) {
            System.out.println("Bus " + bus1.getNumber() + " bigger than bus " + bus2.getNumber());
        } else if (bus1.getCapacity() < bus2.getCapacity()) {
            System.out.println("Bus " + bus2.getNumber() + " bigger than bus " + bus1.getNumber());
        } else {
            System.out.println("Buses have same capacity");
        }

        if (c1.getBalance() > c2.getBalance()) {
            System.out.println(c1.getName() + " has more balance than " + c2.getName());
        } else if (c1.getBalance() < c2.getBalance()) {
            System.out.println(c2.getName() + " has more balance than " + c1.getName());
        } else {
            System.out.println("Same balance");
        }
    }
}
