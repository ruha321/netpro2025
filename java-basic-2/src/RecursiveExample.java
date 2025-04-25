public class RecursiveExample {
    // 階乗を計算する再起関数
    public static int factorial(int n) {
        // ベースケース: nが0または1の場合、階乗は1
        if (n == 0 || n == 1) {
            return 1;
        }
        // 再帰ステップ: nの階乗はn * (n-1)の階乗として計算される
        else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is " + result);
    }
}
