import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {
    // object creation for Container
    private Container contentPane;

    // object creation for JLabel to label the data
    private JLabel signUpTitle, name, signUpEmail, gender, birthDay;
    private JLabel signUpPassword, signInTitle, signInEmail, signInPassword;

    // object creation for JTextField to get the data
    private JTextField nameField, signUpEmailField, signUpPasswordField;
    private JTextField signInEmailField, signInPasswordField;

    // object creation for JRadioButton to get the gender
    private JRadioButton male, female;

    // object creation for JButtonGroup for gender buttons
    private ButtonGroup genderButtonGroup;

    // object creation for JComboBox to get date
    private JComboBox day, month, year;

    // string list creation for days, months, and years
    private final String[] days = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    private final String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
    private final String[] years = {"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010"};

    // object creation for JCheckBox
    private JCheckBox confirmation;

    // object creation for JButton to sign up and sign in button
    private  JButton signUpButton, signInButton;

    // store user data's
    private String userEmail, userPassword;

    public GUI(){
        // customising the window
        setTitle("User page");
        setBounds(585,0,500,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        // customising the Container
        contentPane = getContentPane();
        contentPane.setLayout(null);
        contentPane.setBackground(Color.white);

        // add label for sign in title 
        signUpTitle = new JLabel("Sign Up");
        signUpTitle.setFont(new Font("Arial",Font.BOLD,30));
        signUpTitle.setBounds(200,20,200,40);
        signUpTitle.setForeground(Color.blue);
        contentPane.add(signUpTitle);

        // add label for name
        name = new JLabel("Name");
        name.setFont(new Font("Arial",Font.BOLD,25));
        name.setBounds(30,100,150,25);
        contentPane.add(name);

        // add text field for name
        nameField = new JTextField();
        nameField.setFont(new Font("Arial",Font.PLAIN,15));
        nameField.setBounds(200,100,270,30);
        contentPane.add(nameField);

        // add label for Email
        signUpEmail = new JLabel("Email");
        signUpEmail.setFont(new Font("Arial",Font.BOLD,25));
        signUpEmail.setBounds(30,150,150,30);
        contentPane.add(signUpEmail);

        // add text field for Email
        signUpEmailField = new JTextField();
        signUpEmailField.setFont(new Font("Arial",Font.PLAIN,15));
        signUpEmailField.setBounds(200,150,270,30);
        contentPane.add(signUpEmailField);

        // add label for gender
        gender = new JLabel("Gender");
        gender.setFont(new Font("Arial",Font.BOLD,25));
        gender.setBounds(30,200,150,30);
        contentPane.add(gender);

        // add radio for male 
        male = new JRadioButton("Male");
        male.setFont(new Font("Arial",Font.BOLD,25));
        male.setBounds(200,195,90,40);
        male.setBackground(Color.white);
        male.setSelected(true);
        contentPane.add(male);

        // add radio for female
        female = new JRadioButton("Female");
        female.setFont(new Font("Arial",Font.BOLD,25));
        female.setBounds(300,195,150,40);
        female.setBackground(Color.white);
        female.setSelected(false);
        contentPane.add(female);

        // group radio button for select one choice 
        genderButtonGroup = new ButtonGroup();
        genderButtonGroup.add(male);
        genderButtonGroup.add(female);

        // add label for birthday
        birthDay = new JLabel("Birthday");
        birthDay.setFont(new Font("Arial",Font.BOLD,25));
        birthDay.setBounds(30,250,150,30);
        contentPane.add(birthDay);

        // add combobox for day 
        day = new JComboBox(days);
        day.setFont(new Font("Arial",Font.BOLD,20));
        day.setBounds(200,250,50,30);
        day.setBackground(Color.white);
        contentPane.add(day);

        // add combobox for month
        month = new JComboBox(months);
        month.setFont(new Font("Arial",Font.BOLD,20));
        month.setBounds(255,250,120,30);
        month.setBackground(Color.white);
        contentPane.add(month);

        // add combobox for year
        year = new JComboBox(years);
        year.setFont(new Font("Arial",Font.BOLD,20));
        year.setBounds(380,250,90,30);
        year.setBackground(Color.white);
        contentPane.add(year);

        // add label for password
        signUpPassword = new JLabel("Password");
        signUpPassword.setFont(new Font("Arial",Font.BOLD,25));
        signUpPassword.setBounds(30,300,150,30);
        contentPane.add(signUpPassword);

        // add text field for password
        signUpPasswordField = new JTextField();
        signUpPasswordField.setFont(new Font("Arial",Font.PLAIN,15));
        signUpPasswordField.setBounds(200,300,270,30);
        contentPane.add(signUpPasswordField);

        // add check box for get confirmation 
        confirmation = new JCheckBox(" I am not robot.");
        confirmation.setFont(new Font("Arial",Font.PLAIN,20));
        confirmation.setBounds(30,350,200,30);
        confirmation.setBackground(Color.white);
        contentPane.add(confirmation);

        // add button for sign up 
        signUpButton = new JButton("Sign Up");
        signUpButton.setFont(new Font("Arial",Font.BOLD,25));
        signUpButton.setBounds(30,400,440,40);
        signUpButton.setForeground(Color.white);
        signUpButton.setBackground(Color.blue);
        signUpButton.addActionListener(this);
        contentPane.add(signUpButton);

        // add label for sign in title
        signInTitle = new JLabel("Sign In");
        signInTitle.setFont(new Font("Arial",Font.BOLD,30));
        signInTitle.setBounds(200,470,200,40);
        signInTitle.setForeground(Color.blue);
        contentPane.add(signInTitle);

        // add label for email
        signInEmail = new JLabel("Email");
        signInEmail.setFont(new Font("Arial",Font.BOLD,25));
        signInEmail.setBounds(30,550,150,30);
        contentPane.add(signInEmail);

        // add text field for email
        signInEmailField = new JTextField();
        signInEmailField.setFont(new Font("Arial",Font.PLAIN,15));
        signInEmailField.setBounds(200,550,270,30);
        contentPane.add(signInEmailField);

        // add label for password
        signInPassword = new JLabel("Password");
        signInPassword.setFont(new Font("Arial",Font.BOLD,25));
        signInPassword.setBounds(30,600,150,30);
        contentPane.add(signInPassword);

        // add text field for password
        signInPasswordField = new JTextField();
        signInPasswordField.setFont(new Font("Arial",Font.PLAIN,15));
        signInPasswordField.setBounds(200,600,270,30);
        contentPane.add(signInPasswordField);
        
        // add button for sign in
        signInButton = new JButton("Sign In");
        signInButton.setFont(new Font("Arial",Font.BOLD,25));
        signInButton.setBounds(30,660,440,40);
        signInButton.setForeground(Color.white);
        signInButton.setBackground(Color.blue);
        signInButton.addActionListener(this);
        contentPane.add(signInButton);

        // add for make JFrame visible 
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == signUpButton){
            // checking all text field are fill or not 
            if ((nameField.getText()).isEmpty() || (signUpEmailField.getText()).isEmpty() || (signUpPasswordField.getText()).isEmpty()) {
                JOptionPane.showMessageDialog(null, "Can't keep any field empty!");
            } else {
                // check the confirmation, human or not 
                if (confirmation.isSelected()) {
                    // declaration of email and password
                    userEmail = signUpEmailField.getText();
                    userPassword = signUpPasswordField.getText();

                    System.out.println("User Name \t\t: " + nameField.getText());
                    System.out.println("Email \t\t\t: "+ signUpEmailField.getText());
                    System.out.println("Gender \t\t\t: " + (male.isSelected() ? "Male" : "Female"));
                    System.out.println("Date of Birth \t: " + STR."\{day.getSelectedItem()}/ \{month.getSelectedIndex() + 1}/ \{year.getSelectedItem()}");
                    System.out.println("Password \t\t: " + signUpPasswordField.getText());

                    JOptionPane.showMessageDialog(rootPane, "Sign Up successful!");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Please confirm your not robot!");
                }
            }
        }
        if (actionEvent.getSource() == signInButton) {
            // verify the sign in data with sign up email and password
            if (signInEmailField.getText().equals((userEmail)) && signInPasswordField.getText().equals((userPassword))) {
                JOptionPane.showMessageDialog(rootPane, "Sign in successful!");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Sign in is unsuccessful!");
            }
        }
    }
    // main method for run the programe in the same class
    public static void main(String[] args) {
        GUI gui = new GUI();
    }
}
