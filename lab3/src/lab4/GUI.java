package lab4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.LinkedList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class GUI implements ActionListener
{
	String string;
	int lengthofStudents = 0;
	int lengthofGroups = 0;
	int correctStrings = 0;
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextArea infoarea = new JTextArea(5,35);
	JTextArea textarea = new JTextArea(12,35);
	
	JButton addstudent = new JButton("Add student");
	JButton addgroup = new JButton("Add group");
	JButton addenrolment = new JButton("Enrol student");
	JButton showstudent = new JButton("Students list");
	JButton showgroup = new JButton("Groups list");
	JButton showenrolment = new JButton("Enrolments list");
	JButton clrscr = new JButton("Clear screen");
	
	LinkedList Students = new LinkedList();
	LinkedList Groups = new LinkedList();
	LinkedList Enrolments = new LinkedList();
	
	public GUI()
	{
		frame.setSize(450, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("GUI");
		frame.add(panel);
		
		panel.setBackground(Color.LIGHT_GRAY);
		Border border = BorderFactory.createLineBorder(Color.BLACK,1);
		panel.setBorder(border);
		
		panel.add(infoarea);
		infoarea.setBackground(Color.WHITE);
		Border textborder = BorderFactory.createLineBorder(Color.BLACK,1);
		infoarea.setBorder(textborder);
		Font font = new Font("arial",Font.BOLD, 12);
		infoarea.setFont(font);
		infoarea.setPreferredSize(new Dimension(5,35));
		infoarea.setLineWrap(true);
		
		panel.add(textarea);
		textarea.setBackground(Color.WHITE);
		Border textborder2 = BorderFactory.createLineBorder(Color.BLACK,1);
		textarea.setBorder(textborder2);
		Font font2 = new Font("arial",Font.BOLD, 12);
		textarea.setFont(font2);
		textarea.setPreferredSize(new Dimension(12,35));
		textarea.setLineWrap(true);
		
		addstudent.setPreferredSize(new Dimension(120, 30));
		addgroup.setPreferredSize(new Dimension(120, 30));
		addenrolment.setPreferredSize(new Dimension(120, 30));
		showstudent.setPreferredSize(new Dimension(120, 30));
		showgroup.setPreferredSize(new Dimension(120, 30));
		showenrolment.setPreferredSize(new Dimension(120, 30));
		clrscr.setPreferredSize(new Dimension(120, 30));
		
		panel.add(addstudent);
		panel.add(addgroup);
		panel.add(addenrolment);
		panel.add(showstudent);
		panel.add(showgroup);
		panel.add(showenrolment);
		panel.add(clrscr);
		
		addstudent.addActionListener(this);
		addgroup.addActionListener(this);
		addenrolment.addActionListener(this);
		showstudent.addActionListener(this);
		showgroup.addActionListener(this);
		showenrolment.addActionListener(this);
		clrscr.addActionListener(this);
		
	}


	public void actionPerformed(ActionEvent event) 
	{
		Object source = event.getSource();
		
		if(source == addstudent)
		{
			string = textarea.getText();
			textarea.setText("");
			Students.add(string);
			lengthofStudents++;
		}
		
		if(source == addgroup)
		{
			string = textarea.getText();
			textarea.setText("");
			Groups.add(string);
			lengthofGroups++;
		}
		
		if(source == addenrolment)
		{
			string = textarea.getText();
			textarea.setText("");
		
			for(int i=0; i < lengthofStudents; i++)
			{
			if(string.contains(Students.get(i).toString())) 
				{
					correctStrings++;
				} 
			}
			
			for(int j=0; j < lengthofGroups; j++)
			{
			if(string.contains(Groups.get(j).toString())) 
				{
					correctStrings++;
				} 
			}
			
			if(correctStrings>=2)
			{
				Enrolments.add(string);
			}
			else
			{
				textarea.setText("Wprowadzono b³êdne dane");
			}
		
			
		}
		
		if(source == showstudent)
		{
			textarea.append(Students.toString());
		}
		
		if(source == showgroup)
		{
			textarea.append(Groups.toString());
		}
		
		if(source == showenrolment)
		{
			textarea.append(Enrolments.toString());
		}
		
		if(source == clrscr)
		{
			textarea.setText("");
		}
		
		
	}
	
}
