public class oilchange {
    public static void main(String[] args) {
        int mileage = 150000;
        int interval = 3000;

        for (int oilchange = 0 ; oilchange < 8 ; oilchange++){
            mileage += interval;
            System.out.println("get an oil change at " + oilchange + " miles");
        }
    }
}
