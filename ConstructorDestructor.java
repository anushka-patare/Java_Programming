class ConstructorDestructor
{
    ConstructorDestructor()
    {

    }
    public static void main(String A[] var0)
    {
        new Demo();
        new Demo(11,21);
        Object var1 = null;
        Object var2 = null;
        System.gc();
        System.out.println("End of main");

    }
}