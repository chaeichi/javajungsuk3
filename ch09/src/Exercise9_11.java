import java.util.Scanner;

class Exercise9_11 {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                throw new Exception("시작 단과 끝 단, 두 개의 정수를 입력해주세요.");
            }

            int start = Integer.parseInt(args[0]);
            int end = Integer.parseInt(args[1]);

            if (!(2 <= start && 9 >= start && 2 <= end && 9 >= end)) {
                throw new Exception("단위 범위는 2와 9사이의 값이어야 합니다.");
            }

            if (start > end) {
                int tmp = end;
                end = start;
                start = tmp;
            }

            for(int i = start; i <= end; i++) {
                for(int j = 1; j <= 9; j++) {
                    System.out.printf("%d*%d=%d%n", i, j, i*j);
                }
                System.out.println();
            }

        } catch(Exception e) {
            System.out.println(e.getMessage());
            System.out.println("USAGE : GugudanTest 3 5");
            System.exit(0);
        }
    }
}