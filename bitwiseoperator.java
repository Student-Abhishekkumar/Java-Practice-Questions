// import Name.*;

public class bitwiseoperator {

    public static void main(String[] args) {
        
        name ob = new name();
        int a = 5, b = 7;
        ob.display();
        System.out.println("AND OPERATOR : " + (a & b));
        System.out.println("OR OPERATOR : " + (a | b));
        System.out.println("XOR OPERATOR : " + (a ^ b));
        System.out.println("Complement OPERATOR : " + (~a));
    }

    static class name {
        public void display() {
            System.out.println("Display method called");
        }
    }
}