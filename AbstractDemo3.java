
abstract class Base
{
   public int i,j;
   public int Addition(int A,int B)
   {
    return A + B;
   }

    abstract public int Subtraction(int A,int B);

}

class Derived extends Base   //Error
{
           public int Subtraction(int A,int B)
           {
            return A - B;
           }

           public int Multiplication(int A,int B)
           {
            return A * B;
           }
}

class AbstractDemo3
{
    public static void main(String A[])
    {
      
        Base bp = new Derived();   
        int iret = 0;
       
        iret  = bp.Addition(10,11);
        System.out.println(iret);
       
        iret = bp.Subtraction(11,10);
         System.out.println(iret);
       
       //  iret = bp.Multiplication(10,11);   
        // System.out.println(iret);    

       
    }
}

