public class Question1 {
        public void test(){
            System.out.println("Base");
        }
}
class DerivedA extends Question1 {
    public void test(){
        System.out.println("DirevedA");
    }
}
class DerivedB extends DerivedA{
    public void test(){
        System.out.println("DerivedB");
    }

    public static void main(String[] args) {
        Question1 b1=new DerivedB();
        Question1 b2=new DerivedA();
        Question1 b3=new DerivedB();
        b1=(Question1)b3;
        Question1 b4=(DerivedA) b3;
        b1.test();
        b4.test();

    }
}
