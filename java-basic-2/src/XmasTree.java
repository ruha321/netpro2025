import java.util.*;

public class XmasTree {
    int leaves;
    int trunkWidth;
    int trunkLength;
    String snowPattern;

    public XmasTree(int leaves, int trunkWidth, int trunkLength, String snowPattern) {
        this.leaves = leaves;
        this.trunkWidth = trunkWidth;
        this.trunkLength = trunkLength;
        this.snowPattern = snowPattern;
    }

    public void draw() {
        for (int i = 0; i < leaves; i++) {
            // leaves - (i + 1)
            String leaveLine =  "*".repeat(i);
            int count = 0;
            for (int j = leaves - (i + 1); j > 0; j -= 1) {
                // System.out.println("add snowPattern");
                if (count % 3 == 1){
                    leaveLine = snowPattern + leaveLine;
                } else {
                    leaveLine = " " + leaveLine;
                }
                count += 1;
            }
            System.out.println(leaveLine + new StringBuilder(leaveLine).reverse().toString());
        }
        for (int i = 0; i < trunkLength; i++) {
            System.out.println(" ".repeat(leaves - 1 - trunkWidth / 2) + "*".repeat(trunkWidth));
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("葉の数,幹の幅,幹の長さ,雪模様");
            String line = sc.nextLine();
            if(line.equals("q") || line.equals("e")) {
                System.out.println("プログラムを終了します...");
                break;
            }
            String[] parts = line.split(",");
            if (parts.length != 4) {
                System.out.println("不正な値です、入力をやり直してください");
                continue;
            }
            int leaves = Integer.parseInt(parts[0]);
            int trunkWidth = Integer.parseInt(parts[1]);
            int trunkLength = Integer.parseInt(parts[2]);
            String snowPattern = parts[3];

            // Create the tree
            XmasTree tree = new XmasTree(leaves, trunkWidth, trunkLength, snowPattern);
            tree.draw();
        }

        sc.close();

    }

}
