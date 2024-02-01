class Exercise4_11 {
    public static void main(String[] args) {
        // Fibonnaci 수열의 시작의 첫 두 숫자를 1, 1로 한다.
        int num1 = 1;
        int num2 = 1;
        int num3 = 0; // 세 번째 값
        System.out.print(num1 + ", " + num2);

        for(int i=0; i<8; i++) {
            num3 = num1 + num2; // 세 번째 값을 첫번 째와 두 번째 값을 더해서 구한다.
            System.out.print(", " + num3); // 세 번째 값 출력
            num1 = num2; // 두 번째 값을 첫번째 값에 넣는다.
            num2 = num3; // 세 번째 값을 두번째 값에 넣는다.
        }
    }
}
