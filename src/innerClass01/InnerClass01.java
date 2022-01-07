package innerClass01;

public class InnerClass01 { // 外部其它类
    public static void main(String[] args) {
    }
}

class Outer { //外部类
    private int n1 = 100;
    public void m1() {
        System.out.println("m1()");
    }
    {
        System.out.println("代码块...");
    }
    public Outer(int n1) {
        this.n1 = n1;
    }
    class Inner { //内部类，在Outer类的内部
    }
}
