import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {
    // object creation for Container
    private final Container contentPane;

    // object creation for JLabel to label the data
    private final JLabel signUpTitleLabel, nameLabel, signUpEmailLabel, genderLabel, birthDayLabel, signUpPasswordLabel, signInTitleLabel, signInEmailLabel, signInPasswordLabel;

    // object creation for JTextField to get the data
    private final JTextField nameTextField, signUpEmailTextField, signInEmailTextField;

    // object creation for JPasswordField to get the data
    private final JPasswordField signInPasswordField,  signUpPasswordField;

    // object creation for JRadioButton to get the gender
    private final JRadioButton maleRadioButton, femaleRadioButton;

    // object creation for JButtonGroup for gender buttons
    private final ButtonGroup genderButtonGroup;

    // object creation for JComboBox to get date
    private final JComboBox<String> dayComboBox, monthComboBox, yearComboBox;

    // string list creation for days, months, and years
    private final String[] dayList = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    private final String[] monthList = {"January","February","March","April","May","June","July","August","September","October","November","December"};
    private final String[] yearList = {"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010"};

    // object creation for JCheckBox
    private final JCheckBox confirmationCheckBox;

    // object creation for JButton to sign up and sign in button
    private final JButton signUpButton, signInButton;

    //database connections details
    private final String userName = "root", password = "root123", url = "jdbc:mysql://localhost:3306/UserDetails";
    private final String queryForInsert = "INSERT INTO Users (Name, Email, Gender, DOB, password) VALUES (?, ?, ?, ?, ?)";
    private final String queryForSelect = "SELECT Email, Password FROM Users WHERE Email = ? AND Password = ?";

    public GUI(){
        // customize JFrame
        setTitle("User page");
        setBounds(585,0,500,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        // customize container
        contentPane = getContentPane();
        contentPane.setLayout(null);
        contentPane.setBackground(Color.white);

        // alignment and modifications for label, text field, radio button, combo box, password field, check box, and button

        signUpTitleLabel = new JLabel("Sign Up");
        signUpTitleLabel.setFont(new Font("Arial",Font.BOLD,30));
        signUpTitleLabel.setBounds(200,20,200,40);
        signUpTitleLabel.setForeground(Color.blue);
        contentPane.add(signUpTitleLabel);

        nameLabel = new JLabel("Name");
        nameLabel.setFont(new Font("Arial",Font.BOLD,25));
        nameLabel.setBounds(30,100,150,25);
        contentPane.add(nameLabel);

        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Arial",Font.PLAIN,15));
        nameTextField.setBounds(200,100,270,30);
        contentPane.add(nameTextField);

        signUpEmailLabel = new JLabel("Email");
        signUpEmailLabel.setFont(new Font("Arial",Font.BOLD,25));
        signUpEmailLabel.setBounds(30,150,150,30);
        contentPane.add(signUpEmailLabel);

        signUpEmailTextField = new JTextField();
        signUpEmailTextField.setFont(new Font("Arial",Font.PLAIN,15));
        signUpEmailTextField.setBounds(200,150,270,30);
        contentPane.add(signUpEmailTextField);

        genderLabel = new JLabel("Gender");
        genderLabel.setFont(new Font("Arial",Font.BOLD,25));
        genderLabel.setBounds(30,200,150,30);
        contentPane.add(genderLabel);

        maleRadioButton = new JRadioButton("Male");
        maleRadioButton.setFont(new Font("Arial",Font.BOLD,25));
        maleRadioButton.setBounds(200,195,90,40);
        maleRadioButton.setBackground(Color.white);
        maleRadioButton.setSelected(true);
        contentPane.add(maleRadioButton);

        femaleRadioButton = new JRadioButton("Female");
        femaleRadioButton.setFont(new Font("Arial",Font.BOLD,25));
        femaleRadioButton.setBounds(300,195,150,40);
        femaleRadioButton.setBackground(Color.white);
        femaleRadioButton.setSelected(false);
        contentPane.add(femaleRadioButton);

        genderButtonGroup = new ButtonGroup();
        genderButtonGroup.add(maleRadioButton);
        genderButtonGroup.add(femaleRadioButton);

        birthDayLabel = new JLabel("Birthday");
        birthDayLabel.setFont(new Font("Arial",Font.BOLD,25));
        birthDayLabel.setBounds(30,250,150,30);
        contentPane.add(birthDayLabel);

        dayComboBox = new JComboBox<>(dayList);
        dayComboBox.setFont(new Font("Arial",Font.BOLD,20));
        dayComboBox.setBounds(200,250,50,30);
        dayComboBox.setBackground(Color.white);
        contentPane.add(dayComboBox);

        monthComboBox = new JComboBox<>(monthList);
        monthComboBox.setFont(new Font("Arial",Font.BOLD,20));
        monthComboBox.setBounds(255,250,120,30);
        monthComboBox.setBackground(Color.white);
        contentPane.add(monthComboBox);

        yearComboBox = new JComboBox<>(yearList);
        yearComboBox.setFont(new Font("Arial",Font.BOLD,20));
        yearComboBox.setBounds(380,250,90,30);
        yearComboBox.setBackground(Color.white);
        contentPane.add(yearComboBox);

        signUpPasswordLabel = new JLabel("Password");
        signUpPasswordLabel.setFont(new Font("Arial",Font.BOLD,25));
        signUpPasswordLabel.setBounds(30,300,150,30);
        contentPane.add(signUpPasswordLabel);

        signUpPasswordField = new JPasswordField();
        signUpPasswordField.setFont(new Font("Arial",Font.PLAIN,15));
        signUpPasswordField.setBounds(200,300,270,30);
        contentPane.add(signUpPasswordField);

        confirmationCheckBox = new JCheckBox(" I am not robot.");
        confirmationCheckBox.setFont(new Font("Arial",Font.PLAIN,20));
        confirmationCheckBox.setBounds(30,350,200,30);
        confirmationCheckBox.setBackground(Color.white);
        contentPane.add(confirmationCheckBox);

        signUpButton = new JButton("Sign Up");
        signUpButton.setFont(new Font("Arial",Font.BOLD,25));
        signUpButton.setBounds(30,400,440,40);
        signUpButton.setForeground(Color.white);
        signUpButton.setBackground(Color.blue);
        signUpButton.addActionListener(this);
        contentPane.add(signUpButton);

        signInTitleLabel = new JLabel("Sign In");
        signInTitleLabel.setFont(new Font("Arial",Font.BOLD,30));
        signInTitleLabel.setBounds(200,470,200,40);
        signInTitleLabel.setForeground(Color.blue);
        contentPane.add(signInTitleLabel);

        signInEmailLabel = new JLabel("Email");
        signInEmailLabel.setFont(new Font("Arial",Font.BOLD,25));
        signInEmailLabel.setBounds(30,550,150,30);
        contentPane.add(signInEmailLabel);

        signInEmailTextField = new JTextField();
        signInEmailTextField.setFont(new Font("Arial",Font.PLAIN,15));
        signInEmailTextField.setBounds(200,550,270,30);
        contentPane.add(signInEmailTextField);

        signInPasswordLabel = new JLabel("Password");
        signInPasswordLabel.setFont(new Font("Arial",Font.BOLD,25));
        signInPasswordLabel.setBounds(30,600,150,30);
        contentPane.add(signInPasswordLabel);

        signInPasswordField = new JPasswordField();
        signInPasswordField.setFont(new Font("Arial",Font.PLAIN,15));
        signInPasswordField.setBounds(200,600,270,30);
        contentPane.add(signInPasswordField);

        signInButton = new JButton("Sign In");
        signInButton.setFont(new Font("Arial",Font.BOLD,25));
        signInButton.setBounds(30,660,440,40);
        signInButton.setForeground(Color.white);
        signInButton.setBackground(Color.blue);
        signInButton.addActionListener(this);
        contentPane.add(signInButton);

        // make JFrame visible
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        // when sign up button click
        if (actionEvent.getSource() == signUpButton){
            // check fields are fill or not
            if ((nameTextField.getText()).isEmpty() || (signUpEmailTextField.getText()).isEmpty() || signUpPasswordField.getPassword().length == 0) {
                JOptionPane.showMessageDialog(rootPane, "Can't keep any field empty !");
            } else {
                // check robot or not
                if (confirmationCheckBox.isSelected()) {
                    String localName = nameTextField.getText();
                    String localEmail = signUpEmailTextField.getText();
                    String localGender = maleRadioButton.isSelected() ? "Male" : "Female";
                    String localDOB = dayComboBox.getSelectedItem() + "/" + monthComboBox.getSelectedItem() + "/" + yearComboBox.getSelectedItem();
                    char[] localPasswordChar = signUpPasswordField.getPassword();
                    String localPassword = new String(localPasswordChar);

                    // check JDBC .jar file
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        // make JDBC and insert data's
                        try {
                            Connection connection = DriverManager.getConnection(url, userName, password);
                            PreparedStatement prepareStatement = connection.prepareStatement(queryForInsert);
                            prepareStatement.setString(1, localName);
                            prepareStatement.setString(2, localEmail);
                            prepareStatement.setString(3, localGender);
                            prepareStatement.setString(4, localDOB);
                            prepareStatement.setString(5, localPassword);
                            prepareStatement.executeUpdate();

                            connection.close();

                            JOptionPane.showMessageDialog(rootPane, "Sign-in is successful !");
                        } catch (SQLException exception) {
                            JOptionPane.showMessageDialog(rootPane, "An error occurred while processing your request. Please try again !");
                        }
                    }catch (ClassNotFoundException exception){
                        JOptionPane.showMessageDialog(rootPane, "An error occurred while processing. Please try again !");
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Please confirm your not robot !");
                }
            }
        }
        // when sign in button click
        if (actionEvent.getSource() == signInButton) {
            // check fields are fill or not
            if (signInEmailTextField.getText().isEmpty() || signInPasswordField.getPassword().length == 0) {
                JOptionPane.showMessageDialog(rootPane, "Can't keep any field empty !");
            }else {
                String localEmail = signInEmailTextField.getText();
                char[] localPasswordChar = signInPasswordField.getPassword();
                String localPassword = new String(localPasswordChar);

                // check JDBC .jar file
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    // make JDBC and select Email and Password
                    try (Connection connection = DriverManager.getConnection(url,userName,password)) {
                        PreparedStatement prepareStatement = connection.prepareStatement(queryForSelect);
                        prepareStatement.setString(1,localEmail);
                        prepareStatement.setString(2,localPassword);
                        ResultSet resultSet = prepareStatement.executeQuery();

                        // if database table has same Email and Password in same row then result.next() will be true, if not result.next() will false.
                        if (resultSet.next()) {
                            connection.close();
                            JOptionPane.showMessageDialog(rootPane, "Sign-up is successful !");
                        } else {
                            connection.close();
                            JOptionPane.showMessageDialog(rootPane, "Sign-up is unsuccessful !");
                        }
                    } catch (SQLException exception) {
                        JOptionPane.showMessageDialog(rootPane, "An error occurred while processing your request. Please try again !");
                    }
                }catch (ClassNotFoundException exception){
                    JOptionPane.showMessageDialog(rootPane, "An error occurred while processing. Please try again !");
                }
            }
        }
    }
    // main method for run the program
    public static void main(String[] args) {
        GUI gui = new GUI();
    }
}
