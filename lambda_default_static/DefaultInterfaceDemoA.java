package lambda_default_static;

public interface DefaultInterfaceDemoA {
    default void show() {
        System.out.println("Default Interface A Method Is Called");
    }
}
