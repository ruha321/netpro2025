import java.util.Arrays;
import java.util.Random;
public class AverageC {
    int N = 100;
    Subject[] subjects = new Subject[N];

	public static void main(String[] args){
        AverageC averageC = new AverageC();
        averageC.average();
        averageC.succseser();
	}

    AverageC(){
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            subjects[i] = new Subject(random.nextInt(100));
            subjects[i].setStudentId(i + 100);
        }
    }

    public void average() {
        int sum = 0;
        for (Subject s: subjects) {
            sum += s.getScore();
        }
        float ave = (float)sum / N;
        System.out.println("受験者全体での平均点は" + ave + "点です。");
        System.out.println();
    }

    public void succseser() {
        Arrays.sort(subjects);
        System.out.println("合格者の一覧は以下。");
        System.out.println("受験番号,点数");
        for (int i = 0; i < N; i++) {
            if (subjects[i].getScore() >= 80) {
                System.out.println(subjects[i].getStudentId() + "," + subjects[i].getScore());
            }
        }
    }
}
