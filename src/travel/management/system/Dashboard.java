
package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard  extends JFrame implements ActionListener
{
    String username;
    JButton viewPersonalDetails, addPersonalDetails, updatePersonalDetails,checkPackages, bookPackages, viewPackages,viewhotels,destinations,bookhotels,viewBookedHotels,payments,calculator,notepad,about,deletePersonalDetails;
    Dashboard(String username)
    {
        
       this.username = username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0,0,1600,65);
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(5,0,70,70);
        p1.add(icon);
        
        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(80,10,300,40);
        heading.setForeground(Color.white);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        p1.add(heading);
        
         
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0,65,300,900);
        add(p2);
        
        addPersonalDetails = new JButton("Add Personal Details");
        addPersonalDetails.setBounds(0,0,300,50);
        addPersonalDetails.setBackground(new Color(0, 0, 102));
        addPersonalDetails.setForeground(Color.WHITE);
        addPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        addPersonalDetails.setMargin(new Insets(0,0,0,60));
        addPersonalDetails.addActionListener(this);
        p2.add(addPersonalDetails);
        
        updatePersonalDetails = new JButton("Update Personal Details");
        updatePersonalDetails.setBounds(0,50,300,50);
        updatePersonalDetails.setBackground(new Color(0, 0, 102));
        updatePersonalDetails.setForeground(Color.WHITE);
        updatePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        updatePersonalDetails.setMargin(new Insets(0,0,0,30));
        updatePersonalDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                 try{
                    new UpdateCustomer(username).setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        p2.add(updatePersonalDetails);
        
        
        
        deletePersonalDetails = new JButton("Delete Personal Details");
        deletePersonalDetails.setBounds(0,100,300,50);
        deletePersonalDetails.setBackground(new Color(0, 0, 102));
        deletePersonalDetails.setForeground(Color.WHITE);
        deletePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        deletePersonalDetails.setMargin(new Insets(0,0,0,40));
         deletePersonalDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new DeleteDetails(username).setVisible(true);
                }catch(Exception e ){}
            }
	});


        p2.add(deletePersonalDetails);
        
        viewPersonalDetails = new JButton("View Details");
        viewPersonalDetails.setBounds(0,150,300,50);
        viewPersonalDetails.setBackground(new Color(0, 0, 102));
        viewPersonalDetails.setForeground(Color.WHITE);
        viewPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewPersonalDetails.setMargin(new Insets(0,0,0,130));
        viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);
        
         checkPackages= new JButton("Check Package");
        checkPackages.setBounds(0,200,300,50);
        checkPackages.setBackground(new Color(0, 0, 102));
        checkPackages.setForeground(Color.WHITE);
        checkPackages.setFont(new Font("Tahoma",Font.PLAIN,20));
        checkPackages.setMargin(new Insets(0,0,0,110));
        checkPackages.addActionListener(this);
        p2.add(checkPackages);
        
        bookPackages= new JButton("Book Package");
        bookPackages.setBounds(0,250,300,50);
        bookPackages.setBackground(new Color(0, 0, 102));
        bookPackages.setForeground(Color.WHITE);
        bookPackages.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookPackages.setMargin(new Insets(0,0,0,120));
        bookPackages.addActionListener(this);
        p2.add(bookPackages);
        
        viewPackages= new JButton("View Package");
        viewPackages.setBounds(0,300,300,50);
        viewPackages.setBackground(new Color(0, 0, 102));
        viewPackages.setForeground(Color.WHITE);
        viewPackages.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewPackages.setMargin(new Insets(0,0,0,120));
        viewPackages.addActionListener(this);
        p2.add(viewPackages);
        
        viewhotels= new JButton("View Hotels");
        viewhotels.setBounds(0,350,300,50);
        viewhotels.setBackground(new Color(0, 0, 102));
        viewhotels.setForeground(Color.WHITE);
        viewhotels.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewhotels.setMargin(new Insets(0,0,0,135));
        viewhotels.addActionListener(this);
        p2.add(viewhotels);
        
        bookhotels= new JButton("Book Hotels");
        bookhotels.setBounds(0,400,300,50);
        bookhotels.setBackground(new Color(0, 0, 102));
        bookhotels.setForeground(Color.WHITE);
        bookhotels.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookhotels.setMargin(new Insets(0,0,0,135));
        bookhotels.addActionListener(this);
        p2.add(bookhotels);
        
        viewBookedHotels= new JButton(" View Booked Hotels");
        viewBookedHotels.setBounds(0,450,300,50);
        viewBookedHotels.setBackground(new Color(0, 0, 102));
        viewBookedHotels.setForeground(Color.WHITE);
        viewBookedHotels.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewBookedHotels.setMargin(new Insets(0,0,0,70));
        viewBookedHotels.addActionListener(this);
        p2.add(viewBookedHotels);
        
        destinations= new JButton("Destinations");
        destinations.setBounds(0,500,300,50);
        destinations.setBackground(new Color(0, 0, 102));
        destinations.setForeground(Color.WHITE);
        destinations.setFont(new Font("Tahoma",Font.PLAIN,20));
        destinations.setMargin(new Insets(0,0,0,130));
        destinations.addActionListener(this);
        p2.add(destinations);
        
         payments= new JButton("Payments");
        payments.setBounds(0,550,300,50);
        payments.setBackground(new Color(0, 0, 102));
        payments.setForeground(Color.WHITE);
        payments.setFont(new Font("Tahoma",Font.PLAIN,20));
        payments.setMargin(new Insets(0,0,0,155));
        payments.addActionListener(this);
        p2.add(payments);
        
        calculator= new JButton("Calculator");
        calculator.setBounds(0,600,300,50);
        calculator.setBackground(new Color(0, 0, 102));
        calculator.setForeground(Color.WHITE);
        calculator.setFont(new Font("Tahoma",Font.PLAIN,20));
        calculator.setMargin(new Insets(0,0,0,145));
        calculator.addActionListener(this);
        p2.add(calculator);
        
        notepad= new JButton("Notepad");
        notepad.setBounds(0,650,300,50);
        notepad.setBackground(new Color(0, 0, 102));
        notepad.setForeground(Color.WHITE);
        notepad.setFont(new Font("Tahoma",Font.PLAIN,20));
        notepad.setMargin(new Insets(0,0,0,155));
        notepad.addActionListener(this);
        p2.add(notepad);
        
        
        about= new JButton("About");
        about.setBounds(0,700,300,50);
        about.setBackground(new Color(0, 0, 102));
        about.setForeground(Color.WHITE);
        about.setFont(new Font("Tahoma",Font.PLAIN,20));
        about.setMargin(new Insets(0,0,0,175));
        about.addActionListener(this);
        p2.add(about);
        
        
         ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(0,0,1650,1000);
        add(image);
        
        JLabel text = new JLabel("Travel and Tourism Management System");
        text.setBounds(400, 70, 1200, 70);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway", Font.PLAIN, 55));
        image.add(text);
        
        
       setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()== addPersonalDetails)
        {
            new AddCustomer(username);
        }else if(ae.getSource()==viewPersonalDetails)
        {
            new ViewCustomer(username);
        }
        else if(ae.getSource()==updatePersonalDetails)
        {
            new UpdateCustomer(username);
        }
        else if(ae.getSource()== checkPackages)
        {
            new CheckPackage();
        }
        else if(ae.getSource()==bookPackages)
        {
            new BookPackage(username);
        }else if(ae.getSource()==viewPackages)
        {
            new ViewPackage(username);
        }else if(ae.getSource()== viewhotels)
        {
            new CheckHotels();
        }else if(ae.getSource()==destinations)
        {
            new Destinations();
        }else if(ae.getSource()==bookhotels)
                {
                    new BookHotels(username);
                }
        else if(ae.getSource()==viewBookedHotels)
        {
            new ViewBookedHotel(username);
        }
        else if(ae.getSource()== payments)
        {
            new Payment();
        }else if(ae.getSource()== calculator)
        {
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }else if(ae.getSource()== notepad)
        {
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e)
            {
                e.printStackTrace();
            }
      }else if(ae.getSource()==about)
      {
          new About();
      }else if(ae.getSource()==deletePersonalDetails)
      {
          new DeleteDetails(username);
      }
    }
  public static void main(String[]args)
  {
      new Dashboard("");
  }
}
