public class Bus {
    private int number;
    private String route;
    private int capacity;

    public Bus(int number, String route, int capacity) {
        this.number = number;
        this.route = route;
        this.capacity = capacity;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void printInfo() {
        System.out.println("Bus number: " + number + ", route: " + route + ", capacity: " + capacity);
    }
}
