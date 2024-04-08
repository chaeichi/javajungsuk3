import java.util.Scanner;

class Exercise5_12 {
    public static void main(String[] args) {
        String[][] words = {
                {"chair", "의자"}, // words[0][0], words[0][1]
                {"computer", "컴퓨터"}, // words[1][0], words[1][1]
                {"integer", "정수"} // words[2][0], words[2][1]
        };

        int answer = 0; // 문제를 맞춘 개수를 저장하기 위한 변수
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < words.length; i++) {
            System.out.printf("Q%d. %s의 뜻은? ", i+1, words[i][0]);

            String tmp = scanner.nextLine();

            if(tmp.equals(words[i][1])) {
                System.out.printf("정답입니다.%n%n");
                answer++;
            } else {
                System.out.printf("틀렸습니다. 정답은 %s입니다.%n%n", words[i][1]);
            }
        }
        System.out.println("전체 " + words.length + "문제 중 " + answer + "문제 맞추셨습니다.");
    }
}