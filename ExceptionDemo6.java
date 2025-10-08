import java.util.*;

class Exceptiondemo6
{
     public static void main(String a[])
     {
         Scanner sobj = new Scanner(System.in);
         int iNo1 = 0, iNo2 = 0, iAns = 0;

         System.out.println("Enter First number:");
         iNo1 = sobj.nextInt();

         System.out.println("Enter second number:");
         iNo2 = sobj.nextInt();
        try
         {
              System.out.println("Inside try block");
              iAns = iNo1/iNo2;
         
         }
    
        catch(Exception eobj)                         //Generic catch
         {
               System.out.println("Inside generic catch");
         }

        catch(ArithmeticException aobj)                  //Specific catch
         {
              System.out.println("Inside catch block");
              System.out.println(aobj);
         }

         System.out.println("Division is: "+iAns);
     }
}
