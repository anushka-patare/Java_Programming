class Demo
{
    public int i;                      //Instance variable
    static public int j=21;            //Class variable

    static
    {
         System.out.println("Inside static block..");
         j=21;
    }

    public Demo()
    {
         System.out.println("Inside Constructor..");
         this.i = 11;  
    }

   
}

class Blocks
{
    public static void main(String A[])
    {

       System.out.println("Inside main..");  
       Demo dobj1 = new Demo();
       Demo dobj2 = new Demo();
       Demo dobj3 = new Demo();
 

       
       
    }
}