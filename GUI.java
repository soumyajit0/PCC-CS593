import javax.swing.*;
import java.util.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI {
    public static void main(String[] args)
    {
        new Frame("Admission Count");
    }
}

class Frame implements ActionListener
{
    JLabel cse,csbs,result;
    JTextField cseCount,csbsCount;
    JButton b;
    Frame(String s)
    {
        JFrame GUI=new JFrame(s);

        cse=new JLabel("Enter the no. of Students in CSE : ");
        cseCount=new JTextField(20);

        csbs=new JLabel("Enter the no. of Students in CSBS : ");
        csbsCount=new JTextField(20);

        b=new JButton("Submit");
        b.addActionListener(this);

        result=new JLabel();

        GUI.add(cse);
        GUI.add(cseCount);
        GUI.add(csbs);
        GUI.add(csbsCount);
        GUI.add(b);
        GUI.add(result);

        GUI.setLayout(new FlowLayout());
        GUI.setSize(500,500);
        GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUI.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
    {
        String f1,f2;
        int num1,num2,sum;
        f1=cseCount.getText();
        f2=csbsCount.getText();
        if (f1.isEmpty() || f2.isEmpty())
        {
            result.setText("Count(s) cannot be empty");
        }
        else
        {
            try
            {
                num1=Integer.parseInt(f1);
                num2=Integer.parseInt(f2);
                if (num1 < 0 || num2 < 0)
                {
                    result.setText("Count of Students cannot be negative");
                }
                else
                {
                    num1=Integer.parseInt(f1);
                    num2=Integer.parseInt(f2);
                    sum=num1+num2;
                    cseCount.setEditable(false);
                    csbsCount.setEditable(false);
                    result.setText("Total Students : "+sum);
                }
            }
            catch (Exception e)
            {
                result.setText("Counts should be in numbers");
            }
        }
    }
}