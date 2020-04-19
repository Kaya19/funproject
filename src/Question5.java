public class Question5 {
    public static  void doSum(Integer x, Integer y){
        System.out.println("Integer sum is"+(x+y));
    }
    public static  void doSum(double x, double y){
        System.out.println("double sum is"+(x+y));
    }
    public static  void doSum(float x, float y){
        System.out.println("float sum is"+(x+y));
    }
    public static  void doSum(int x, int y){
        System.out.println("int sum is"+(x+y));
    }
    public static  void doSum(long x, long y){
        System.out.println("long sum is"+(x+y));
    }

    public static void main(String[] args) {
        doSum(10,20);
        doSum(10.0,20.0);
        doSum(10.0f,20.0f);
        doSum(10.0d,20.0d);
        doSum(10l,20l);
        Integer a=1;
        Integer b=2;
        doSum(a,b);

    }
}
