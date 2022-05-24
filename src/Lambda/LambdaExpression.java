package Lambda;

public class LambdaExpression {
    public static void main(String[] args) {
        Inter i = () -> System.out.println("This is a pure lambda expression");
        i.method();
    }
}


@FunctionalInterface
interface Inter{
    void method();
}