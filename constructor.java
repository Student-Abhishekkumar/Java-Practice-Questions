package constructor;

class Student {
    Student(){              //constructor can never be called
        System.out.println("This is constructor...");
    }

    public static void main(String[] args) {
        Student ob=new Student();
    }
}