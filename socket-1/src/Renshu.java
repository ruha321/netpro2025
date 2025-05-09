class Renshu {
    // xを2倍にして返す関数
    public int doubleValue(int x) {
        return x * 2;
    }

    //ここに続きを実装していく。
    public int sumUpToN(int x) {
        int sum = (1 + x) * x / 2;
        return sum;
    }

    public int sumFromPtoQ(int x, int y) {
        if (x > y) {
            return -1;
        }
        int sum = (x + y) * (y - x + 1) / 2;
        return sum;
    }

    public int sumFromArrayIndex(int[] a, int x){
        if (a.length <= x) {
            return -1;
        }
        int sum = 0;
        for (int i = x; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public int selectMaxValue(int[] a) {
        int max = -999999999;
        for(int x: a) {
            if (max < x) {
                max = x;
            }
        }
        return max;
    }

    public int selectMinValue(int[] a) {
        int min = 0x7FFFFFFE;
        for (int x: a) {
            if(min > x) {
                min = x;
            }
        }
        return min;
    }

    public int selectMaxIndex(int[] a) {
        int max_index = 0;
        int max = 0x90000000;
        for (int i = 0; i < a.length; i++){
            if (max < a[i]) {
                max_index = i;
                max = a[i];
            }
        }
        return max_index;
    }

    public int selectMinIndex(int[] a) {
        int min = 0x7FFFFFFF;
        int min_index = 0;
        for (int i = 0; i < a.length; i++){
            if (min > a[i]) {
                min_index = i;
                min = a[i];
            }
        }
        return min_index;
    }

    public void swapArrayElements(int[] a, int x, int y) {
        int tmp = a[x];
        a[x] = a[y];
        a[y] = tmp;
    }

    public boolean swapTwoArrays(int[] a, int[] b) {
        if(a.length != b.length) {
            return false;
        }
        int length = a.length;
        for(int i = 0; i < length; i++) {
            int tmp = a[i];
            a[i] = b[i];
            b[i] = tmp;
        }
        return true;
    }
}