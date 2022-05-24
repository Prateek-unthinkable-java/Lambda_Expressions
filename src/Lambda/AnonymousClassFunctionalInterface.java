package Lambda;

//lambda expressions by using anonymous class
public class AnonymousClassFunctionalInterface {
    public static void main(String[] args) {
        //here we are calling FIImpl anonymous class
        FIImpl i=new FIImpl(){
            @Override
            public void method() {
                System.out.println("Hey, I am Anonymous class functional interface.");
            }
        };
        i.method();

        //lambda expression for InterF functional interface
        InterF ob= ()-> {System.out.println("This is InterF functional interface.");
            System.out.println("Hi, this is second InterF line.");};
        ob.method();
    }
}

@FunctionalInterface
interface InterF{
    public abstract void method();
}

