import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static input.InputUtils.*;


public class Tirecomparison {
    public static void main(String[] args) {

       // tire exaample = new tire("Bridgestone", 50 , 10000);
        //System.out.println("$" + exaample.getPrice());
       // System.out.println(exaample);
       // System.out.println(exaample.costfor4());

        List<tire> tirelist = new ArrayList<>();
        do{
            tire tire = getTireInfo();
            tirelist.add(tire);
        }while (yesNoInput("More tires to add and compare?"));

        Collections.sort(tirelist);
        printReportTable(tirelist);
    }
    public static void printReportTable(List<tire> tirelist) {
        for (tire tire: tirelist){
            System.out.println(tire);
            System.out.println(tire.costfor4());
        }
    }

    public static tire getTireInfo() {
        String name = stringInput("Enter the name of the tire: ");
        double price = positiveDoubleInput("Enter the price of the tire: ");
        int warranty = positiveIntInput("Enter the number of warranty miles: ");

        tire tire = new tire(name, price, warranty);
        return tire;
    }
}
