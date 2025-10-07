interface A
{
    int no = 11;      ///public ststic final characteristics
    void fun();       //public abstract
 
    private void Display()
    {
        System.out.println("Inside private display"); 
    }

    default void gun()
    {
        System.out.println("Inside gun..");
          Display();
    }
    
}
class Demo implements A                               //Multiple inheritance
{
        public void fun()
        {
          System.out.println("Inside fun...");   
        }
       
}
class InterfaceDemo9
 {
      public static void main(String A[])
         {
               Demo dobj = new Demo();
               dobj.fun();
               dobj.gun();
             ///  dobj.Display();      error
          }
}
