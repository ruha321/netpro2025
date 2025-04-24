public class TheBoilingEarthEraC extends TheBoilingEarthEra {

    public static void main(String[] args) {
        TheBoilingEarthEraC era = new TheBoilingEarthEraC();
        era.print10yearsTwoOver30Temperatures();
    }

    public TheBoilingEarthEraC() {
        super();
    }

    public void print10yearsTwoOver30Temperatures() {
        System.out.println("猛暑日連続ペア:");
        for (int j = 0; j < temperatures.length; j++) {
            int count = 0;
            for (int i = 0; i < temperatures[j].length - 1; i++) {
                if (temperatures[j][i] > 35 && temperatures[j][i + 1] > 35) {
                    System.out.printf("%d年7月%d日:\t%.2f℃と\t%d年7月%d日\t%.2f℃\n", j + 2016, i + 1, temperatures[j][i], j + 2016, i + 2, temperatures[j][i + 1]);
                    count++;
                }
            }
            System.out.printf("%d年の猛暑日連続ペアは%d組です。\n", j + 2016, count);
        }
    }
}