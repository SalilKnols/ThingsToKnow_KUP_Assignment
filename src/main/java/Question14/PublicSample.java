package Question14;

class MyClass {
    public void myPublicMethod() {
        System.out.println("This is a public method.");
    }
}
class MyPackageClass {
    public void callMyPublicMethod() {
        MyClass myClass = new MyClass();
        myClass.myPublicMethod();
    }
}
public class PublicSample {
    public static void main(String[] args) {
        MyPackageClass myPackageClass = new MyPackageClass();
        myPackageClass.callMyPublicMethod();
    }
}
