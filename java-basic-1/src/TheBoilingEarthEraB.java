public class TheBoilingEarthEraB extends TheBoilingEarthEra {
    int year2025 = 2025 - 2016;

    public static void main(String[] args) {
        TheBoilingEarthEraB era = new TheBoilingEarthEraB();
        era.printTwoOver30Temperatures();
    }

    public TheBoilingEarthEraB() {
        super();
    }

    public void printTwoOver30Temperatures() {
        System.out.println("真夏日連続ペア:");
        for (int i = 0; i < temperatures[year2025].length - 1; i++) {
            if(temperatures[year2025][i] > 30 && temperatures[year2025][i + 1] > 30) {
                System.out.printf("2025年7月%d日:\t%.1f℃と\t2025年7月%d日\t%.1f℃\n", i + 1, temperatures[year2025][i], i + 2, temperatures[year2025][i + 1]);
            }
        }
    }

}
