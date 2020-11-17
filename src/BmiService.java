public class BmiService {
    public double calculate(double height, int weight) {
        // рост в cм, вес в кг
        double calc_height = ((height * 0.01) * (height * 0.01)) ;
        double ibm = weight / calc_height;
        if (ibm >= 25) {
            System.out.println("Bad :(");
            return ibm;
        } else return ibm;
    }
}
