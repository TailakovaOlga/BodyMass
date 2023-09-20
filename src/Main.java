public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightInKg = 98;
        double heightInMeters = 1.87;
        int bmi;
        bmi = service.calculate(heightInMeters, weightInKg);


        System.out.println(bmi);
        System.out.println("Индекс массы тела: " + "bmi");

    }
}




