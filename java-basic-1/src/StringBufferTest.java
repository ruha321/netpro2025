import java.util.StringJoiner;

public class StringBufferTest {
	public static void main(String[] args) {
		
		int n = 20000; //試行回数
		String word = "a"; //つなげる言葉
		
		/*------------------------------
		+結合による文字連結の処理
		------------------------------*/
		long start = System.currentTimeMillis();
		String sentence = "";
		for(int i = 0;i<n;i++) {
			sentence += word;
		}
		System.out.println(sentence);
        long PlusTime = System.currentTimeMillis()-start;
		System.out.println("+の文字連結処理にかかった時間："+PlusTime+"ms");
		
		/*------------------------------
		StringBufferによる文字連結の処理
		------------------------------*/
		start = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<n;i++) {
			sb.append(word);
		}
		sentence = new String(sb);
		System.out.println(sentence);
        long BufferTime = System.currentTimeMillis()-start;
		System.out.println("StringBufferの文字連結処理にかかった時間："+ BufferTime + "ms");
		
		
		/*------------------------------
		Java8からの機能
		String.joinによる文字連結の処理
		------------------------------*/
		
		String[] words = new String[n];
		for(int i=0;i<n;i++) {
			words[i] = word;//まずは連結する文字を入れた配列を作ります。
		}
		start = System.currentTimeMillis();
		sentence = String.join("", words); //joinメソッドの第一引数に区切り文字を入れるとその文字で区切ってくれます。(StringOperationTestにもサンプル有)
		System.out.println(sentence);
        long JoinTime = System.currentTimeMillis()-start;
		System.out.println("String.joinの文字連結処理にかかった時間："+JoinTime+"ms");
		/*------------------------------
		Java8からの機能
		StringJoinerによる文字連結の処理
		------------------------------*/
		start = System.currentTimeMillis();
		StringJoiner joiner = new StringJoiner("");//引数に区切り文字を入れるとその文字で区切ってくれます。第二第三引数で最初の文字と最後の文字を入れることもできます。(StringOperationTestにもサンプル有)
		for(int i=0;i<n;i++) {
			joiner.add(word);//連結する文字を指定します。
		}
		System.out.println(joiner.toString());
        long JoinerTime = System.currentTimeMillis()-start;
		System.out.println("StringJoinerの文字連結処理にかかった時間："+JoinerTime+"ms");

		System.out.println("+の文字連結処理にかかった時間："+PlusTime+"ms");
		System.out.println("StringBufferの文字連結処理にかかった時間："+ BufferTime + "ms");
		System.out.println("String.joinの文字連結処理にかかった時間："+JoinTime+"ms");
		System.out.println("StringJoinerの文字連結処理にかかった時間："+JoinerTime+"ms");
	}

}
//System.nanoTime()
//long start_nt = System.nanoTime();
//　計測したい処理
// long end_nt = System.nanoTime();
// 
// long total_nt = end_nt - start_nt;