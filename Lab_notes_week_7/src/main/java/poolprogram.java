import org.example.Pool;

public class poolprogram {
    public static void main(String[] args) {
        Pool ymca = new Pool("YMCA", 50);

        double totalswam = ymca.distanceforlaps(6);
        System.out.println("Total swam: " + totalswam);
        System.out.println(ymca);

        Pool como = new Pool("COMO", 25);
        System.out.println(como.distanceforlaps(10));

        System.out.println(como);

        Pool edina  = new Pool("EDINA", 50);
        System.out.println(edina.distanceforlaps(12));
        System.out.println(edina);
    }


}
