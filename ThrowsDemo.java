class Demo{
  public int Division(int iNo1,int iNo2) throws ArithmeticException
  {
             int Ans = 0;
             Ans  = iNo1 / iNo2;
             return Ans;
  }
}

class ThrowsDemo
{
    public static void main(String A[])
    {
           Demo obj = new Demo();
           int ret=0;

           try
           {
           ret =  obj.Division(11,0);
           }

           catch(ArithmeticException aobj)
           {
            System.out.println("Inside catch"+aobj);
           }

           System.out.println("Division is :"+ret);
    }
}
