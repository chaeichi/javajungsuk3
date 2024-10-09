class Exercise9_10 {
    static String format(String str, int length, int alignment) {
        int diff = length - str.length();
        if (diff < 0) {
            return str.substring(0, length);
        }

        char[] ch = new char[length];
        for (int i = 0; i < ch.length; i++) {
            ch[i] = ' ';
        }

        switch (alignment) {
            case 0:
                System.arraycopy(str.toCharArray(), 0, ch, 0, str.length());
                break;
            case 1:
                System.arraycopy(str.toCharArray(), 0, ch, diff/2, str.length());
                break;
            case 2:
                System.arraycopy(str.toCharArray(), 0, ch, diff, str.length());
                break;
        }
        return new String(ch);
    }
    
    public static void main(String[] args) {
        String str = "가나다";

        System.out.println(format(str, 7, 0)); // 왼쪽 정렬
        System.out.println(format(str, 7, 1)); // 가운데 정렬
        System.out.println(format(str, 7, 2)); // 오른쪽 정렬
    }
}