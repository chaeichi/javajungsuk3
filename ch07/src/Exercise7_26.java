class Outer {
    static class Inner {
        int iv = 200;
    }
}
class Exercise7_26 {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer.Inner();
        System.out.println(oi.iv);
    }
}
