public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double massIndex = service.calculate(176,70 );
        System.out.println("Your mass index is:");
        System.out.println(massIndex);
        if (massIndex >= 25) {
            System.out.println("Bad :(");
        }
    }
}
