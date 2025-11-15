import javax.swing.*;
import java.awt.event.*;

class MarvellousLogin implements ActionListener
{
    // Characteristics

    JFrame fobj;
    JButton bobj1,bobj2,bobj3,bobj4;
    JTextField tobj1,tobj2;
    JLabel Number1label,Number2label,Resultlabel;


    public MarvellousLogin(String title,int width,int height)
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

        bobj1 = new JButton("+");
        bobj1.setBounds(120,150,80,30);

        bobj2 = new JButton("-");
        bobj2.setBounds(220,150,80,30);

        bobj3 = new JButton("*");
        bobj3.setBounds(320,150,80,30);

        bobj4 = new JButton("/");
        bobj4.setBounds(420,150,80,30);

        Resultlabel = new JLabel("Result: ");
        Resultlabel.setBounds(150,200,250,30);

        fobj.add(bobj1);
        fobj.add(bobj2);
        fobj.add(bobj3);
        fobj.add(bobj4);
        fobj.add(tobj1);
        fobj.add(tobj2);
        fobj.add(Number1label);
        fobj.add(Number2label);
        fobj.add(Resultlabel);

        bobj1.addActionListener(this);
        bobj2.addActionListener(this);
        bobj3.addActionListener(this);
        bobj4.addActionListener(this);

        fobj.setSize(width,height);
        fobj.setLayout(null);
        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

        public void actionPerformed(ActionEvent aobj)
    {
        String iNo1  = tobj1.getText();
        String iNo2  = tobj2.getText();

        float no1 = Float.parseFloat(iNo1);
        float no2 = Float.parseFloat(iNo2);
       
        String command = aobj.getActionCommand();

        if(command.equals("+"))
        {
            Resultlabel.setText("Result :" +(no1 + no2));
        }

        else if(command.equals("-"))
        {
             Resultlabel.setText("Result :" +(no1 - no2));
        }
        
        else if(command.equals("*"))
        {
             Resultlabel.setText("Result :" +(no1 * no2));
        }

         else if(command.equals("/"))
        {
             Resultlabel.setText("Result :" +(no1 / no2));
        }  
        else
        {
            Resultlabel.setText("Invalid operation");
        }
    }

    }

class CalculatorFrame
{
    public static void main(String args[])
    {
        MarvellousLogin mobj = new MarvellousLogin("Calculator",800,800);
    }
}
