class SpecialCharEx {
    public static void main(String[] args) {
        System.out.println('\''); // 작은 따옴표를 묶을 때 '''처럼 표현할 수 없다.
        System.out.println("abc\t123\b456"); // abc와 123 사이에 들여쓰기, \b에 의해 3이 지워짐
        System.out.println('\n'); // 개행(new line)문자
        System.out.println("\"Hello\"") // 큰 따옴표 출력
        System.out.println("c:\\"); // 역슬래시(\)
    }
}
