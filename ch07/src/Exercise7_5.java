class Product {
    int price; // 제품의 가격
    int bounsPoint; // 제품구매 시 제공하는 보너스 점수

    Product(int price) {
        this.price = price;
        bounsPoint = (int) (price/10.0);
    }

    Product() {

    }
}

class Tv extends Product {
    Tv() { }

    public String toString() {
        return "Tv";
    }
}

class Exercise7_5 {
    public static void main(String[] args) {
        Tv t = new Tv();
    }
}