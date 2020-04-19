public class question13 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder(5);
        String s="";
        if(sb.equals(s)){
            System.out.println("Match 1");
        }
        else if(s==sb.toString()){
            System.out.println("hehe");
        }
        else if(sb.toString().equals(s)){
            System.out.println("match2");

        }
        else {
            System.out.println("nomatch");
        }
    }
}
