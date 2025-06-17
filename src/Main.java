import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] name = {"가가가", "나나나", "다다다", "라라라"};

        for (String n : name) {                                             // 'for'로 출력
            System.out.println(n);
        }
        Arrays.stream(name).forEach(nn -> System.out.println(nn));    // '람다식'으로 출력

        Arrays.stream(name).forEach(System.out::println);                   // '메서드 참조'로 출력
    }
}