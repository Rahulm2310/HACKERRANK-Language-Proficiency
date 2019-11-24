import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
import java.util.PriorityQueue;

 class Student
  {



    private int id;
    private String name;
    private double cgpa;

     Student(int id, String name, double cgpa)
     {
         super();
         this.id=id;
         this.name=name;
         this.cgpa=cgpa;
      
     }
  

     int getID()
     {
         return id;
     }

  
    String getName()
    {
        return name;
    }

  
    double getCGPA()
    {
        return cgpa;
    }



 }


class Priorities
{

    List<Student> getStudents(List<String> events)
{

        PriorityQueue<Student> pq = new PriorityQueue<Student>(
    Comparator.comparing(Student::getCGPA).reversed()
    .thenComparing(Student::getName)
    .thenComparing(Student::getID)
    );

        List<Student> l=new ArrayList<Student>();

        
        for(int i=0;i<events.size();i++)
        {
         
            Scanner in =new Scanner(events.get(i));
            String event = in.next();
            if (event.equals("ENTER")) {
                String name = in.next();
                float cgpa = in.nextFloat();
                int token = in.nextInt();
                pq.add(new Student(token,name,cgpa));
            }
         
            else if(event.equals("SERVED"))
            {
               Student first= pq.poll();
            }
         
            in.close();
        }
     

        Student first = pq.poll();
        if (first == null) {
            return l;
        } 
        else
        {
            while (first != null) {

                l.add(first);
                first = pq.poll();

            }
            return l;
        }

    
    }
}



public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
