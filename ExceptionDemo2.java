

import java.util.*;

class Exceptiondemo2 
{
     public static void main(String a[])
     {
         Scanner sobj = new Scanner(System.in);
         int iNo1 = 0, iNo2 = 0;
         float fAns = 0;

         System.out.println("Enter First number:");
         iNo1 = sobj.nextInt();

         System.out.println("Enter second number:");
         iNo2 = sobj.nextInt();

         fAns = (float)iNo1/(float)iNo2;
         System.out.println("Division is: "+fAns);
     }
}
