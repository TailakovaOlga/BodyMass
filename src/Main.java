public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 98;
        double height = 1.87;
        int bmi;
        bmi = service.calculate(height, weight);

        System.out.println(bmi);

        System.out.println("Вес в килограммах:" + "kg");
        System.out.println("Рост в метрах:" + "m");
        System.out.println("Индекс массы тела: " + "bmi");

    }
}




