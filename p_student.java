public class p_student {
    String name;
    int roll_no;

    p_student(String n){
        name=n;
    }
    p_student(String na,int n){
        name=na;
        roll_no=n;
    }
    public static void main(String[] args) {
        p_student ob=new p_student("Abhishek");
        p_student obj=new p_student("Abhishek",02);
        
        System.out.println(ob.name);
        System.out.println(obj.name+" "+obj.roll_no);
    }
}
