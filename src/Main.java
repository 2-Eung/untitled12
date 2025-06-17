class Util {
    public static void sayHello(String name) {
        System.out.println("Hello, " + name);
    }
}
@FunctionalInterface
interface A {
    public void say(String name);
}
public class Main {
    public static void main(String[] args) {
        A a = (name) -> Util.sayHello(name); // '람다식' 으로 클래스의 함수를 호출
        A aa = Util::sayHello;                     // '메소드 참조'
        a.say("가가가");
        aa.say("나나나");
    }
}