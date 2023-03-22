import java.time.LocalDate;

class DateOfExecution{
    static String date; // 프로그램의 실행 날짜를 저장하기 위한 변수
    static {
        LocalDate nDate = LocalDate.now();
        date = nDate.toString();
    }
    public static void main(String[] args){
        System.out.println(date);
    }
}