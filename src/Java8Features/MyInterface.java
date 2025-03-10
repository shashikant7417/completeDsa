package Java8Features;

@FunctionalInterface
public interface MyInterface {

     void sayHello();

     default void by(){
            System.out.println("Bye");
     }

     public static void show(){
            System.out.println("Show");
     }

}
