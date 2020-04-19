public class Question3 {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    String name;
    int age=25;
    public Question3(String name){
     //   this();
        setName(name);
    }
    public Question3 (String name,int age){
       // Question3 (name);
        setAge(age);

    }
    public String show(){
        return name+""+age+"";//+number;
    }

    public static void main(String[] args) {

    }
}
