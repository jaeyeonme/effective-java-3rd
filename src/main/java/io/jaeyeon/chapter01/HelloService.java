package io.jaeyeon.chapter01;

public interface HelloService {

    String hello(); // 메소드 선언

    // 메소드 정의
    // 인스턴스 타입의 메소드를 정의 하려면 default 필요 (기본 메소드)
    // 인스턴스를 만들지 않고도 호출할 수 있는 정적 메소드를 정의하려면 static
    static String hi() {
        prepareMessage();
        return "hi";
    }

    // 밖으로 공개는 안되고, 내부에 있는 다른 public한 static 메소드를에서 로직을 내부적으로 사용하기 위해 생성
    static private void prepareMessage() {

    }

    static String hi1() {
        prepareMessage();
        return "hi";
    }

    static String hi2() {
        prepareMessage();
        return "hi";
    }

    default String bye() {
        return "hi";
    }
}
