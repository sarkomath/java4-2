public class BmiService {
    public double calculate(double height, int weight) {
        // рост в cм, вес в кг
        double calcHeight = ((height * 0.01) * (height * 0.01)) ;
        double ibm = weight / calcHeight;
        return ibm;
    }
}
