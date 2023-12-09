import java.util.Scanner;

public class gradeCalculator_2 {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("mention the no.of academic subjects for student: ");
        int no_of_subjects= input.nextInt();
        String subject;
        for(int i=0;i<=no_of_subjects;i++){
            subject=input.nextLine();
            System.out.println("subject\t"+  i+ " ="+  subject);
        }

        float total= 0;
        for (int i = 1; i <= no_of_subjects; i++) {
            System.out.print("enter the marks in the particular subject" + i + ": ");
            float marks = input.nextInt();
            total+= marks;
        }

        float average=  total / no_of_subjects;

        char grade;
        if(average>=90){
            grade='A';
        }else if(average>=80 && average<90){
            grade='B';
        }else if(average>=65 && average<80){
            grade='C';
        }else if(average>=50&& average<65){
            grade='D';
        }else if(average>=35 && average<50){
            grade='E';
        }
        else{
            grade='F';
        }

        System.out.println("\nTotal Marks obtained: " + total);
        System.out.println("Average Of the marks entered for particular student is: " + average);
        System.out.println("Grade: " + grade);
    }
}