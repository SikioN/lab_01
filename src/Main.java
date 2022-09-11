import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        final int START = 2, END = 19;
        final int LENGTH = 16;
        final double MIN = -10.0, MAX = 3.0;

        short[] c = new short[END - START + 1];
        double[] x = new double[LENGTH];
        double[][] d = new double[END - START + 1][LENGTH];
        int[] check = {6, 7, 10, 12, 13, 14, 16, 18, 19};

        for (int i = 0; i < END - START + 1; i++) c[i] = (short) (i + START);
        for (int i = 0; i < LENGTH; i++) {
            double value = MIN + random() * ((MAX - MIN) + 1);
            x[i] = ceil(value * pow(10, 4)) / pow(10, 4);
        }

        for (int i = 0; i < END - START + 1; i++) {
            for (int j = 0; j < LENGTH; j++) {
                /* For numbers with fractional degree, the base must be positive, else will be NaN */
                d[i][j] = sin(pow(atan(sin(x[j])) / (cos(pow(x[j], x[j] / 2) - 1)), 3));
                if (c[i] == 8) d[i][j] = (pow(0.75 / asin((x[j] - 3.5) / 13), 2 * x[j]) - 0.75) / 0.25;
                else {
                    for (int value : check) {
                        if (c[i] == value) {
                            d[i][j] = pow(2 * tan(x[j] / (x[j] + 1)), asin(1 / pow(E, abs(x[j]))));
                            break;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < END - START + 1; i++) {
            for (int j = 0; j < LENGTH; j++) {
                System.out.printf("%7.4f ", d[i][j]);
            }
            System.out.println();
        }
    }
}






















