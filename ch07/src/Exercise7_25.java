class Outer {
    class Inner {
        int iv = 100;
    }
}
class Exercise7_25 {
    public static void main(String[] args) {
        Outer ou = new Outer();
        Outer.Inner in = ou.new Inner();
        System.out.println(in.iv);
    }
}
