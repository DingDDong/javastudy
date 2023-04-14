import java.time.ZoneId;

class ZoneIdDemo{
        public static void main(String[] args) {
              ZoneId.getAvailableZoneIds()
                      .stream()
                      .filter (s -> s.startsWith("Asia")) // 제거하면 전체 리스트 제공
                      .sorted()
                      .forEach(s -> System.out.println(s));
        }
}