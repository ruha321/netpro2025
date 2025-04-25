public class Example {
    // int型の引数を受け取るメソッド
    public static void printValue(int x) {
        System.out.println("Integer value: " + x);
    }

    // double型の引数を受け取るメソッド
    public static void printValue(double x) {
        System.out.println("Double value: " + x);
    }

    public static void main(String[] args) {
        int intValue = 10;
        double doubleValue = 10.5;

        // int型の引数を持つメソッドが呼び出される
        printValue(intValue);

        // double型の引数を持つメソッドが呼び出される
        printValue(doubleValue);
    }
}
