abstract class Base
{
   public int i,j;
   public int addition(int A,int B)
   {
    return A + B;
   }

    abstract public int Subtraction(int A,int B);

}

class Derived extends Base   //Error
{
           
}

class AbstractDemo2
{
    public static void main(String A[])
    {
      
        Base bp = new Base();          //Error

       
    }
}

