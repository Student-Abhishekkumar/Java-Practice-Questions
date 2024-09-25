import java.util.*;
public class encap {
    private String name;
    private String idnum;
    private int age;

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public String getIdnum(){
        return getIdnum();
    }

    public void setAge(int newAge){
        age=newAge;
    }

    public void setName(String newName){
        name=newName;
    }

    public void setIdnum(String newIdnum){
        idnum=newIdnum;
    }

    public static void main(String[] args) {
        encap e=new encap();
        e.setName("Abhishek");
        e.setAge(18);
        e.setIdnum("Aju/231288");
    }
}
