

class Demo
{
    public int i;
    final public int j;
    
    public Demo(int A,int B)
    {
        this.i = A;
        this.j = B;
    }
}

class FinalData4
{
    public static void main(String A[])
    {
        Demo dobj = new Demo(11,21);
        System.out.println(dobj.i);            //System is a class which is final
        System.out.println(dobj.j); 
        dobj.i++;
        //dobj.j++;  //Error

    }    
}