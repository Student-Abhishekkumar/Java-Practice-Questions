import java.util.*;
import Name.*;

public class nestedswitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Name obj=new Name();
        obj.display();

        String name,department,semester,subjects;
        System.out.print("Enter your name : ");
        name = sc.nextLine();
        boolean exit=false;

        while (!exit){
            System.out.print("\nEnter Department [ btech cse ] to continue or [ exit ] to terminate the program : ");
            department = sc.nextLine();
            

            if (department.equalsIgnoreCase("exit")){
                exit=true;
                continue;
            }

            if (!department.equalsIgnoreCase("btech cse")){
                System.out.println("Invalid Department");
                continue;
            }

            System.out.print("\nEnter your semester (1st, 2nd, 3rd, 4th, 5th, 6th, 7th, 8th) : ");
            semester = sc.nextLine();

            switch (semester) {
                case "1st":
                    System.out.println("\nSemester : 1st");
                    System.out.println("--------------------------------------------");
                    System.out.println("Subjects Menu :-");
                    System.out.println("\n1. Engineering Mathematics I\n2. Physics\n3. Programming in C++\n4. Engineering Chemistry");
                    System.out.println("--------------------------------------------");

                    System.out.print("Choose the Subject to Submit the Assignment : ");
                    subjects = sc.nextLine();
                    switch (subjects){
                        case "1":
                            System.out.println("Student : "+name);
                            System.out.println("Engineering Mathematics I Assignment Submitted Successfully");
                            break;

                        case "2":
                            System.out.println("Student : "+name);
                            System.out.println("Physics Assignment Submitted Successfully");
                            break;

                        case "3":
                            System.out.println("Student : "+name);
                            System.out.println("Programming in C++ Assignment Submitted Successfully");
                            break;

                        case "4":
                            System.out.println("Student : "+name);
                            System.out.println("Engineering Chemistry Assignment Submitted Successfully");
                            break;
                    
                        default:
                            System.out.println("Invalid Subject");
                    }
                    break;
            
                case "2nd":
                    System.out.println("\nSemester : 2nd");
                    System.out.println("--------------------------------------------");
                    System.out.println("Subjects Menu :-");
                    System.out.println("\n1. Engineering Mathematics II\n2. BEE(Basic Electrical Engineering)\n3. Programming in Python\n4. Engineering Chemistry");
                    System.out.println("--------------------------------------------");

                    System.out.print("Choose the Subject to Submit the Assignment : ");
                    subjects = sc.nextLine();
                    switch (subjects){
                        case "1":
                            System.out.println("Student : "+name);
                            System.out.println("Engineering Mathematics II Assignment Submitted Successfully");
                            break;

                        case "2":
                            System.out.println("Student : "+name);
                            System.out.println("BEE(Basic Electrical Engineering) Assignment Submitted Successfully");
                            break;

                        case "3":
                            System.out.println("Student : "+name);
                            System.out.println("Programming in Python Assignment Submitted Successfully");
                            break;

                        case "4":
                            System.out.println("Student : "+name);
                            System.out.println("Engineering Chemistry Assignment Submitted Successfully");
                            break;
                    
                        default:
                            System.out.println("Invalid Subject");
                    }
                    break;
            
                case "3rd":
                    System.out.println("\nSemester : 3rd");
                    System.out.println("--------------------------------------------");
                    System.out.println("Subjects Menu :-");
                    System.out.println("\n1. Engineering Mathematics III\n2. Analog Electronic Circuits\n3. Programming in JAVA\n4. Data Structures");
                    System.out.println("--------------------------------------------");

                    System.out.print("Choose the Subject to Submit the Assignment : ");
                    subjects = sc.nextLine();
                    switch (subjects){
                        case "1":
                            System.out.println("Student : "+name);
                            System.out.println("Engineering Mathematics III Assignment Submitted Successfully");
                            break;

                        case "2":
                            System.out.println("Student : "+name);
                            System.out.println("Analog Electronic Circuits Assignment Submitted Successfully");
                            break;

                        case "3":
                            System.out.println("Student : "+name);
                            System.out.println("Programming in JAVA Assignment Submitted Successfully");
                            break;

                        case "4":
                            System.out.println("Student : "+name);
                            System.out.println("Data Structures Assignment Submitted Successfully");
                            break;
                    
                        default:
                            System.out.println("Invalid Subject");
                    }
                    break;
            
                case "4th":
                    System.out.println("\nSemester : 4th");
                    System.out.println("--------------------------------------------");
                    System.out.println("Subjects Menu :-");
                    System.out.println("\n1. Design and Analysis of Algorithms\n2. Database Management Systems\n3. Computer Networks");
                    System.out.println("--------------------------------------------");

                    System.out.print("Choose the Subject to Submit the Assignment : ");
                    subjects = sc.nextLine();
                    switch (subjects){
                        case "1":
                            System.out.println("Student : "+name);
                            System.out.println("Design and Analysis of Algorithms Assignment Submitted Successfully");
                            break;

                        case "2":
                            System.out.println("Student : "+name);
                            System.out.println("Database Management Systems Assignment Submitted Successfully");
                            break;

                        case "3":
                            System.out.println("Student : "+name);
                            System.out.println("Computer Networks Assignment Submitted Successfully");
                            break;

                        default:
                            System.out.println("Invalid Subject");
                    }
                    break;
            
                case "5th":
                    System.out.println("\nSemester : 5th");
                    System.out.println("--------------------------------------------");
                    System.out.println("Subjects Menu :-");
                    System.out.println("\n1. Theory of Computation\n2. Software Engineering\n3. Artificial Intelligence");
                    System.out.println("--------------------------------------------");
                    
                    System.out.print("Choose the Subject to Submit the Assignment : ");
                    subjects = sc.nextLine();
                    switch (subjects){
                        case "1":
                            System.out.println("Student : "+name);
                            System.out.println("Theory of Computation Assignment Submitted Successfully");
                            break;
                    
                        case "2":
                            System.out.println("Student : "+name);
                            System.out.println("Software Engineering Assignment Submitted Successfully");
                            break;
                    
                        case "3":
                            System.out.println("Student : "+name);
                            System.out.println("Artificial Intelligence Submitted Successfully");
                            break;
                    
                        default:
                            System.out.println("Invalid Subject");
                    }
                    break;
            
                case "6th":
                    System.out.println("\nSemester : 6th");
                    System.out.println("--------------------------------------------");
                    System.out.println("Subjects Menu :-");
                    System.out.println("\n1. Machine Learning\n2. Compiler Design\n3. Cloud Computing");
                    System.out.println("--------------------------------------------");

                    System.out.print("Choose the Subject to Submit the Assignment : ");
                    subjects = sc.nextLine();
                    switch (subjects){
                        case "1":
                            System.out.println("Student : "+name);
                            System.out.println("Machine Learning Assignment Submitted Successfully");
                            break;

                        case "2":
                            System.out.println("Student : "+name);
                            System.out.println("Compiler Design Assignment Submitted Successfully");
                            break;

                        case "3":
                            System.out.println("Student : "+name);
                            System.out.println("Cloud Computing Assignment Submitted Successfully");
                            break;

                        default:
                            System.out.println("Invalid Subject");
                    }
                    break;
            
                case "7th":
                    System.out.println("\nSemester : 7th");
                    System.out.println("--------------------------------------------");
                    System.out.println("Subjects Menu :-");
                    System.out.println("\n1. Big Data\n2. Cyber Security\n3. Internet of Things");
                    System.out.println("--------------------------------------------");

                    System.out.print("Choose the Subject to Submit the Assignment : ");
                    subjects = sc.nextLine();
                    switch (subjects){
                        case "1":
                            System.out.println("Student : "+name);
                            System.out.println("Big Data Assignment Submitted Successfully");
                            break;

                        case "2":
                            System.out.println("Student : "+name);
                            System.out.println("Cyber Security Assignment Submitted Successfully");
                            break;

                        case "3":
                            System.out.println("Student : "+name);
                            System.out.println("Internet of Things Assignment Submitted Successfully");
                            break;

                        default:
                            System.out.println("Invalid Subject");
                    }
                    break;
            
                case "8th":
                    System.out.println("\nSemester : 8th");
                    System.out.println("--------------------------------------------");
                    System.out.println("Subjects Menu :-");
                    System.out.println("\n1. Blockchain Technology\n2. Quantum Computing\n3. Human-Computer Interaction");
                    System.out.println("--------------------------------------------");

                    System.out.print("Choose the Subject to Submit the Assignment : ");
                    subjects = sc.nextLine();
                    switch (subjects){
                        case "1":
                            System.out.println("Student : "+name);
                            System.out.println("Blockchain Technology Assignment Submitted Successfully");
                            break;

                        case "2":
                            System.out.println("Student : "+name);
                            System.out.println("Quantum Computing Assignment Submitted Successfully");
                            break;

                        case "3":
                            System.out.println("Student : "+name);
                            System.out.println("Human-Computer Interaction Assignment Submitted Successfully");
                            break;

                        default:
                            System.out.println("Invalid Subject");
                    }
                    break;
                default:
                    System.out.println("Invalid Semester");
            }
        }
        sc.close();        // In order to stop memory leakage in the program or to close the memory place occupied by the scanner.
        System.out.println("The program is exited !");
    }
}
