public class NoHolidayException extends RuntimeException{
    public NoHolidayException() {
        super.printStackTrace();
        System.out.println("この日は平日だよー！働きたくないね～。エラーメッセージです。");
    }

}
