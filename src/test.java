public class test {
    char c;

    public static void main(String args[]) throws Exception {
        test t = new test();
        char c1 = '\u0000';
        System.out.println(t.c);
        System.out.println(c1);
        System.out.println(t.c == c1);
    }
}

