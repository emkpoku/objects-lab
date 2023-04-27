import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int maxIndex = 0;
        int minIndex = 0;


        Students student1 = new Students();
        System.out.println("Please enter the new Students first name, GPA, and student id");
        student1.firstName = input.nextLine();
        student1.gpa = input.nextDouble();
        student1.studentID = input.nextInt();

        System.out.println(student1.firstName + " is currently a student at Towson University, their GPA is " + student1.gpa + " and their student ID is "+ student1.studentID);
        Students[] students = new Students[5];
        students[0] = student1;

        for (int x = 1; x < students.length; x++ )
        {
            Students student = new Students();
            System.out.println("Please enter the students first name, current GPA, and student ID");
            student.firstName = input.next();
            student.gpa = input.nextDouble();
            student.studentID = input.nextInt();
            students[x] = student;
        }
        for (int y = 0; y< students.length; y++)
        {
            System.out.println(students[y].firstName+ " is currently a student at Towson University, their GPA is "+ students[y].gpa +" and their student ID is "+ students[y].studentID);
        }

        highestGPA(students, maxIndex);
        lowestGPA(students, minIndex);
        
        System.out.println("The average GPA of the students is " + avgGPA(students));


    }

    public static void highestGPA (Students[] students, int maxIndex)
    {
        for (int z = 0; z<students.length; z++)
        {
            if (students[z].gpa > students[maxIndex].gpa)
            {
                maxIndex = z;
            }
        }
        System.out.println(students[maxIndex].firstName +" has the highest GPA of " + students[maxIndex].gpa);
    }

    public static void lowestGPA (Students[] students, int minIndex)
    {
        for (int g=0; g<students.length; g++)
        {
            if (students[g].gpa < students[minIndex].gpa)
            {
                minIndex = g;
            }
        }
        System.out.println(students[minIndex].firstName +" has the lowest GPA of " + students[minIndex].gpa);
    }
    
    public static double avgGPA(Students[] students)
    {
        double avgGPA = 0;
        double sum = 0;
        for (int l=0;  l<students.length; l++)
        {
            sum+=students[l].gpa;
        }
        avgGPA = sum/students.length;
        return avgGPA;
    }

}

/*Create a class called Student.
Give the student three properties:
1. First Name
2. Current GPA
3. Student ID
Do the following:
1. Ask the user for input to create a new student object. After you do, print their information in the following format
“First Name is a currently a student at Towson University, their GPA is Current GPA, and their student ID is Student ID”
2. Ask the user for information to make 5 total students, all with unique information. (Hint this will need to be stored in an array!)
3. Print all the students information in the above format.
4. Find the student with the highest GPA and print their name and gpa only.
5. Find the student with the lowest GPA and print their name and gpa only.
6. Find the average GPA of all the students and print it. */