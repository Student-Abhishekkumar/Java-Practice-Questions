class employ {
    String title;
    String author;
    int price;

    employ(){
        title="";
        author="";
        price=0;
    }
    employ(String author, String title){
        this.author=author;
        this.title=title;

    }
    employ(String author, String title, int price){
        this.author=author;
        this.title=title;
        this.price=price;
    }

    public static void main(String[] args) {
        employ e1=new employ();
        employ e2=new employ("Abhishek", "The learner");
        employ e3=new employ("Abhishek", "The learner",299);

        System.out.println("Name : "+e2.author);
        System.out.println("Title : "+e2.title);

        System.out.println("\nName : "+e3.author);
        System.out.println("Title : "+e3.title);
        System.out.println("Title : "+e3.price);
    }
}
