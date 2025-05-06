import java.util.Scanner;

public class MyExceptionHoliday {
    private static int[] holidays = {3, 4, 5, 6, 10, 11, 17, 18, 24, 25, 31};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("5月の何日ですか？(終了したい場合はexitと入力) :");
            String input = sc.next();
            if (input.equals("exit")) {
                break;
            }
            int day = Integer.parseInt(input);
            try {
                if (!is_holiday(day)){
                    throw new NoHolidayException();
                }
            } catch(NoHolidayException e) {
                System.out.println();
                continue;
            }
            System.out.println(input + "日はお休みです。");
            System.out.println();
        }
        sc.close();
    }

    public static boolean is_holiday(int day) {
        for (int holiday: holidays) {
            if (holiday == day) {
                return true;
            }
        }
        return false;
    }
}
