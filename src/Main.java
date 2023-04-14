import java.time.ZoneId;

class ZoneIdDemo{
        public static void main(String[] args) {
                ZoneId paris = ZoneId.of("Asia/Seoul");
                System.out.println(paris); // 파리의 시간대 정보를 반영한 ZonedId 생성
        }
}