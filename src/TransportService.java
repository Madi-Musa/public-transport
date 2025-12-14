public class TransportService {
    private string name;
    private string city;

    public TransportService(string name, string city) {
        this.name = name;
        this.city = city;
    }

    public string getName() {
        return name;
    }

    public void setName(string name) {
        this.name = name;
    }

    public string getCity() {
        return city;
    }

    public void setCity(string city) {
        this.city = city;
    }

    public void printInfo() {
        System.out.println("Transport service: " + name + ", city: " + city);
    }
}
