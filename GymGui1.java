import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class GymGUI {
    private JFrame frame;
    private JLabel Heading;

     //initalize instance  for PremiumMember frame
     private JLabel memberId, memberName, memberLocation, memberPhone, memberEmail, Trainer, DateOfBirth, startDate, Gender;
     private JTextField memberIdField, memberNameField, memberLocationField, memberPhoneField, memberEmailField, TrainerField, DateOfBirthField, startDateField;
     private JCheckBox male, female, other;
     private JButton addMember;
     private JPanel panel1;

     //initializing instance for regularMember
    private JLabel memberId1, memberName1, memberLocation1, memberPhone1, memberEmail1,DateOfBirth1,startDate1,Referral,Gender1;
     private JTextField memberIdField1, memberNameField1, memberLocationField1, memberPhoneField1, memberEmailField1, DateOfBirthField1, startDateField1, ReferralField;
    private JCheckBox male1, female1, other1;
    private JButton addMember1;
    private JPanel panel2;

    //initializing instance for Pay Due Amount and Calculate Discount
    private JLabel memberId2, Amount;
    private JTextField memberIdField2, AmountField;
    private JButton PayDueAmount, CalculateDiscount;
    private JPanel panel3;

    //initializing instance for membershipManagement
    private JLabel memberId3;
    private JTextField memberIdField3;
    private JButton activate, deactivate;
    private JPanel panel4;

    //initialize instance for mark attendence and update plan
    private JLabel memberId4, plan;
    private JTextField memberIdField4, planField;
    private JButton markAttendence, updatePlan;
    private JPanel panel5;

    //initialize instance for revertMember
    private JLabel memberId5;
    private JTextField memberIdField5;
    private JButton revertMember;
    private JPanel panel6;

    //initializing instanxe for GymMembers
    private JButton displayMember,saveToFile,readFromFile,clear;



    // //initialize ArrayList 
    // private ArrayList<Gym> gymList = new ArrayList<Gym>();



    //constructor
    public GymGUI(){
        frame = new JFrame("Gym Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        //creating Object of JLabel for Heading
        Heading = new JLabel("Gym Management System");
        Heading.setBounds(800, 0, 450, 70);

        //creating object of JButton
        displayMember = new JButton("Display Member");
        displayMember.setBounds(220, 700, 170, 35);
        displayMember.setBackground(Color.CYAN);
        displayMember.setFont(new Font("Arial", Font.PLAIN, 15));

        saveToFile = new JButton("Save to File");
        saveToFile.setBounds(1500, 800, 170, 35);
        saveToFile.setBackground(Color.CYAN);
        saveToFile.setFont(new Font("Arial", Font.PLAIN, 15));


        readFromFile = new JButton("Read from File");
        readFromFile.setBounds(1500, 700, 170, 35);
        readFromFile.setBackground(Color.CYAN);
        readFromFile.setFont(new Font("Arial", Font.PLAIN, 15));


        clear = new JButton("Clear");
        clear.setBounds(220, 800, 170, 35);
        clear.setBackground(Color.CYAN);
        clear.setFont(new Font("Arial", Font.PLAIN, 15));


        //adding panel for premium member
        panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(150, 150, 400, 500);

        //adding panel for regular member
        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(1350, 150, 400, 500);

        //adding panel for pay due amount and calculate discount
        panel3 = new JPanel();
        panel3.setLayout(null);
        panel3.setBounds(700, 150, 500, 180);

        //adding panel for membership management
        panel4 = new JPanel();
        panel4.setLayout(null);
        panel4.setBounds(700, 350, 500, 140);

        //adding panel for mark attendence and update plan
        panel5 = new JPanel();
        panel5.setLayout(null);
        panel5.setBounds(700, 513, 500, 220);

        //adding panel for revertMember
        panel6 = new JPanel();
        panel6.setLayout(null);
        panel6.setBounds(700, 750, 500, 140);


        //creating Object of JLabel for PremiumMember
        memberId = new JLabel("Member ID : ");
        memberName = new JLabel("Member Name : ");
        memberLocation = new JLabel("Member Location : ");
        memberPhone = new JLabel("Member Phone : ");
        memberEmail = new JLabel("Member Email : ");
        Trainer = new JLabel("Trainer : ");
        DateOfBirth = new JLabel("Date of Birth : ");
        startDate = new JLabel("Start Date : ");   
        Gender = new JLabel("Gender : ");

        //creating Object of JLabel for RegularMember
        memberId1 = new JLabel("Member ID : ");
        memberName1 = new JLabel("Member Name : ");
        memberLocation1 = new JLabel("Member Location : ");
        memberPhone1 = new JLabel("Member Phone : ");
        memberEmail1 = new JLabel("Member Email : ");
        DateOfBirth1 = new JLabel("Date of Birth : ");
        startDate1 = new JLabel("Start Date : ");
        Referral = new JLabel("Referral : ");
        Gender1 = new JLabel("Gender : ");

        //creating Object of JLabel for Pay Due Amount and Calculate Discount
        memberId2 = new JLabel("Member ID : ");
        Amount = new JLabel("Amount : ");

        //creating Object of JLabel for membershipManagement
        memberId3 = new JLabel("Member ID : ");

        //creating Object of JLabel for mark attendence and update plan
        memberId4 = new JLabel("Member ID : ");
        plan = new JLabel("Plan : ");

        //creating Object of JLabel for revertMember
        memberId5 = new JLabel("Member ID : ");









        //attributes of JLabel for PremiumMember
        memberId.setBounds(25, 40, 170, 30);
        memberName.setBounds(25, 80, 170, 30);
        memberLocation.setBounds(25, 120, 170, 30);
        memberPhone.setBounds(25, 160, 170, 30);
        memberEmail.setBounds(25, 200, 170, 30);
        Trainer.setBounds(25, 240, 170, 30);
        DateOfBirth.setBounds(25, 280, 170, 30);
        startDate.setBounds(25, 320, 170, 30);
        Gender.setBounds(25, 360, 170, 30);

        //attributes of JLabel for RegularMember
        memberId1.setBounds(25, 40, 170, 30);
        memberName1.setBounds(25, 80, 170, 30);
        memberLocation1.setBounds(25, 120, 170, 30);
        memberPhone1.setBounds(25, 160, 170, 30);
        memberEmail1.setBounds(25, 200, 170, 30);
        DateOfBirth1.setBounds(25, 240, 170, 30);
        startDate1.setBounds(25, 280, 170, 30);
        Referral.setBounds(25, 320, 170, 30);
        Gender1.setBounds(25, 360, 170, 30);

        //attributes of JLabel for Pay Due Amount and Calculate Discount
        memberId2.setBounds(25, 40, 170, 30);
        Amount.setBounds(25, 80, 170, 30);

        //attributes of JLabel for membershipManagement
        memberId3.setBounds(25, 40, 170, 30);

        //attributes of JLabel for mark attendence and update plan
        memberId4.setBounds(25, 40, 170, 30);
        plan.setBounds(25, 80, 170, 30);

        //attributes of JLabel for revertMember
        memberId5.setBounds(25, 40, 170, 30);




        


        //creating object for JTextField for PremiumMember
        memberIdField = new JTextField();
        memberNameField = new JTextField();
        memberLocationField = new JTextField();
        memberPhoneField = new JTextField();
        memberEmailField = new JTextField();
        TrainerField = new JTextField();
        DateOfBirthField = new JTextField();
        startDateField = new JTextField();

        //creating object for JTextField for RegularMember
        memberIdField1 = new JTextField();
        memberNameField1 = new JTextField();
        memberLocationField1 = new JTextField();
        memberPhoneField1 = new JTextField();
        memberEmailField1 = new JTextField();
        DateOfBirthField1 = new JTextField();
        startDateField1 = new JTextField();
        ReferralField = new JTextField();

        //creating object for JTextField for Pay Due Amount and Calculate Discount
        memberIdField2 = new JTextField();
        AmountField = new JTextField();

        //creating object for JTextField for membershipManagement
        memberIdField3 = new JTextField();

        //creating object for JTextField for mark attendence and update plan
        memberIdField4 = new JTextField();
        planField = new JTextField();

        //creating object for JTextField for revertMember
        memberIdField5 = new JTextField();


        

        //attributes of JTextField for PremiumMember
        memberIdField.setBounds(170, 40, 200, 30);
        memberNameField.setBounds(170, 80, 200, 30);
        memberLocationField.setBounds(170, 120, 200, 30);
        memberPhoneField.setBounds(170, 160, 200, 30);
        memberEmailField.setBounds(170, 200, 200, 30);
        TrainerField.setBounds(170, 240, 200, 30);
        DateOfBirthField.setBounds(170, 280, 200, 30);
        startDateField.setBounds(170, 320, 200, 30);

        //attributes of JTextField for RegularMember
        memberIdField1.setBounds(170, 40, 200, 30);
        memberNameField1.setBounds(170, 80, 200, 30);
        memberLocationField1.setBounds(170, 120, 200, 30);
        memberPhoneField1.setBounds(170, 160, 200, 30);
        memberEmailField1.setBounds(170, 200, 200, 30);
        DateOfBirthField1.setBounds(170, 240, 200, 30);
        startDateField1.setBounds(170, 280, 200, 30);
        ReferralField.setBounds(170, 320, 200, 30);

        //attributes of JTextField for Pay Due Amount and Calculate Discount
        memberIdField2.setBounds(170, 40, 200, 30);
        AmountField.setBounds(170, 80, 200, 30);

        //attributes of JTextField for membershipManagement
        memberIdField3.setBounds(170, 40, 200, 30);

        //attributes of JTextField for mark attendence and update plan
        memberIdField4.setBounds(170, 40, 200, 30);
        planField.setBounds(170, 80, 200, 30);

        //attributes of JTextField for revertMember
        memberIdField5.setBounds(170, 40, 200, 30);





        //creating object of checkbox for premiumMember
        male = new JCheckBox("Male");
        female = new JCheckBox("Female");
        other = new JCheckBox("Other");
        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);
        group.add(other);

        //creating object of checkbox for regularMember
        male1 = new JCheckBox("Male");
        female1 = new JCheckBox("Female");
        other1 = new JCheckBox("Other");
        ButtonGroup group1 = new ButtonGroup();
        group1.add(male1);
        group1.add(female1);
        group1.add(other1);


        //attributes of checkbox for premiumMember
        male.setBounds(170, 360, 100, 30);
        female.setBounds(170, 400, 100, 30);
        other.setBounds(290, 360, 100, 30);

        //attributes of checkbox for regularMember
        male1.setBounds(170, 360, 100, 30);
        female1.setBounds(170, 400, 100, 30);
        other1.setBounds(290, 360, 100, 30);



        //creating object of combobox for retailer 
        String[] items = {"Basic", "Standard", "Premium"};
        JComboBox<String> plan = new JComboBox<String>(items);

        //attributes of combobox for retailer
        plan.setBounds(170, 80, 200, 30);

    
        //creating object for JButton for PremiumMember
        addMember = new JButton("Add Member");
        addMember.setBounds(110, 450, 150, 30);
        addMember.setBackground(Color.CYAN);
        addMember.setFont(new Font("Arial", Font.PLAIN, 15));

        //creating object for JButton for RegularMember
        addMember1 = new JButton("Add Member");
        addMember1.setBounds(110, 450, 150, 30);
        addMember1.setBackground(Color.CYAN);

        //creating object for JButton for Pay Due Amount and Calculate Discount
        PayDueAmount = new JButton("Pay Due Amount");
        PayDueAmount.setBounds(50, 130, 150, 30);
        PayDueAmount.setBackground(Color.CYAN);


        CalculateDiscount = new JButton("Calculate Discount");
        CalculateDiscount.setBounds(280, 130, 150, 30);
        CalculateDiscount.setBackground(Color.CYAN);

        //creating object for JButton for membershipManagement
        activate = new JButton("Activate");
        activate.setBounds(50, 95, 150, 30);
        activate.setBackground(Color.CYAN);
 
        deactivate = new JButton("Deactivate");
        deactivate.setBounds(280, 95, 150, 30);
        deactivate.setBackground(Color.CYAN);


        //creating object for JButton for mark attendence and update plan
        markAttendence = new JButton("Mark Attendence");
        markAttendence.setBounds(50, 150, 150, 30);
        markAttendence.setBackground(Color.CYAN);

        updatePlan = new JButton("Update Plan");
        updatePlan.setBounds(280, 150, 150, 30);
        updatePlan.setBackground(Color.CYAN);

        //creating object for JButton for revertMember
        revertMember = new JButton("Revert Member");
        revertMember.setBounds(180, 85, 150, 30);
        revertMember.setBackground(Color.CYAN);




        //changing font style for premium member
        Heading.setFont(new Font("Arial", Font.BOLD, 20));
        memberId.setFont(new Font("Arial", Font.PLAIN, 15));
        memberName.setFont(new Font("Arial", Font.PLAIN, 15));
        memberLocation.setFont(new Font("Arial", Font.PLAIN, 15));
        memberPhone.setFont(new Font("Arial", Font.PLAIN, 15));
        memberEmail.setFont(new Font("Arial", Font.PLAIN, 15));
        Trainer.setFont(new Font("Arial", Font.PLAIN, 15));
        DateOfBirth.setFont(new Font("Arial", Font.PLAIN, 15));
        startDate.setFont(new Font("Arial", Font.PLAIN, 15));
        Gender.setFont(new Font("Arial", Font.PLAIN, 15));

        //changing font style for regular member
        memberId1.setFont(new Font("Arial", Font.PLAIN, 15));
        memberName1.setFont(new Font("Arial", Font.PLAIN, 15));
        memberLocation1.setFont(new Font("Arial", Font.PLAIN, 15));
        memberPhone1.setFont(new Font("Arial", Font.PLAIN, 15));
        memberEmail1.setFont(new Font("Arial", Font.PLAIN, 15));
        DateOfBirth1.setFont(new Font("Arial", Font.PLAIN, 15));
        startDate1.setFont(new Font("Arial", Font.PLAIN, 15));
        Referral.setFont(new Font("Arial", Font.PLAIN, 15));
        Gender1.setFont(new Font("Arial", Font.PLAIN, 15));

        //changing font style for membership management
        memberId3.setFont(new Font("Arial", Font.PLAIN, 15));


        //changing font style for pay due amount and calculate discount
        memberId2.setFont(new Font("Arial", Font.PLAIN, 15));
        Amount.setFont(new Font("Arial", Font.PLAIN, 15));


        //changing font style for addMember button
        addMember.setFont(new Font("Arial", Font.BOLD, 15));

        //changing font style for addMember1 button
        addMember1.setFont(new Font("Arial", Font.BOLD, 15));

        //changing font style for PayDueAmount button and CalculateDiscount button
        PayDueAmount.setFont(new Font("Arial", Font.BOLD, 15));
        CalculateDiscount.setFont(new Font("Arial", Font.BOLD, 15));

        //changing font style for activate and deactivate button
        activate.setFont(new Font("Arial", Font.BOLD, 15));
        deactivate.setFont(new Font("Arial", Font.BOLD, 15));

        //changing font style for mark attendence and update plan button
        markAttendence.setFont(new Font("Arial", Font.BOLD, 15));
        updatePlan.setFont(new Font("Arial", Font.BOLD, 15));

        //changing font style for plan
        plan.setFont(new Font("Arial", Font.PLAIN, 15));
        memberId4.setFont(new Font("Arial", Font.PLAIN, 15));

        //changing font style for revertMember button
        revertMember.setFont(new Font("Arial", Font.BOLD, 15));
        memberId5.setFont(new Font("Arial", Font.PLAIN, 15));





        

        //set border for premium member panel
        panel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2),"Premium Member", 0, 0, new Font("Arial", Font.BOLD, 15), Color.BLUE));

        //set border for regular member panel
        panel2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2),"Regular Member", 0, 0, new Font("Arial", Font.BOLD, 15), Color.BLUE));

        //set border for pay due amount and calculate discount panel
        panel3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2),"Pay Due Amount and Calculate Discount", 0, 0, new Font("Arial", Font.BOLD, 15), Color.BLUE));

        //set border for membership management panel
        panel4.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(0,   0, 0), 2),"Membership Management", 0, 0, new Font("Arial", Font.BOLD, 15), Color.BLUE));

        //set border for mark attendence and update plan panel
        panel5.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(0,0, 0), 2), "Mark Attendence and Update Plan", 0, 0, new Font("Arial", Font.BOLD, 15), Color.BLUE));
        
        //set border for revertMember panel
        panel6.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(0,0, 0), 2), "Revert Member", 0, 0, new Font("Arial", Font.BOLD, 15), Color.BLUE));


        //background color for premium member panel
        panel1.setBackground(Color.LIGHT_GRAY);

        //background color for regular member panel
        panel2.setBackground(Color.LIGHT_GRAY);

        //background color for pay due amount and calculate discount panel
        panel3.setBackground(Color.LIGHT_GRAY);

        //background color for membership management panel
        panel4.setBackground(Color.LIGHT_GRAY);

        //background color for mark attendence and update plan panel
        panel5.setBackground(Color.LIGHT_GRAY);

        //background color for revertMember panel
        panel6.setBackground(Color.LIGHT_GRAY);

        //adding in frame of premium member 
        panel1.add(memberId);
        panel1.add(memberName);
        panel1.add(memberLocation);
        panel1.add(memberPhone);
        panel1.add(memberEmail);
        panel1.add(Trainer);
        panel1.add(DateOfBirth);
        panel1.add(startDate);
        panel1.add(Gender);
        panel1.add(addMember);
        panel1.add(Heading);
        frame.add(panel1);

        panel1.add(memberIdField);
        panel1.add(memberNameField);
        panel1.add(memberLocationField);
        panel1.add(memberPhoneField);
        panel1.add(memberEmailField);
        panel1.add(TrainerField);
        panel1.add(DateOfBirthField);
        panel1.add(startDateField);

        panel1.add(male);
        panel1.add(female);
        panel1.add(other);

        //adding in frame of regular member
        panel2.add(memberId1);
        panel2.add(memberName1);
        panel2.add(memberLocation1);
        panel2.add(memberPhone1);
        panel2.add(memberEmail1);
        panel2.add(DateOfBirth1);
        panel2.add(startDate1);
        panel2.add(Gender1);
        panel2.add(Referral);
        panel2.add(addMember1);
        frame.add(panel2);

        panel2.add(ReferralField);
        panel2.add(memberIdField1);
        panel2.add(memberNameField1);
        panel2.add(memberLocationField1);
        panel2.add(memberPhoneField1);
        panel2.add(memberEmailField1);
        panel2.add(DateOfBirthField1);
        panel2.add(startDateField1);

        panel2.add(male1);
        panel2.add(female1);
        panel2.add(other1);

        //adding in frame of pay due amount and calculate discount
        panel3.add(memberId2);
        panel3.add(Amount);

        panel3.add(PayDueAmount);
        panel3.add(CalculateDiscount);

        frame.add(panel3);

        panel3.add(memberIdField2);
        panel3.add(AmountField);

        //adding in frame of membership management
        panel4.add(memberId3);
        panel4.add(activate);
        panel4.add(deactivate);
        frame.add(panel4);
        panel4.add(memberIdField3);

        //adding in frame of mark attendence and update plan
        panel5.add(memberId4);
        panel5.add(plan);
        panel5.add(markAttendence);
        panel5.add(updatePlan);
        frame.add(panel5);
        panel5.add(memberIdField4);

        //adding in frame of revertMember
        panel6.add(memberId5);
        panel6.add(revertMember);
        frame.add(panel6);
        panel6.add(memberIdField5);

        //adding in frame of displayMember, saveToFile, readFromFile and clear
        frame.add(displayMember);
        frame.add(saveToFile);
        frame.add(readFromFile);
        frame.add(clear);


        //adding in frame
        frame.add(Heading);



        frame.setVisible(true);


    }

    //main method
    public static void main(String[] args) {
        GymGUI obj = new GymGUI();
    }
}
