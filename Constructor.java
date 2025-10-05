class Demo{
    public int iNo1;
    public int iNo2;

    public Demo()
    {
        System.out.println("Inside default constructor");
    }
    public Demo(int i ,int j)
    
    {
        System.out.println("Inside parametarized constructor");
    } 
}
 
 class Constructor {
    public static void main(String Arr[])
    {
           Demo dobj1 = new Demo();    //c++ Demo dobj1;

           Demo dobj2 = new Demo(11,21);

    }
    
}
