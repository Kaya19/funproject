public class Question20 {
    public static void main(String[] args) {
        String str1="java";
        String str4="java";
        String [] str2={"j","a","v","a"};
        String str3="";
        for (String str:str2
             ) {
            str3=str3+str;
        }
        boolean b1=str3==str1;
        boolean b2=str1.equals(str3);
        System.out.println(b1+" "+b2);
    }
}
