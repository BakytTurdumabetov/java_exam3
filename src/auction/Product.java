package auction;

public class Product {
    private int id;
    private String name;
    private double price;
    private transient double currentPrice;
    private String honoraryCode;
    private String state;
    private transient State stateObj;

    public Product(){
        currentPrice = price;
    }

    @Override
    public String toString() {
        return String.format(" %s | %-15s | %-15s | %-10s | %s", id, name, stateObj, currentPrice, honoraryCode);
    }

    public void startSale(){
        try {
            this.stateObj.startSale(this);
            this.state = stateObj.getValue();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void raisePrice(){
        try {
            this.stateObj.raisePrice(this);
            this.state = stateObj.getValue();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void withdraw(){
        try {
            this.stateObj.withdraw(this);
            this.state = stateObj.getValue();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void giveToTheWinner(){
        try {
            this.stateObj.giveToTheWinner(this);
            this.state = stateObj.getValue();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public int getId() {
        return id;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getHonoraryCode() {
        return honoraryCode;
    }

    public void setHonoraryCode(String honoraryCode) {
        this.honoraryCode = honoraryCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public State getStateObj() {
        return stateObj;
    }

    public void setStateObj(State stateObj) {
        this.stateObj = stateObj;
    }
}
