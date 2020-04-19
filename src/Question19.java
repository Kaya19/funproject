public class Question19 {
    private char var;

    public static void main(String[] args) {
        char var1='a';
        char var2=var1;
        var2='e';

        Question19 obj1=new Question19();
        Question19 obj2=obj1;
        obj1.var='i';
        obj2.var='o';

        System.out.println(obj1==obj2);

       System.out.print(var1+","+var2);
        System.out.print(obj1.var+","+obj2.var);
    }
}
