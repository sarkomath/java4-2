public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double MassIndex = service.calculate(176,96 );
        System.out.println("Your mass index is:");
        System.out.println(MassIndex);
    }
}
