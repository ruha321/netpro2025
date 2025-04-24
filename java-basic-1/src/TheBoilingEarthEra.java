import java.util.*;
public class TheBoilingEarthEra {
    double[][] temperatures = new double[10][31];

    TheBoilingEarthEra() {
        Random random = new Random();
        for (int i = 0; i < temperatures.length; i++) {
            for (int j = 0; j < temperatures[i].length; j++) {
                temperatures[i][j] = random.nextDouble() * 10 - 5 + 29.0 + i * 0.3;
            }
        }
    }

}
