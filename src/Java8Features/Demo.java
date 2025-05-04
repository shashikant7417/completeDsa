package Java8Features;

class A {

    void method1() {

        System.out.println("In method1 A");

    }

}

class B extends A {

    void method1() {

        System.out.println("In method1 B");

    }

    void method2() {

        System.out.println("In method2 B");

    }

}




public class Demo {

    public static void main(String[] args) {

        B b = new B();

        b.method2();

    }

}
