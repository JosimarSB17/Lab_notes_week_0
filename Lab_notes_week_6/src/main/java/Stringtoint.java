public class Stringtoint {
    public static void main(String[] args) {

            String num = "Cat";
        try{
            int num2 = Integer.parseInt(num);
            System.out.println("The number is " + num2);
        } catch (NumberFormatException e) {
            System.out.println( num + " is not an integer");
        }

    }
}
