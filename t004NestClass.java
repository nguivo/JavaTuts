public class t004NestClass {
    int outAge = 10;

    class InnerClass {
        int innerAge = 12;
    }
}

class Main {
    public static void main(String[] args) {
        t004NestClass outClass = new t004NestClass();
        Object t004NestClass;
        t004NestClass.InnerClass myInner = outClass.new InnerClass();
        System.out.println(outClass.outAge + " and also.. "+ myInner.innerAge);
    }
}
