import java.util.*;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.*;
import java.awt.event.*;
import javax.swing.*;

class MarvellousAddition implements ActionListener
{
    JFrame fobj;
    JButton bobj;
    JTextField tobj1,tobj2;
    JLabel Number1label,Number2label,Resultlabel;

      public MarvellousAddition(String title,int width,int height)
    {
        fobj = new JFrame(title);

        Number1label = new JLabel("Number1");
        Number1label.setBounds(50,50,100,30);
        
        tobj1 = new JTextField();
        tobj1.setBounds(150,50,150,30);

        Number2label = new JLabel("Number2");
        Number2label.setBounds(50,100,100,30);
        
        tobj2= new JTextField();
        tobj2.setBounds(150,100,150,30);

        bobj = new JButton("SUBMIT");
        bobj.setBounds(120,150,80,30);
    
        Resultlabel = new JLabel("");
        Resultlabel.setBounds(150,200,250,30);

        fobj.add(bobj);
        fobj.add(tobj1);
        fobj.add(tobj2);
        fobj.add(Number1label);
        fobj.add(Number2label);

        bobj.addActionListener(this);

        fobj.setSize(width,height);
        fobj.setLayout(null);
        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
        public void actionPerformed(ActionEvent aobj)
        {
            String iNo1  = tobj1.getText();
            String iNo2  = tobj2.getText();

            int no1 = Integer.parseInt(iNo1);
            int no2 = Integer.parseInt(iNo2);
            
            
            System.out.println("Client is running..");

            Socket sobj = new Socket("localhost",2100);
            System.out.println("Server successfully connected");
            
            DataInputStream diobj = new DataInputStream(sobj.getInputStream());
            DataOutputStream doobj = new DataOutputStream(sobj.getOutputStream());

            doobj.writeInt(no1);
            doobj.writeInt(no2);

            
            int sum = diobj.readInt();
           
            System.out.println("Addition is :"+sum);

            Resultlabel.setText("Result is:"+sum);

           

        }
}
class AdditionClient5 
{
     public static void main(String A[]) throws Exception
     {
        
       MarvellousAddition mobj = new MarvellousAddition("Addition",400,500);

     }
}
