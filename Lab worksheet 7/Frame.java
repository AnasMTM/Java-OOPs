import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Frame extends JFrame implements ActionListener {
    private Container container;

    private JLabel title;
    private JLabel name;
    private JTextField nameField;
    private JLabel mobile;
    private JTextField mobileField;
    private JLabel gender;
    private JRadioButton male;
    private JRadioButton female;
    private ButtonGroup genderGroup;
    private JLabel DoB;
    private JComboBox date;
    private JComboBox month;
    private JComboBox year;
    private JLabel address;
    private JTextArea addressArea;
    private JTextArea displayDatas;
    private JLabel status;
    private JTextArea addStatus;
    private JCheckBox term;
    private JButton submit;
    private JButton rest;

    private final String[] dates = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    private final String[] months = {"Jan","Fab","Mar","Apl","May","June","July","Arg","Sep","Nov","dec"};
    private final String[] years = {"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009"};

    private final String userName = "root", password = "root", url = "jdbc:mysql://localhost:3306/DB";
    private final String queryForInsert = "INSERT INTO Users (Name, Mobile, Gender, DOB, Address) VALUES (?, ?, ?, ?, ?)";

    public Frame(){
        setTitle("Registration Form");
        setBounds(400,150,1000,550);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        container = getContentPane();
        container.setLayout(null);

        title = new JLabel("Registration Form");
        title.setFont(new Font("Arial",Font.PLAIN,30));
        title.setBounds(350,30,300,30);
        container.add(title);

        name = new JLabel("Name");
        name.setFont(new Font("Arial",Font.PLAIN,20));
        name.setBounds(100,100,250,20);
        container.add(name);

        nameField = new JTextField();
        nameField.setFont(new Font("Arial",Font.PLAIN,15));
        nameField.setBounds(250,100,200,20);
        container.add(nameField);

        mobile = new JLabel("Mobile");
        mobile.setFont(new Font("Arial",Font.PLAIN,20));
        mobile.setBounds(100,150,250,20);
        container.add(mobile);

        mobileField = new JTextField();
        mobileField.setFont(new Font("Arial",Font.PLAIN,15));
        mobileField.setBounds(250,150,200,20);
        container.add(mobileField);

        gender = new JLabel("Gender");
        gender.setFont(new Font("Arial",Font.PLAIN,20));
        gender.setBounds(100,200,200,20);
        container.add(gender);

        male = new JRadioButton("Male");
        male.setFont(new Font("Arial",Font.PLAIN,15));
        male.setBounds(250,200,75,20);
        male.setSelected(true);
        container.add(male);

        female = new JRadioButton("Female");
        female.setFont(new Font("Arial",Font.PLAIN,15));
        female.setBounds(325,200,75,20);
        female.setSelected(true);
        container.add(female);

        genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        DoB = new JLabel("Date of Birth");
        DoB.setFont(new Font("Arial",Font.PLAIN,20));
        DoB.setBounds(100,250,200,20);
        container.add(DoB);

        date = new JComboBox(dates);
        date.setFont(new Font("Arial",Font.PLAIN,15));
        date.setBounds(250,250,50,20);
        container.add(date);

        month = new JComboBox(months);
        month.setFont(new Font("Arial",Font.PLAIN,15));
        month.setBounds(305,250,60,20);
        container.add(month);

        year = new JComboBox(years);
        year.setFont(new Font("Arial",Font.PLAIN,15));
        year.setBounds(370,250,80,20);
        container.add(year);

        address = new JLabel("Address");
        address.setFont(new Font("Arial",Font.PLAIN,20));
        address.setBounds(100,300,250,20);
        container.add(address);

        addressArea = new JTextArea();
        addressArea.setFont(new Font("Arial",Font.PLAIN,15));
        addressArea.setBounds(250,300,200,60);
        addressArea.setLineWrap(true);
        container.add(addressArea);

        term = new JCheckBox("Accept the term and condition.");
        term.setFont(new Font("Arial",Font.PLAIN,15));
        term.setBounds(160,380,300,20);
        container.add(term);

        submit = new JButton("Submit");
        submit.setFont(new Font("Arial",Font.PLAIN,15));
        submit.setBounds(150,420,100,20);
        submit.addActionListener(this);
        container.add(submit);

        rest = new JButton("Rest");
        rest.setFont(new Font("Arial",Font.PLAIN,15));
        rest.setBounds(300,420,100,20);
        rest.addActionListener(this);
        container.add(rest);

        displayDatas = new JTextArea();
        displayDatas.setFont(new Font("Arial",Font.PLAIN,20));
        displayDatas.setBounds(650,100,300,300);
        displayDatas.setLineWrap(true);
        displayDatas.setEditable(false);
        container.add(displayDatas);

        status = new JLabel("");
        status.setFont(new Font("Arial",Font.PLAIN,15));
        status.setBounds(120,450,400,20);
        container.add(status);

        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String localName = nameField.getText();
        String localMobileNumber = mobileField.getText();
        String localGender = male.isSelected() ? "Male" : "Female";
        String localDOB = date.getSelectedItem() + "/" + month.getSelectedItem() + "/" + year.getSelectedItem();
        String localAddress = addressArea.getText();

        if (actionEvent.getSource() == submit){
            if (term.isSelected()){
                String printData = "Name \t: %s\nMobile \t: %s\nGender \t: %s\nDoB \t: %s\nAddress \t: %s".formatted(localName, localMobileNumber, localGender, localDOB, localAddress);
                displayDatas.setText(printData);
                displayDatas.setEditable(false);

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    try {
                        Connection connection = DriverManager.getConnection(url,userName,password);
                        PreparedStatement preparedStatement = connection.prepareStatement(queryForInsert);
                        preparedStatement.setString(1, localName);
                        preparedStatement.setString(2, localMobileNumber);
                        preparedStatement.setString(3, localGender);
                        preparedStatement.setString(4, localDOB);
                        preparedStatement.setString(5, localAddress);
                        preparedStatement.executeUpdate();

                        connection.close();
                    } catch (SQLException exception) {
                        JOptionPane.showMessageDialog(rootPane,"Connection error while update data !");
                    }
                }catch (ClassNotFoundException exception){
                    JOptionPane.showMessageDialog(rootPane, "An error occupied in system !");
                }
                
                status.setText("Registration success.");
            }else {
                status.setText("Please accept the term and conditions");
            }
        }else if (actionEvent.getSource() == rest){
            String def = "";
            nameField.setText(def);
            mobileField.setText(def);
            addressArea.setText(def);
            displayDatas.setText(def);
            status.setText(def);
            term.setSelected(false);
            date.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
            status.setText(def);
        }
    }
    public static void main(String[] args) {
        Frame frame = new Frame();
    }
}
