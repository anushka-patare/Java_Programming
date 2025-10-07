interface Demo
{
       int no = 11;

        void Display();
    
}
class Hello implements Demo
{
        
   public void Display()
         {
         System.out.println("Helo");
        }
}

class InterfaceDemo1
 {
      public static void main(String A[])
         {
              Hello hobj = new Hello();
          }
}
