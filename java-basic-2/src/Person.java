public class Person {
    private String name;
    private int age;

    // nameフィールドのgetter
    public String getName() {
        return name;
    }

    // nameフィールドのsetter
    public void setName(String name) {
        // ここでnameの値を検証するなどの追加のロジックを実装できる
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name!");
        }
    }

    // ageフィールドのgetter
    public int getAge() {
        return age;
    }

    // ageフィールドのsetter
    public void setAge(int age) {
        // 年齢の値が正の値であることを確認する
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }
}

class Main {
    public static void main(String[] args) {
        // Personオブジェクトの作成
        Person person = new Person();

        // setterを使用してnameとageを設定
        person.setName("Alice");
        person.setAge(25);

        // getterを使用してnameとageを取得
        System.out.println("Name: " + person.getName()); // 出力: Name: Alice
        System.out.println("Age: " + person.getAge());   // 出力: Age: 25

        // 不正な値をセットしようとする
        person.setName("");
        person.setAge(-5);  // 不正な値がセットされるため、setterでメッセージが表示される

        // セッターで不正な値がセットされた場合、ゲッターで前の正しい値が保持されていることを確認
        System.out.println("Name: " + person.getName()); // 出力: Name: Alice
        System.out.println("Age: " + person.getAge());   // 出力: Age: 25
    }
}
