class Hello
{
    public int i;
     public Hello(int no)
     {
          System.out.println("Ibnside parametarized hello constructor");
          this.i = no+1;
     }
    public void Display()
    {   
        System.out.println("Inside hello display ");
    }
}

class Demo extends Hello
{
    public int i;

    public Demo(int A)
    {
        super(A);    //First use
        this.i = A; 
        System.out.println("Inside demo constructor ");
    }
    
    public void Display()
    {   
        int i = 0;
        System.out.println("Inside display "+i);
        System.out.println("Inside display "+this.i); 
        System.out.println("Inside display "+super.i);            ///Second use
        super.Display();                 //Third use
    }
}

class SuperDemo 
{
    public static void main(String A[])
    {
           Demo dobj = new Demo(51);  
           dobj.Display();
    }
}
