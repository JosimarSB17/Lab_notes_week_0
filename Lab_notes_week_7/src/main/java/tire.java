public class tire  implements Comparable<tire>{

    private String name;
    private double price;
    private int warrantyMiles;

    public tire(String name, double price, int warrantyMiles) {
        this.name = name;
        this.price = price;
        this.warrantyMiles = warrantyMiles;
    }

    public double getPrice() {
        double priceper1000 = (this.price / warrantyMiles) * 1000;
        return priceper1000;
    }

    public double costfor4(){
        return this.price * 4;
    }

    @Override
    public String toString() {
        double priceper1000 = getPrice();
        return String.format("%s costs %.2f per tire. Cost per 1000 miles is $%.2f"
                , this.name, this.price, priceper1000);
       // return ("This tire is called" + name);
    }
    @Override
    public int compareTo(tire anothertire) {
        //return Double.compare(this.getPrice(), anothertire.getPrice());
        return this.name.compareTo(anothertire.name);
    }
}
