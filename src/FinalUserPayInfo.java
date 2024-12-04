public class FinalUserPayInfo {

    private final String name;   // 이름
    private final double amount; // 금액

    // 생성자는 private 로 설정하여 객체 생성 방식을 팩토리 메서드를 통해 유도
    private FinalUserPayInfo(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    // 팩토리 메서드 (편리한 객체 생성을 위해)
    public static FinalUserPayInfo of(String name, double amount) {
        return new FinalUserPayInfo(name, amount);
    }

    // toString() 메서드를 오버라이드하여 출력 형식을 지정
    @Override
    public String toString() {
        return "이름: " + name + ", 금액: " + String.format("%.1f", amount);
    }
}
