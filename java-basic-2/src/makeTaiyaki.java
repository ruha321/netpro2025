public class makeTaiyaki{
	//実行はmainメソッドからされる
	public static void main (String args[]){

		//まず、たい焼きを入れる器を用意する
		Taiyaki myTaiyaki一号;

		//new で新しいたい焼きを作って器に入れる
		myTaiyaki一号 = new Taiyaki("あんこ", "カリカリ");

		//たい焼きができました！自己紹介してもらいましょう
		System.out.println("「１号さん自己紹介お願いします！」");
		myTaiyaki一号.自己紹介();

		//まず、たい焼きを入れる器を用意する
		Taiyaki myTaiyaki二号;

		//new で新しいたい焼きを作って器に入れる
		myTaiyaki二号 = new Taiyaki("クリーム", "ふわふわ");

		//たい焼きができました！自己紹介してもらいましょう
		System.out.println("「２号さん自己紹介お願いします！」");
		myTaiyaki二号.自己紹介();

		//キャッチコピーを変えてみましょう
		System.out.println("「全国たい焼きキャッチコピーが変わりました！」");
		Taiyaki.全国たい焼きキャッチフレーズ = "すごくおいしい！";

		//ここでまた自己紹介してもらいましょう
		System.out.println("「あらためて１号さん、２号さん自己紹介お願いします！」");
		myTaiyaki一号.自己紹介();
		myTaiyaki二号.自己紹介();

		//トッピングに口にアイスクリームを入れてみましょう
		System.out.println("「ではここで、１号さんの口にアイスクリーム詰めてみます！」");
		myTaiyaki一号.口の中身 = "アイスクリーム";

		//ここでまた自己紹介してもらいましょう
		System.out.println("「あらためて１号さん、２号さん自己紹介お願いします！」");
		myTaiyaki一号.自己紹介();
		myTaiyaki二号.自己紹介();
	}
}
