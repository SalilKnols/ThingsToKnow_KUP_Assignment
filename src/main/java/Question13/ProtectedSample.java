package Question13;

class Parent {
    protected void protectedMethod()
    {

        System.out.println("This is a protected method.");
    }
}
class Child extends Parent {
    public void callProtectedMethod() {
        protectedMethod();
    }
}
public class ProtectedSample {
    public static void main(String[] args) {
        Child child = new Child();
        child.callProtectedMethod();
    }
}

