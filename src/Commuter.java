public class Commuter {
    private string name;
    private double balance;

    public Commuter(string name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public string getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void printInfo() {
        System.out.println("Commuter name: " + name + ", balance: " + balance);
    }
}
