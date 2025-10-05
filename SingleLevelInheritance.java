class Base
{
    public int i,j;   //8
    public void fun()
    {
        System.out.println("Inside base fun");
    }
}

class Derived extends Base   //12
{
    public int x;
    
    public void gun()
    {
        System.out.println("Inside derived gun");
    }
}

class SingleLevelInheritance
{
    public static void main(String a[])
    {
        Base bobj = new Base();
        Derived dobj = new Derived();
         
        bobj.fun();

        dobj.fun();
        dobj.gun();
    }
}
