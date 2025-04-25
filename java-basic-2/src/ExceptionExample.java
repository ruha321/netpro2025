public class ExceptionExample {
    // 負の数が渡された場合に例外をスローするメソッド
    public static int calculateSquare(int number) throws IllegalArgumentException {
        if (number < 0) {
            // IllegalArgumentExceptionをスローする
            throw new IllegalArgumentException("Number must be non-negative");
        }
        // 引数の値の二乗を返す
        return number * number;
    }

    public static void main(String[] args) {
        int number = -5;
        try {
            int result = calculateSquare(number);
            System.out.println("Square of " + number + " is " + result);
        } catch (IllegalArgumentException e) {
            // IllegalArgumentExceptionがキャッチされた場合の処理
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
