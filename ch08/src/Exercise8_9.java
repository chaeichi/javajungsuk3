class Exercise8_9 {
    public static void main(String[] args) throws Exception {
        throw new UnsupportedFuctionException("지원하지 않는 기능입니다.", 100);
    }
}

class UnsupportedFuctionException extends RuntimeException {
    final private int ERR_CODE; // 에러코드

    UnsupportedFuctionException(String message, int errCode) {
        super(message);
        ERR_CODE = errCode;
    }

    UnsupportedFuctionException(String message) {
        this(message, 100); // ERR_CODE의 기본값을 100으로 초기화
    }

    public int getErrorCode() { // 에러코드(ERR_CODE)를 반환한다.
        return ERR_CODE;
    }

    public String getMessage() { // Exception클래스의 getMessage()를 오버라이딩
        return "[" + getErrorCode() + "]" +  super.getMessage();
    }
}