package constructors;

class constProb2 {
    int t = 20;
    constProb2() {
        t = 40;
    }
}
class Main2 {
    public static void main(String args[]) {
        constProb2 t1 = new constProb2();
        System.out.println(t1.t);
    }
}
