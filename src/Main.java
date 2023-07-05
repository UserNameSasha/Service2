public class Main {
    public static void main(String[] args) {
        bmiService service = new bmiService();
        double height = 1.87;
        int mass = 98;
        double bmi = service.calculate(height, mass);
        System.out.println((int) bmi);
    }
}