import java.util.Arrays;
import java.util.Random;

public class AverageB {
	public static final int N=100;
	Subject[] subject = new Subject[N];
	static String kamokuname="数学";

	public static void main(String[] args) {
		AverageB average_b= new AverageB(kamokuname);
		average_b.initalizeScores();
		average_b.printAverage();
		average_b.isSuccessful();

	}
	
	AverageB(String s){

	}
	void initalizeScores(){
		Random r = new Random();

		for(int i=0;i<N;i++){
			int score = r.nextInt(N+1);
			subject[i]= new Subject(score);
		}
	}
	
	void printAverage(){
		int sum=0;
		for(int i=0;i<N;i++){
			sum+=subject[i].getScore();
		}
		System.out.println("平均点は"+sum/N);
	}

	void isSuccessful(){
        for (Subject s: subject) {
            if (s.getScore() >= 80) {
                System.out.println("合格者は" + s.getScore() + "点です");
            }
        }
	}//student idと点数をソートしてだせ。＞＝８０以上
}
