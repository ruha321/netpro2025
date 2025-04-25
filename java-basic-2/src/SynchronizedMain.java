public class SynchronizedMain {
    public static void main(String[] args) {
        SynchronizedExample example = new SynchronizedExample();

        // メソッドを同期しているので、複数のスレッドから同時に呼び出しても安全
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                example.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                example.increment();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // カウントの結果を取得
        System.out.println("Count: " + example.getCount()); // 出力: 2000
    }
}
