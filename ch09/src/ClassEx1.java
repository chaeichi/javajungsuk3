final class Card {
    String kind;
    int number;

    Card() {
        this("SPADE", 1);
    }

    Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public String toString() {
        return kind + ":" + number;
    }
}

class ClassEx1 {
    public static void main(String[] args) throws Exception {
        Card c = new Card("HEART", 3); // new연산자로 객체 생성
        Card c2 = Card.class.newInstance(); // class객체를 통해서 객체 생성

        Class cObj = c.getClass();

        System.out.println(c);
        System.out.println(c2);
        System.out.println(cObj.getName());
        System.out.println(cObj.toGenericString());
        System.out.println(cObj.toString());
    }
}