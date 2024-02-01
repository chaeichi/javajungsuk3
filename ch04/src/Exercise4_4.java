class Exercise4_4 {
    public static void main(String[] args) {
        int sum = 0;
        int num = 0;

        while (sum < 100) {
            ++num;
            if (num % 2 != 0) {
                sum += num;
            } else {
                sum -= num;
            }
        }

        System.out.println("sum:" + sum);
        System.out.println("num:" + num);
    }
}
