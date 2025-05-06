import java.util.Arrays;
import java.util.Random;

public class AverageB {
	public static final int N=100;
	Subject[] subjects = new Subject[N];
	static String kamokuname="数学";

	public static void main(String[] args) {
		AverageB average_b= new AverageB(kamokuname);
		average_b.printAverage();
		average_b.isSuccessful();

	}
	
	AverageB(String s){
		this.initalizeScores();
		int id = 1;
		for (Subject sub:subjects) {
			sub.setName(s);
			sub.setStudentId(id);
			id += 1;
		}
	}
	void initalizeScores(){
		Random r = new Random();

		for(int i=0;i<N;i++){
			int score = r.nextInt(N+1);
			subjects[i]= new Subject(score);
		}
	}
	
	void printAverage(){
		int sum=0;
		for(int i=0;i<N;i++){
			sum+=subjects[i].getScore();
		}
		System.out.println("平均点は"+sum/N);
	}

	void isSuccessful(){
		Arrays.sort(subjects);
        for (Subject s: subjects) {
            if (s.getScore() >= 80) {
                System.out.println("合格者は生徒ID:" + s.getStudentId() + "の" + s.getScore() + "点です");
            }
        }
	}//student idと点数をソートしてだせ。＞＝８０以上
}
