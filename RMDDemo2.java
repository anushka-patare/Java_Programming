
class Base
{
    public int i,j;
    public void fun()
    {
        System.out.println("Inside base fun");
    }
    
     public void gun()
    {
        System.out.println("Inside base gun");
    }

     public void sun()
    {
        System.out.println("Inside base sun");
    }

     public void bun()
    {
        System.out.println("Inside base bun");
    }

}

class Derived extends Base
{
       public int x;
       public void gun()
        {
         System.out.println("Inside derived gun");
        }

        public void sun()
        {
         System.out.println("Inside derived sun");
        }

        public void run()
        {
         System.out.println("Inside derived run");
        }

        public void mun()
        {
         System.out.println("Inside derived mun");
        }
}

class RMDDemo2
{
    public static void main(String A[])
    {
      
        Base bp2 = new Derived();          //Upcasting

        bp2.fun();           //Base fun
        bp2.gun();           //Derived gun
        bp2.sun();           //Derived sun
       // bp2.run();           //Error
        //bp2.mun();           //Error
        bp2.bun();          //  Base bun

    }
}
