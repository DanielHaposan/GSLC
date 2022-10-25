package package1;


import java.util.Scanner;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
        new Main();
    }
Scanner sc = new Scanner(System.in);
Vector<Student> students = new Vector<Student>();
void menu() {
   
    System.out.println("1. Add Student data");
    System.out.println("2. Remove Student data");
    System.out.println("3. Search Student data");
    System.out.println("4. Average Student data");
    System.out.println("5. Exit");
    System.out.print("Choose: ");
}

void insertData() {
 
    
    String name;
    int year;
    float gpa;
   

    do {
        System.out.print("Enter new student name: "); name = sc.nextLine();
    } while(name.length() <= 3 || name.length() > 12) ;
    
    do {
        System.out.print("Enter new student year : "); year = sc.nextInt();
    } while(year< 2000 || year > 2022);
    
    do {
        System.out.print("Enter new student gpa : "); gpa = sc.nextFloat();
    } while(gpa<0 || gpa>4.0);


    students.add(new Student( name, year,gpa));
    
    System.out.println("Press enter to continue... ");
    
       
}


void viewData(int printer) {

        
    if(students.isEmpty()) {
        System.out.println("There is no student data");
      
        return;
    }

    int counter = 0;
    
    
    System.out.println("No | Name\t | Year\t | GPA\t |");
    System.out.println("===================================");

    for(var i : students) {
        System.out.printf("%d. | %-11s | %-5s | %5s | \n", ++counter,  i.getName(), i.getYear(), i.getgpa());
    }
    System.out.println("===================================");
    
    if(printer == 0) System.out.println();
    System.out.println();
}

void deleteData() {

  
    if(students.isEmpty()) {
        System.out.println("There's no employee!");
  
        return;
    }
    
    viewData(1);
    System.out.println("\n");
    int choose = -1;
    
  
    
    System.out.println("Enter 0 to cancel!");
    do {
        System.out.printf("Input number to be deleted [1..%d]: ", students.size());
        try {
            choose = sc.nextInt();
        } catch (Exception e) {
            choose = -1;
        }
        sc.nextLine();
    } while(choose < 0 || choose > students.size());

    if(choose == 0) return;

   
    choose--;

  
    students.remove(choose);
    System.out.println("Deleted Selected data");
    System.out.println("Press enter to continue... ");

    
}

void searchData() {

  
    
    if(students.isEmpty()) {
        System.out.println("There's no Student !");
  
        return;
    }
    System.out.println("Enter Student Name");
    for(var i : students) {
        
   
     String name = i.getName();
     name = sc.nextLine();
     
     System.out.printf("Name: %s\nYear : %s\nGPA : %s\n  ", i.getName(), i.getYear(), i.getgpa());
     System.out.println();
     
   
   }
    
  
    
}


void avg() {

  
    if(students.isEmpty()) {
        System.out.println("There's no GPA");
        
        return;
    }
    float total = 0;
   
  
    for(var i : students) {
    
            float gpa = i.getgpa();
            total+= gpa / students.size();
        
    }
    System.out.printf("The Average GPA of %f student is %f",students.size(),total);
    System.out.println("\n");
    

    }
    

public Main() {
    int choose = 0;
    do {
       
        menu();

        try {
            choose = sc.nextInt();
        } catch (Exception e) {
            
            choose = 0;
        }
        sc.nextLine();

        if(choose == 1) insertData();
        else if(choose == 2) deleteData();
        else if(choose == 3) searchData();
        else if(choose == 4) avg();
        else if(choose < 0 || choose > 5){
           
            sc.nextLine();
        }
    } while(choose != 5);
    System.out.println("See you next time !");
}



}

