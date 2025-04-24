import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
public class TheBoilingEarthEra {
    double[][] temperatures = new double[10][31];

    final int CSV_YEAR = 0;
    final int CSV_DAY = 2;
    final int CSV_TEMPERATURE = 3;


    TheBoilingEarthEra() {
        // 2016年から2024年までの気温データをアメダスのdata.csvファイルから格納
        try {
            Scanner sc = new Scanner(new FileInputStream("data.csv"));
            // CSVファイルのヘッダーをスキップ
            for (int i = 0; i < 6; i++) {
                sc.nextLine();
            }
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] data = line.split(",");
                int year = Integer.parseInt(data[CSV_YEAR]) - 2016;
                temperatures[year][Integer.parseInt(data[CSV_DAY]) - 1] = Double.parseDouble(data[CSV_TEMPERATURE]);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // 2025年はデータが無いためランダムな気温を生成
        for (int i = 0; i < temperatures[9].length; i++) {
            Random random = new Random();
            temperatures[9][i] = random.nextDouble() * 10 - 5 + 31.7;
        }
        
    }

}
