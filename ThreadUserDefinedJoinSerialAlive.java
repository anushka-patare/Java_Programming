class Demo extends Thread
{
    public void run()
    {
        System.out.println("Inside run method of :"+Thread.currentThread().getName());
    }
}
class ThreadUserDefinedSerialAlive
{
    public static void main(String A[]) 
    {
        System.out.println("Inside main Thread");
        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();

        dobj1.setName("First");
        dobj2.setName("Second");
       try
         {
                dobj1.start();
                dobj1.join();
                System.out.println("End of first thread");
              
                System.out.println("Is first thread alive ? :"+dobj1.isAlive());

                dobj2.start();
                dobj2.join();
                System.out.println("End of second thread.");
                System.out.println("Is first thread alive ? :"+dobj1.isAlive());

        }

        catch( InterruptedException iobj)
        {
            
        }
        System.out.println("End of main thread.");
    }
}
