public class InterfaceImplDemo implements DefaultInterfaceDemoA, DefaultInterfaceDemoB, StaticInterfaceDemo {
    public static void main(String[] args) {
        // Create the object of class that implements the interfaces
        InterfaceImplDemo obj = new InterfaceImplDemo();
        obj.show();
        StaticInterfaceDemo.display();
    }

    // For diamond problem we have to override the default method of interfaces
    @Override
    public void show() {
        DefaultInterfaceDemoA.super.show();
        DefaultInterfaceDemoB.super.show();
    }

}
