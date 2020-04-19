public class Question17 {
    public static void main(String[] args) {
        String str=" ";
        str.trim(); // bu line return a new string but it i snot assignin to back str ot another string becasue of that reason str hala " ";
         //str=str.trim(); boyle olsaydi true true olurdu


        System.out.println(str.equals("")+" "+str.isEmpty());

    }
}
