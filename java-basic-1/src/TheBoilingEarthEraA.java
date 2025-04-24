public class TheBoilingEarthEraA extends TheBoilingEarthEra {

    int year2025 = 2025-2016;
    public static void main(String[] args) {
        TheBoilingEarthEraA era = new TheBoilingEarthEraA();
        era.printTemperatures();
    }
    public TheBoilingEarthEraA() {
        super();
    }

    public void printTemperatures() {
        for (int i = 0; i < temperatures[year2025].length; i++) {
            System.out.printf("2025年7月%d日:\t%.1f℃\n", i + 1, temperatures[year2025][i]);
        }
    }
    

}
