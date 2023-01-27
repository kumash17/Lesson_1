
public class Main {

    public static void main(String[] args) {
        String myCompetitionResult;

        final int NUM = 5;

        String word = "finished";

        myCompetitionResult = word + NUM;

        System.out.println(myCompetitionResult);


        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }



        double [] fraction2 = {1.2,5.7,2.7,-4.5,-3.13,3.8,-13.12,4.1,-41.83,15.4,1.2,-51.1,9.12,-31.5,5.8};
        double [] fraction = {1.0,2.0,3.0};
        System.out.println(calculateAverage(fraction2));
    }

    private static double calculateAverage(double[] fraction2) {
        boolean isaNumberNegative = false;
        double sum = 0;
        int n = 0;
        for (int i = 0; i < fraction2.length; i++) {
            if (fraction2[i] < 0) {
                isaNumberNegative = true;
                {
                }
            }
            if (fraction2[i] > 0) {
                if (isaNumberNegative) {
                    sum += fraction2[i];
                    n++;
                }
            }
        }
        return sum;
    }
}
