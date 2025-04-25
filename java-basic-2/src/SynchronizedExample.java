public class SynchronizedExample {
    private int count = 0;

    // synchronized キーワードを使用してメソッドを同期する例
    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}
