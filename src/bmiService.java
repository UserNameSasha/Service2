public class bmiService {
    public int calculate(double height, int mass) {
        double bmi = mass / (height * height) ;
        return (int) bmi;
    }
}

