import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm extends JFrame implements ActionListener {

    private final String[] dates = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    private final String[] months = {"Jan","Fab","Mar","Apl","May","June","July","Arg","Sep","Nov","dec"};
    private final String[] years = {"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009"};
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
    private JTextArea tout;
    private JLabel status;
    private JTextArea addStatus;
    private JCheckBox term;
    private JButton submit;
    private JButton rest;

    public RegistrationForm(){
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

        tout = new JTextArea();
        tout.setFont(new Font("Arial",Font.PLAIN,20));
        tout.setBounds(650,100,300,300);
        tout.setLineWrap(true);
        tout.setEditable(false);
        container.add(tout);

        status = new JLabel("");
        status.setFont(new Font("Arial",Font.PLAIN,15));
        status.setBounds(120,450,400,20);
        container.add(status);

        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == submit){
            if (term.isSelected()){
                String data1 = "Name \t: " + nameField.getText() + "\n" + "Mobile \t: " + mobileField.getText() + "\n";
                String data2;
                if (male.isSelected()) data2 = "Gender \t: Male" + "\n";
                else data2 = "Gender \t: Female" + "\n";
                String data3 = "DoB \t: " + date.getSelectedItem() + "/" + month.getSelectedItem() + "/" + year.getSelectedItem() + "\n";
                String data4 = "Address \t: " + addressArea.getText() + "\n";
                tout.setText(data1+data2+data3+data4);
                tout.setEditable(false);
                status.setText("Registration success.");
            }else {
                tout.setText("");
                status.setText("");
                status.setText("Please accept the term and conditions");
            }
        }else if (actionEvent.getSource() == rest){
            String def = "";
            nameField.setText(def);
            mobileField.setText(def);
            addressArea.setText(def);
            tout.setText(def);
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
