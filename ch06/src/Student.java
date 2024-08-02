class Student {
    String name; // 학생이름
    int ban; // 반
    int no; // 번호
    int kor; // 국어점수
    int eng; // 영어점수
    int math; // 수학점수

    int getTotal() {
        return kor + eng + math;
    }

    float getAverage() {
        return Math.round((getTotal() / 3.0f) * 10) / 10.0f;
    }
}
