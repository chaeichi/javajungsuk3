class Exercise4_12 {
    public static void main(String[] args) {
       for(int k = 2; k <= 8; k+=3) { // 구구단 세 단씩 단을 나눠줌
           for (int i = 1; i <= 3; i++) { // 곱하는 수
               for (int j = k; j <= k+2; j++) { // k부터 K+2단까지 출력
                   if(j==10) { // 10단은 출력하지 않음
                       break;
                   }
                   System.out.printf("%d*%d=%d\t", j, i, j * i);
               }
               System.out.println();
           }
           System.out.println();
       }
    }
}
