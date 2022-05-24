package Lambda;

//This is a normal functional interface practice
public class NormalFunctionalInterface {
    public static void main(String[] args) {
        FIImpl obj=new FIImpl();
        obj.method();
    }
}

@FunctionalInterface
interface FI{
    public abstract void method();
}

class FIImpl implements FI{
    @Override
    public void method(){
        System.out.println("HI, I'm Normal_Functional_Interface");
    }
}
