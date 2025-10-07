class Demo
{
    public int i;
    public static int j;

    static
    {
           j = 21;
    }
    public Demo()
    {
        this.i = 11;  //First use
        System.out.println("Inside default ");

    }
    public Demo(int A)
    {
        this();   //Calling self class default construtor     Second use
        System.out.println("Inside parametarized ");
    
    }
    public void Display()
    {
        
        System.out.println("Inside display"+this.i);     //Third use
    }
}

class ThisDemo 
{
    public static void main(String A[])
    {
           Demo dobj = new Demo(51);
           dobj.Display();
    }
}
