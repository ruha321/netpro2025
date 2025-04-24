//ユーザの現在の年齢を入力し、10年後の年齢を表示するプログラム
import java.util.Scanner;
import java.time.*;

public class PrintYourAge {
	private static String gengou(int year) {
		String gengou = "";
		if (year >= 1868 && year <= 1911) {
			gengou = "明治" + (year - 1867);
		} else if (year >= 1912 && year <= 1925) {
			gengou = "大正" + (year - 1911);
		} else if (year >= 1926 && year <= 1988) {
			gengou = "昭和" + (year - 1925);
		} else if (year >= 1989 && year <= 2018) {
			gengou = "平成" + (year - 1988);
		} else if (year >= 2019 && year <= 2030) {
			gengou = "令和" + (year - 2018);
		} else {
			gengou = "不明";
		}
		return gengou;
	}
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDateTime nowTime = LocalDateTime.now();
		int nowYear = nowTime.getYear();
        // LocalDateTime.now() は、現在の日時を取得するメソッド
			// BufferedReader というのは、データ読み込みのクラス(型)
			// クラスの変数を作るには、new を使う。

			// readLine() は、入出力エラーの可能性がある。エラー処理がないとコンパイルできない。
			//  Java では、 try{ XXXXXXXX }  catch(エラーの型 変数) { XXXXXXXXXXXXXXXXXX } と書く
		//try {
		System.out.println("何歳ですか?");
		String line = sc.nextLine();
		while (!(line.equals("q") || line.equals("e"))) {
			int age = Integer.parseInt(line);
			// 年齢がマイナスまたは120以上の場合、再度入力を促す
			while (age < 0 || age >= 120) {
				System.out.println("年齢は0歳以上120歳以下で入力してください。");
				System.out.println("何歳ですか?");
				line = sc.nextLine();
				age = Integer.parseInt(line);
			}
            //現在の西暦を2030から引いて、その値を年齢に足して2030年の年齢にする
            // 現在の西暦から年齢を引いて誕生念を特定し、誕生年と元号を対応させて表示する
            //qまたはeが入力された場合は、プログラムを終了する
			System.out.println("あなたは" + age + "歳ですね。");
			System.out.println("あなたは2030年に、" + (age + 2030 - nowYear) + "歳ですね。");
			int birthYear = nowYear - age;
			System.out.println("あなたは" + gengou(birthYear) + "年に生まれですね。");
			System.out.println("何歳ですか?");
			line = sc.nextLine();
		}
		//}
        /* 
		catch(IOException e) {
			System.out.println(e);
		}
        */
        sc.close();
	}
}