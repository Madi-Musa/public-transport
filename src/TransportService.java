public class TransportService {
    private String name;
    private String city;

    public TransportService(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void printInfo() {
        System.out.println("Transport service: " + name + ", city: " + city);
    }
}