public class Subject implements Comparable<Subject>{
	String name;
	int score;
	private int studentid;

	Subject(int s) {  // これがコンストラクタ。特殊なメソッド。クラス名と同じ。
		score = s; 
	}

// setScore というメソッドを定義する。
// score に値を設定する。
	public void setScore(int num){
		score = num;
	}

// getScore というメソッドを定義する。
// scoreを返す。
	public int getScore() {
		return score;
	}

    public void setName(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }

    public void setStudentId(int id) {
        studentid = id;
    }
    public int getStudentId() {
        return studentid;
    }

    @Override
    public int compareTo(Subject s) {
        return this.getScore() - s.getScore();
    }
}

// メソッド 関数のこと  
//   public 返り値(戻り値return value) 関数名() {
//      中に具体的な処理を書く
//  }
