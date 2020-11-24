public class BmiService {
    public double calculate(double height, int weight) {
        // рост в cм, вес в кг
        double CalcHeight = ((height * 0.01) * (height * 0.01)) ;
        double ibm = weight / CalcHeight;
        return ibm;
    }
}
