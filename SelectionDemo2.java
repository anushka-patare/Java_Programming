
import java.util.Scanner;  //Scanner is class
class SelectionDemo2
{
    public static void main(String A[])
    {
         Scanner sobj = new Scanner(System.in);
         int iStd = 0;

         System.out.println("Enter your standard:");
         iStd = sobj.nextInt();

         if(iStd == 1)
         {
            System.out.println("Exam at 9 AM");
         }
         else if(iStd == 2)
         {
            System.out.println("Exam at 10 AM");
         }
          else if(iStd == 3)
         {
            System.out.println("Exam at 11 AM");
         }
          else if(iStd == 2)
         {
            System.out.println("Exam at 10 NOON");
         }
         else
         {
            System.out.println("Invalid standard");
         }

    }
    
}