 import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

//class
public class StoreGUI implements ActionListener {

    private JFrame frame;
    private JLabel Heading;

    //initalize instance  for department frame
    private JLabel storeId, storeName, storeLocation, totalSales, totalDiscount, productName, markedPrice, openingHour, sellingPrice;
    private JTextField storeIdfield, storeNamefield, storeLocationfield, totalSalesfield, totalDiscountfield, productNamefield, markedPricefield, openingHourfield, sellingPricefield;
    private JButton addDepartment,display1;
    private JPanel panel1;

    //initalize instance  for retailer frame
    private JLabel storeId1, storeName1, storeLocation1, openingHour1, totalSales1, totalDiscount1, vatInclusivePrice, purchasedYear, isPaymentOnline;
    private JTextField storeIdfield1, storeNamefield1, storeLocationfield1, openingHourfield1, totalSalesfield1, totalDiscountfield1, vatInclusivePricefield;
    private JCheckBox yes, no;
    private JButton addRetailer,display2;
    private JComboBox purchaseYear1;
    private JPanel panel2;

    //initalize instance  for removeProduct
    private JLabel storeId2;
    private JTextField storeIdfield2;
    private JButton removeProduct;
    private JPanel panel3;

    //initalize instance  for discountCalculation
    private JLabel storeId3, isInSales,markedPrice1;
    private JTextField storeIdfield3,markedPricefield1;
    private JCheckBox yes1, no1;
    private JButton calculateDiscountPrice;
    private JPanel panel4;

    //initalize instance  for loyaltyPointCalculation
    private JLabel storeId4, isPaymentOnline1,vatInclusivePrice1;
    private JTextField storeIdfield4,vatInclusivePriceField1;
    private JCheckBox yes2, no2;
    private JButton setLoyaltyPoint;
    private JPanel panel5;

    //instances  to display and clear all.
    private JButton display, clear;

    //initalize instance for buttonGroup
    private ButtonGroup group,group1,group2;

    //initialize ArrayList
    private ArrayList<Store> storeList = new ArrayList<Store>();

    //constructor
    public StoreGUI() {
        frame = new JFrame("Store");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        //adding panel for department
        panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(55, 60, 350, 460);

        //adding panel for retailer
        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(565, 60, 380, 460);

        //adding panel for removeProducts
        panel3 = new JPanel();
        panel3.setLayout(null);
        panel3.setBounds(565, 550, 380, 180);

        //adding panel for discountcalculation
        panel4 = new JPanel();
        panel4.setLayout(null);
        panel4.setBounds(1080, 100, 380, 230);

        //adding panel for loyaltypointcalculation
        panel5 = new JPanel();
        panel5.setLayout(null);
        panel5.setBounds(1080, 400, 380, 230);

        //creating Object of JLabel for depatrment
        Heading = new JLabel("Store Management System");
        storeId = new JLabel("Store Id : ");
        storeName = new JLabel("Store Name :");
        storeLocation = new JLabel("storeLocation :");
        totalSales = new JLabel("Total Sales :");
        totalDiscount = new JLabel("Total Discount :");
        productName = new JLabel("Product Name :");
        markedPrice = new JLabel("Marked Price");
        openingHour = new JLabel("Opening Hour :");
        sellingPrice = new JLabel("Selling Price");

        //creating object of JLabel for retailer
        storeId1 = new JLabel("Store Id : ");
        storeName1 = new JLabel("Store Name :");
        storeLocation1 = new JLabel("storeLocation :");
        totalSales1 = new JLabel("Total Sales :");
        totalDiscount1 = new JLabel("Total Discount :");
        vatInclusivePrice = new JLabel("Vat Inclusive Price :");
        purchasedYear = new JLabel("Purchased Year :");
        openingHour1 = new JLabel("Opening Hour :");
        isPaymentOnline = new JLabel("Is Payment Online :");

        //creating object of JLabel for removeProduct
        storeId2 = new JLabel("Store Id : ");

        //creating object of JLabel for discountCalculation
        storeId3 = new JLabel("Store Id : ");
        isInSales = new JLabel("isInSales :");
        markedPrice1 = new JLabel("Marked Price : ");

        //creating object of JLabel for loyaltyPointCalculation
        storeId4 = new JLabel("Store Id : ");
        isPaymentOnline1 = new JLabel("isPaymentOnline :");
        vatInclusivePrice1 = new JLabel("Vat Inclusive Price : ");

        //attributes of JLabel for department
        Heading.setBounds(650, -7, 250, 50);
        storeId.setBounds(80, 80, 250, 50);
        storeName.setBounds(80, 120, 250, 50);
        storeLocation.setBounds(80, 160, 250, 50);
        totalSales.setBounds(80, 200, 250, 50);
        totalDiscount.setBounds(80, 240, 250, 50);
        productName.setBounds(80, 280, 250, 50);
        markedPrice.setBounds(80, 320, 250, 50);
        openingHour.setBounds(80, 360, 250, 50);
        sellingPrice.setBounds(80, 400, 250, 50);

        //attributes of JLabel for retailer
        storeId1.setBounds(600, 80, 250, 50);
        storeName1.setBounds(600, 120, 250, 50);
        storeLocation1.setBounds(600, 160, 250, 50);
        totalSales1.setBounds(600, 200, 250, 50);
        totalDiscount1.setBounds(600, 240, 250, 50);
        vatInclusivePrice.setBounds(600, 280, 250, 50);
        purchasedYear.setBounds(600, 320, 250, 50);
        openingHour1.setBounds(600, 360, 250, 50);
        isPaymentOnline.setBounds(600, 400, 250, 50);

        //attributes of JLabel for removeProducts
        storeId2.setBounds(620, 580, 250, 50);

        //attributes of JLabel for discountCalculation
        storeId3.setBounds(1120, 120, 250, 50);
        isInSales.setBounds(1120, 160, 250, 50);
        markedPrice1.setBounds(1120, 200, 250, 50);

        //attributes of JLabel for loyaltyPointcalculation
        storeId4.setBounds(1120, 420, 250, 50);
        isPaymentOnline1.setBounds(1120, 460, 250, 50);
        vatInclusivePrice1.setBounds(1120, 500, 250, 50);

        //creating object of textfield for department
        storeIdfield = new JTextField();
        storeNamefield = new JTextField();
        storeLocationfield = new JTextField();
        totalSalesfield = new JTextField();
        totalDiscountfield = new JTextField();
        productNamefield = new JTextField();
        markedPricefield = new JTextField();
        openingHourfield = new JTextField();
        sellingPricefield = new JTextField();

        //creating object of textfield for retailer
        storeIdfield1 = new JTextField();
        storeNamefield1 = new JTextField();
        storeLocationfield1 = new JTextField();
        totalSalesfield1 = new JTextField();
        totalDiscountfield1 = new JTextField();
        vatInclusivePricefield = new JTextField();
        openingHourfield1 = new JTextField();

        //creating object of textfield for removeProduct
        storeIdfield2 = new JTextField();

        //creating object of textfield for discountCalculation
        storeIdfield3 = new JTextField();
        markedPricefield1 = new JTextField();

        //creating object of textfield for loyaltypointcalculation
        storeIdfield4 = new JTextField();
        vatInclusivePriceField1 = new JTextField();

        //attributes of textfield for department
        storeIdfield.setBounds(190, 90, 160, 30);
        storeNamefield.setBounds(190, 130, 160, 30);
        storeLocationfield.setBounds(190, 170, 160, 30);
        totalSalesfield.setBounds(190, 210, 160, 30);
        totalDiscountfield.setBounds(190, 250, 160, 30);
        productNamefield.setBounds(190, 290, 160, 30);
        markedPricefield.setBounds(190, 330, 160, 30);
        openingHourfield.setBounds(190, 370, 160, 30);
        sellingPricefield.setBounds(190, 410, 160, 30);

        //attributes of textfield for retailer
        storeIdfield1.setBounds(730, 90, 160, 30);
        storeNamefield1.setBounds(730, 130, 160, 30);
        storeLocationfield1.setBounds(730, 170, 160, 30);
        totalSalesfield1.setBounds(730, 210, 160, 30);
        totalDiscountfield1.setBounds(730, 250, 160, 30);
        vatInclusivePricefield.setBounds(730, 290, 160, 30);
        openingHourfield1.setBounds(730, 370, 160, 30);

        //attributes of textfield for removeProducts
        storeIdfield2.setBounds(710, 590, 160, 30);

        //attributes of textfield for discountCalculation
        storeIdfield3.setBounds(1250, 130, 160, 30);
        markedPricefield1.setBounds(1250, 210, 160, 30);

        //attributes of textfield for loyaltypointcalculation
        storeIdfield4.setBounds(1250, 430, 160, 30);
        vatInclusivePriceField1.setBounds(1250,510,160,30);

        //creating object of combobox for retailer 
        String[] items = {"Year", "2000", "2001", "2002", "2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024"};
        purchaseYear1 = new JComboBox<String>(items);

        //attribute of combobox for retailer
        purchaseYear1.setBounds(730, 330, 160, 30);

        //creating object for Jbutton for department
        addDepartment = new JButton("Add Department");
        display1 = new JButton("Display Details");

        //creating object for JButton for Retailer
        addRetailer = new JButton("Add Retailer");
        display2 = new JButton("Display Details");

        //creating object for JButton for calcaulateDiscount
        calculateDiscountPrice = new JButton("Calculate Discount");

        //creating object for JButton for loyaltypointcaculation
        setLoyaltyPoint = new JButton("Calculate Loyalty Point");

        //creating object for JButton for removeProducts
        removeProduct = new JButton("Remove Product");

        //creating object for JButton to display and clear all
        display = new JButton("Display All");
        clear = new JButton("Clear All");

        //attributes of Jbutton for department
        addDepartment.setBounds(70, 460, 140, 30);
        addDepartment.setBackground(Color.CYAN);
        display1.setBounds(235, 460, 140, 30);
        display1.setBackground(Color.cyan);

        //attributes of JButton for retailer
        addRetailer.setBounds(600, 460, 140, 30);
        addRetailer.setBackground(Color.cyan);
        display2.setBounds(780, 460, 140, 30);
        display2.setBackground(Color.cyan);

        //attributes of JButton for removeProducts
        removeProduct.setBounds(680, 650, 140, 30);
        removeProduct.setBackground(Color.cyan);

        //attributes of JButton for calculateDiscount
        calculateDiscountPrice.setBounds(1200, 270, 150, 30);
        calculateDiscountPrice.setBackground(Color.cyan);

        //attributes of JButton for loyaltyPointcalculation
        setLoyaltyPoint.setBounds(1180, 570, 200, 30);
        setLoyaltyPoint.setBackground(Color.cyan);

        //attribute to display and clear all
        display.setBounds(50, 650, 140, 30);
        display.setBackground(Color.cyan);
        clear.setBounds(220, 650, 140, 30);
        clear.setBackground(Color.cyan);

        //creating object of checkbox for retailer
        yes = new JCheckBox("Yes");
        no = new JCheckBox("No");
        group = new ButtonGroup();
        group.add(yes);
        group.add(no);

        //attributes of checkbox for retailer
        yes.setBounds(730, 410, 50, 30);
        no.setBounds(830, 410, 50, 30);

        //creating object of checkbox for calculateDiscount
        yes1 = new JCheckBox("Yes");
        no1 = new JCheckBox("No");
        group1 = new ButtonGroup();
        group1.add(yes1);
        group1.add(no1);
       

        //attributes of checkbox for calculateDiscount 
        yes1.setBounds(1250, 170, 50, 30);
        no1.setBounds(1340, 170, 50, 30);

        //creating object of checkbox for loyaltypointcalculation
        yes2 = new JCheckBox("Yes");
        no2 = new JCheckBox("No");
        group2 = new ButtonGroup();
        group2.add(yes2);
        group2.add(no2);

        //attributes of checkbox for loyaltypointcalculation
        yes2.setBounds(1250, 470, 50, 30);
        no2.setBounds(1350, 470, 50, 30);

        //changing font style for department
        Heading.setFont(new Font("Arial", Font.BOLD, 17));
        storeId.setFont(new Font("Arial", Font.PLAIN, 13));
        storeName.setFont(new Font("Arial", Font.PLAIN, 13));
        storeLocation.setFont(new Font("Arial", Font.PLAIN, 13));
        totalSales.setFont(new Font("Arial", Font.PLAIN, 13));
        totalDiscount.setFont(new Font("Arial", Font.PLAIN, 13));
        productName.setFont(new Font("Arial", Font.PLAIN, 13));
        markedPrice.setFont(new Font("Arial", Font.PLAIN, 13));
        openingHour.setFont(new Font("Arial", Font.PLAIN, 13));
        addDepartment.setFont(new Font("Arial", Font.PLAIN, 13));
        display1.setFont(new Font("Arial", Font.PLAIN, 13));
        sellingPrice.setFont(new Font("Arial", Font.PLAIN, 13));

        //changing font style for retailer
        storeId1.setFont(new Font("Arial", Font.PLAIN, 13));
        storeName1.setFont(new Font("Arial", Font.PLAIN, 13));
        storeLocation1.setFont(new Font("Arial", Font.PLAIN, 13));
        totalSales1.setFont(new Font("Arial", Font.PLAIN, 13));
        totalDiscount1.setFont(new Font("Arial", Font.PLAIN, 13));
        vatInclusivePrice.setFont(new Font("Arial", Font.PLAIN, 13));
        purchasedYear.setFont(new Font("Arial", Font.PLAIN, 13));
        purchaseYear1.setFont(new Font("Arial", Font.PLAIN, 13));
        openingHour1.setFont(new Font("Arial", Font.PLAIN, 13));
        addRetailer.setFont(new Font("Arial", Font.PLAIN, 13));
        display2.setFont(new Font("Arial", Font.PLAIN, 13));
        isPaymentOnline.setFont(new Font("Arial", Font.PLAIN, 13));
        yes.setFont(new Font("Arial", Font.PLAIN, 13));
        no.setFont(new Font("Arial", Font.PLAIN, 13));

        //changing fonts style for removeproducts
        storeId2.setFont(new Font("Arial", Font.PLAIN, 13));
        removeProduct.setFont(new Font("Arial", Font.PLAIN, 13));

        //changing fonts style for calculateDiscount
        yes1.setFont(new Font("Arial", Font.PLAIN, 13));
        no1.setFont(new Font("Arial", Font.PLAIN, 13));
        storeId3.setFont(new Font("Arial", Font.PLAIN, 13));
        isInSales.setFont(new Font("Arial", Font.PLAIN, 13));
        calculateDiscountPrice.setFont(new Font("Arial", Font.PLAIN, 13));
        markedPrice1.setFont(new Font("Arial", Font.PLAIN, 13));

        //changing font style for setLoyaltyPoint
        yes2.setFont(new Font("Arial", Font.PLAIN, 13));
        no2.setFont(new Font("Arial", Font.PLAIN, 13));
        storeId4.setFont(new Font("Arial", Font.PLAIN, 13));
        setLoyaltyPoint.setFont(new Font("Arial", Font.PLAIN, 13));
        isPaymentOnline1.setFont(new Font("Arial", Font.PLAIN, 13));
        vatInclusivePrice1.setFont(new Font("Arial", Font.PLAIN, 13));

        //changing font style for display and clear button
        display.setFont(new Font("Arial", Font.PLAIN, 15));
        clear.setFont(new Font("Arial", Font.PLAIN, 15));

        //set border for department
        panel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2),
                "Add Department"));

        //set border for retailer
        panel2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2),
                "Add Retailer"));

        //set border for removeProducts
        panel3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2),
                "Remove Product"));

        //set border for calculateDiscount
        panel4.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2),
                "Calculate Discount"));

        //set border for setloyaltypoint
        panel5.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2),
                "Set Loyalty Point"));

        //background color for panel 1
        panel1.setBackground(Color.lightGray);

        //background color for panel 2
        panel2.setBackground(Color.lightGray);

        //background color for panel 3
        panel3.setBackground(Color.lightGray);

        //background color for panel 4
        panel4.setBackground(Color.lightGray);

        //background color for panel 5
        panel5.setBackground(Color.lightGray);

        //background color for combobox for retailer
        yes.setBackground(Color.lightGray);
        no.setBackground(Color.lightGray);

        //backgorund color for combobox for calculateDiscount
        yes1.setBackground(Color.lightGray);
        no1.setBackground(Color.lightGray);

        //background color for combobox for set loyalty point
        yes2.setBackground(Color.lightGray);
        no2.setBackground(Color.lightGray);

        //adding action listener in addDepartment
        addDepartment.addActionListener(e -> {
            addDepartment();
        });
        display1.addActionListener(e->{
            display1();
        });

        //adding actionListener in addRetailer
        addRetailer.addActionListener(e->{
            addRetailer();
        });
        //adding actionListener in display2
        display2.addActionListener(e->{
            display2();
        });
        //adding actionListener in calculateDiscount
        calculateDiscountPrice.addActionListener(e->{
            calculateDiscountPrice();
        });
        //addiing actionListener in setloyaltypoint
        setLoyaltyPoint.addActionListener(e->
        {
            setLoyaltyPoint();
        });
        //adding actionlistener in removeProducts
        removeProduct.addActionListener(e->{
            removeProduct();
        });
        //adding actionListener in main 
        clear.addActionListener(e -> {
            clearAll();
        });

        //adding actionListener in main 
        display.addActionListener(e->{
            display();
        });

        //adding in frame of depatrment
        frame.add(Heading);
        frame.add(storeId);
        frame.add(storeName);
        frame.add(storeLocation);
        frame.add(totalSales);
        frame.add(totalDiscount);
        frame.add(productName);
        frame.add(markedPrice);
        frame.add(openingHour);
        frame.add(sellingPrice);

        frame.add(storeIdfield);
        frame.add(storeNamefield);
        frame.add(storeLocationfield);
        frame.add(totalSalesfield);
        frame.add(totalDiscountfield);
        frame.add(productNamefield);
        frame.add(markedPricefield);
        frame.add(openingHourfield);
        frame.add(sellingPricefield);

        frame.add(addDepartment);
        frame.add(display1);

        frame.add(panel1);

        //adding in frame for retailer
        frame.add(storeId1);
        frame.add(storeName1);
        frame.add(storeLocation1);
        frame.add(totalSales1);
        frame.add(totalDiscount1);
        frame.add(vatInclusivePrice);
        frame.add(purchasedYear);
        frame.add(openingHour1);
        frame.add(isPaymentOnline);

        frame.add(storeIdfield1);
        frame.add(storeNamefield1);
        frame.add(storeLocationfield1);
        frame.add(totalSalesfield1);
        frame.add(totalDiscountfield1);
        frame.add(vatInclusivePricefield);
        frame.add(purchaseYear1);
        frame.add(openingHourfield1);

        frame.add(addRetailer);
        frame.add(display2);

        frame.add(yes);
        frame.add(no);

        frame.add(panel2);

        //adding in frame for removeproducts
        frame.add(storeId2);
        frame.add(isInSales);
        frame.add(removeProduct);

        frame.add(storeIdfield2);

        frame.add(yes1);
        frame.add(no1);

        frame.add(calculateDiscountPrice);

        frame.add(panel3);

        //adding in frame for discountCalculation
        frame.add(storeId3);
        frame.add(markedPrice1);

        frame.add(storeIdfield3);
        frame.add(markedPricefield1);

        frame.add(setLoyaltyPoint);

        frame.add(yes2);
        frame.add(no2);

        frame.add(panel4);

        //adding in frame for loyaltyPointaCalculation
        frame.add(storeId4);
        frame.add(vatInclusivePrice1);

        frame.add(vatInclusivePriceField1);
        frame.add(storeIdfield4);

        frame.add(isPaymentOnline1);

        frame.add(panel5);

        //adding display and clear button for all
        frame.add(display);
        frame.add(clear);

        frame.setVisible(true);

    }

    //main method 
    public static void main(String[] args) {
        StoreGUI obj = new StoreGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clear) {
            clearAll();
        } else if (e.getSource() == addDepartment) {
            addDepartment();
        }
        else if(e.getSource()==display1)
        {
            display1();
        }
        else if (e.getSource() == addRetailer) {
            addRetailer();
        }
        else if(e.getSource()==display2)
        {
            display2();
        }
        else if (e.getSource()==calculateDiscountPrice)
        {
            calculateDiscountPrice();
        }
        else if(e.getSource()==setLoyaltyPoint)
        {
            setLoyaltyPoint();
        }
        else if(e.getSource()==removeProduct)
        {
            removeProduct();
        }
        else if(e.getSource()==display)
        {
            display();
        }
    }

    //method for checking id
    private boolean checkId(int id) {
        //iterating over the list of storeId
        for (Store store : storeList) {
            //checking if the store's Id matches the provided id or not
            if (store.getstoreId() == id) {
                return false;
            }
        }
        return true;
    }
    
    //method to clearall
    private void clearAll() 
    {
        //textfield of department frame
        storeIdfield.setText(" ");
        storeNamefield.setText(" ");
        storeLocationfield.setText(" ");
        totalSalesfield.setText(" ");
        totalDiscountfield.setText(" ");
        productNamefield.setText(" ");
        markedPricefield.setText(" ");
        openingHourfield.setText(" ");
        sellingPricefield.setText(" ");

        //textfield of retailer field
        storeIdfield1.setText(" ");
        storeNamefield1.setText(" ");
        storeLocationfield1.setText(" ");
        openingHourfield1.setText(" ");
        totalSalesfield1.setText(" ");
        totalDiscountfield1.setText(" ");
        vatInclusivePricefield.setText(" ");

        //textfield of removeProduct
        storeIdfield2.setText("");

        //textfield of calculate Discount
        storeIdfield3.setText("");
        markedPricefield1.setText(" ");

        //textfield of set loyalty point
        storeIdfield4.setText("");
        vatInclusivePriceField1.setText(" ");

        //combobox of addRetaier
        purchaseYear1.setSelectedIndex(0);

        group.clearSelection();
        group1.clearSelection();
        group2.clearSelection();


    }

    //method to addDepartment 
    private void addDepartment() 
    {
        try {
                //checking if any field is left empty or not
                if (storeIdfield.getText().isEmpty() || storeNamefield.getText().isEmpty() || storeLocationfield.getText().isEmpty() ||
                totalSalesfield.getText().isEmpty() || totalDiscountfield.getText().isEmpty() || openingHourfield.getText().isEmpty() ||
                productNamefield.getText().isEmpty() || markedPricefield.getText().isEmpty() || sellingPricefield.getText().isEmpty()) {
                        
                JOptionPane.showMessageDialog(null, "Please fill all the fields", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                return;
                }
            //getting the information from textfields
            int storeId = Integer.parseInt(storeIdfield.getText());
            String storeName = storeNamefield.getText();
            String storeLocation = storeLocationfield.getText();
            double totalSales = Double.parseDouble(totalSalesfield.getText());
            double totalDiscount = Double.parseDouble(totalDiscountfield.getText());
            String openingHour = openingHourfield.getText();
            String productName = productNamefield.getText();
            double markedPrice = Double.parseDouble(markedPricefield.getText());
            double sellingPrice = Double.parseDouble(sellingPricefield.getText());

            //checking if id is unique or not 
            if (!checkId(storeId)) {
                JOptionPane.showMessageDialog(null, "Store ID Already Exists", "Invalid Id", JOptionPane.ERROR_MESSAGE);
                return;
            }
            //checking for invalid numerical values
            if (storeId <= 0 || markedPrice <0 || sellingPrice < 0 || totalSales < 0 || totalDiscount< 0 )
            {
                JOptionPane.showMessageDialog(null, "storeId,markedPrice,sellingPrice,totalSales,totalDiscount must be positive numbers", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                return;
            }
            //checking whether marked price is zero or not
            if(markedPrice == 0)
            {
                JOptionPane.showMessageDialog(null, "Marked Price should no be zero or less than zero", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                return;
            }


            //creating object of department
            Department department = new Department(storeId,storeName,storeLocation,openingHour,totalSales,totalDiscount,productName,markedPrice,sellingPrice);
            storeList.add(department);//adding the object to arrayList

            //succcessful message
            JOptionPane.showMessageDialog(null, "Department Id Successfully Added", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
        //handling number format exception
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter valid numerical values", "Invalid Input", JOptionPane.ERROR_MESSAGE);
        }
        //handling illegal argument exception
        catch(IllegalArgumentException e)
        {
            JOptionPane.showMessageDialog(null, "Invalid Input");
        }
        //handling other exception if occur
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "An unexpected error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    //method to add retailer
    private void addRetailer() 
    {
        try
        {
            // Checking  if any text field left empty or not
        if (storeIdfield1.getText().isEmpty() || storeNamefield1.getText().isEmpty() || storeLocationfield1.getText().isEmpty() ||
        openingHourfield1.getText().isEmpty() || totalSalesfield1.getText().isEmpty() || totalDiscountfield1.getText().isEmpty() ||
        vatInclusivePricefield.getText().isEmpty() || purchaseYear1.getSelectedItem() == null) {
        
        JOptionPane.showMessageDialog(null, "Please fill all the fields", "Invalid Input", JOptionPane.ERROR_MESSAGE);
        return;
        }
            //getting the informations from textfield
            int storeId = Integer.parseInt(storeIdfield1.getText());
            String storeName = storeNamefield1.getText();
            String storeLocation = storeLocationfield1.getText();
            String openingHour = openingHourfield1.getText();
            double totalSales = Double.parseDouble(totalSalesfield1.getText());
            double totalDiscount = Double.parseDouble(totalDiscountfield1.getText());
            int vatInclusivePrice = Integer.parseInt(vatInclusivePricefield.getText());
            String purchasedYear = (String) purchaseYear1.getSelectedItem();
        
            Boolean isPaymentOnline = null;

            if(yes.isSelected())
            {
                isPaymentOnline = true;
            }
            else if (no.isSelected())
            {
                isPaymentOnline = false;
            };
            
            // Checking for invalid numerical values
            if (storeId <= 0 || totalSales < 0 || totalDiscount < 0 || vatInclusivePrice < 0) {
            JOptionPane.showMessageDialog(null, "Store ID, total sales, total discount, and VAT inclusive price must be positive numbers", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            return;
            }

            //checking if id is unique or not 
            if (!checkId(storeId)) {
                JOptionPane.showMessageDialog(null, "Store ID already exists", "Invalid Id", JOptionPane.ERROR_MESSAGE);
                return;
            }

            //crating object of retailer
            Retailer retailer = new Retailer(storeId,storeName,storeLocation,openingHour,totalSales,totalDiscount,vatInclusivePrice,isPaymentOnline,purchasedYear);

            //adding the object to arrayList
            storeList.add(retailer);
        
            //successful message if reatilerId id added
            JOptionPane.showMessageDialog(null, "Retailer Id successfully Added", "Success", JOptionPane.INFORMATION_MESSAGE);
        
        }
        //handling number format exception
        catch(NumberFormatException e) 
        {
        JOptionPane.showMessageDialog(null, "Store id, total sales, total Discount, vat inclusive price should be in number", "Invalid_Input!", JOptionPane.ERROR_MESSAGE);
        }
        //handling illegal argument exception
        catch(IllegalArgumentException e)
        {
            JOptionPane.showMessageDialog(null, "Invalid Input");
        }
        //handling any other exception
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "An unexpected error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    //calculate discount price
    public void calculateDiscountPrice() {
        try {
            boolean storeFound = false;
            
            // Getting input from textfields
            int storeId = Integer.parseInt(storeIdfield3.getText());
            double markedPrice = Double.parseDouble(markedPricefield1.getText());

            // Asking the user if they want to calculate the discount price
            int response = JOptionPane.showConfirmDialog(frame, "Do you want to calculate the discount price?", "Confirm",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (response != JOptionPane.YES_OPTION) {
            return;  
            }
            
            // Iterating over list to find the matching store
            for (Store store : storeList) {
                if (store instanceof Department) {
                    Department department = (Department) store;
                    
                    // Assuming Department class has a method to get the store ID
                    if (department.getstoreId() == storeId) {
                        storeFound = true;

                        if (department.getMarkedPrice() != markedPrice) {
                            JOptionPane.showMessageDialog(null,"Marked Price entered in addDepartment does not match","Error",JOptionPane.ERROR_MESSAGE);
                            return;  
                        }

                        Boolean isInSales = null;

                        if (yes1.isSelected()) {
                            isInSales = true;
                        } else if (no1.isSelected()) {
                            isInSales = false;
                        }

                        // Checking conditions
                        if (isInSales != null) {
                            if (isInSales) {
                                department.calculateDiscountPrice(isInSales, markedPrice);
                                JOptionPane.showMessageDialog(frame, "Discount Price calculated: " + department.calculateDiscountAmount(markedPrice));
                            }
                            else {
                                JOptionPane.showMessageDialog(frame, "Discount Price calculated: 0.00");
                            }
                        } else {
                            JOptionPane.showMessageDialog(frame, "Please select the sales status.");
                        }
                        return;
                    }
                }
                else{
                    // Handleling non-department stores (e.g., display a message)
                    JOptionPane.showMessageDialog(frame, "Calculate Discount are not applicable for this store type.");
                }
            }

            if (!storeFound) {
                JOptionPane.showMessageDialog(frame, "Store ID not found.");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Please enter valid numbers in the fields.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "An error occurred: " + e.getMessage());
        }
    }
        
    //calculate loyalty point
    public void setLoyaltyPoint() {
        try {
            boolean storeFound = false;
            //iterating over the storelist
            for (Store store : storeList) {
                if (store instanceof Retailer) {
                    Retailer retailer = (Retailer) store;
                        //getting input from textfields
                        int storeId = Integer.parseInt(storeIdfield4.getText());
                        
    
                        if (storeId == retailer.getstoreId()) {
                            storeFound = true;

                            //asking user to calculate loyalty point or not
                            int response = JOptionPane.showConfirmDialog(frame, "Do you want to calculate the loyalty points?", "Confirm",
                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                            if (response != JOptionPane.YES_OPTION) {
                            return;
                            }

                            int vatInclusivePrice = Integer.parseInt(vatInclusivePriceField1.getText());
                            if(retailer.getVatInclusivePrice() != vatInclusivePrice)
                            {
                                JOptionPane.showMessageDialog(frame, "Vat Inclusive Price does not match which is entered in addRetailer");
                                return;
                            }
                            Boolean isPaymentOnline = null;
    
                            if (yes2.isSelected()) {
                                isPaymentOnline = true;
                            } else if (no2.isSelected()) {
                                isPaymentOnline = false;
                            }
                            //checking conditions
                            if (isPaymentOnline != null) {
                                if (isPaymentOnline) {
                                    retailer.setLoyaltyPoint(isPaymentOnline,vatInclusivePrice);
                                    JOptionPane.showMessageDialog(null, "Loyalty points: " + retailer.getLoyaltyPoint());
                                } else {
                                    JOptionPane.showMessageDialog(frame, "Please complete the payment to earn loyalty points.");
                                }
                            } else {
                                JOptionPane.showMessageDialog(frame, "Please select the payment method.");
                            }
                             // Exiting after successful loyalty point calculation
                            return;
                        }
                } 
                else {
                    // Handleling non-retailer stores (e.g., display a message)
                    JOptionPane.showMessageDialog(frame, "Loyalty points are not applicable for this store type.");
                }
            }
    
            if (!storeFound) {
                JOptionPane.showMessageDialog(frame, "Store ID not found.");
            }
        //catching the exceptions if occured
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "An error occurred: " + e.getMessage());
        }
    }

    //Removing Products
    public void removeProduct() {
        try {
            // Getting the store ID from the text field
            int storeId = Integer.parseInt(storeIdfield2.getText());
            boolean productRemoved = false;
    
            // Iterating over the store list
            for (Store store : storeList) {
                // Checking if the store is a Retailer or not
                if (store instanceof Retailer) {
                    Retailer retailer = (Retailer) store;
    
                    // Comparing store ID
                    if (retailer.getstoreId() == storeId) {
                        // Confirming product removal
                        int response = JOptionPane.showConfirmDialog(null,
                                "Are you sure you want to remove the product from " + retailer.getstoreName() + "?",
                                "Confirm Product Removal",
                                JOptionPane.YES_NO_OPTION,
                                JOptionPane.WARNING_MESSAGE);
    
                        // If the user confirms the removal
                        if (response == JOptionPane.YES_OPTION) {
                            retailer.removeProduct();
                            if (retailer.getRemoveProduct()) {
                                JOptionPane.showMessageDialog(null, "Product removed: " + retailer.getstoreName());
                            } else {
                                JOptionPane.showMessageDialog(null, "Product was not removed: " + retailer.getstoreName());
                            }
                        } else {
                            // If the user cancels the removal
                            JOptionPane.showMessageDialog(null, "Product removal canceled.");
                        }
                        break;
                    }
                }
            }
        } catch (NumberFormatException e) {
            // Handling invalid input in the store ID field
            JOptionPane.showMessageDialog(null, "Invalid input", "Input Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            // Handling any other exceptions
            JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    


    //method to display departments details only
    private void display1() {
        String details = "";
        
        for (Store store : storeList) {
            if (store instanceof Department) {
                Department department = (Department) store;
                details += "Store Id: " + department.getstoreId() + "\n";
                details += "Store Name: " + department.getstoreName() + "\n";
                details += "Store Location: " + department.getlocation() + "\n";
                details += "Opening Hour: " + department.getOpeningHour() + "\n";
                details += "Total Sales: " + department.getTotalSales() + "\n";
                details += "Total Discount: " + department.getTotalDiscount() + "\n";
                details += "Product Name: " + department.getProductName() + "\n";
                details += "Marked Price: " + department.getMarkedPrice() + "\n";
                details += "Selling Price: " + department.getSellingPrice() + "\n";
                details += "========================================================\n";
            }
        }
        if (details.isEmpty()) {
            // Displaying message if no department details are found
            details = "No department details available.";
        }
        
        // Printing  to the terminal
        System.out.println(details);
        
        // Displaying in JOptionPane
        JOptionPane.showMessageDialog(null, details, "Store Details", JOptionPane.INFORMATION_MESSAGE);
    }

    //method to display retailers details only
    private void display2() {
        String details = "";
    
        for (Store store : storeList) {
            if (store instanceof Retailer) {
                Retailer retailer = (Retailer) store;
                details += "Store Id: " + retailer.getstoreId() + "\n";
                details += "Store Name: " + retailer.getstoreName() + "\n";
                details += "Store Location: " + retailer.getlocation() + "\n";
                details += "Opening Hour: " + retailer.getOpeningHour() + "\n";
                details += "Total Sales: " + retailer.getTotalSales() + "\n";
                details += "Total Discount: " + retailer.getTotalDiscount() + "\n";
                details += "VAT Inclusive Price: " + retailer.getVatInclusivePrice() + "\n";
                details += "Purchased Year: " + retailer.getPurchasedYear() + "\n";
                details += "Is Payment Online: " + retailer.getIsPaymentOnline() + "\n";
                details += "Loyalty Points: " + retailer.getLoyaltyPoint() + "\n";
                details += "========================================================\n";
            }

        }
        if (details.isEmpty()) {
            // Displaying message if no department details are found
            details = "No Retailer items available.";
        }
    
        // Printing to the terminal
        System.out.println(details);
    
        // Displaying in JOptionPane
        JOptionPane.showMessageDialog(null, details, "Retailer Details", JOptionPane.INFORMATION_MESSAGE);
    }

 
    // Displaying all stores (Department and Retailer) details
    private void display() {
        String details = "";
        
        for (Store store : storeList) {
            if (store instanceof Department) {
                Department department = (Department) store;
                details += "Store Id: " + department.getstoreId() + "\n";
                details += "Store Name: " + department.getstoreName() + "\n";
                details += "Store Location: " + department.getlocation() + "\n";
                details += "Opening Hour: " + department.getOpeningHour() + "\n";
                details += "Total Sales: " + department.getTotalSales() + "\n";
                details += "Total Discount: " + department.getTotalDiscount() + "\n";
                details += "Product Name: " + department.getProductName() + "\n";
                details += "Marked Price: " + department.getMarkedPrice() + "\n";
                details += "Selling Price: " + department.getSellingPrice() + "\n";
                details += "============================================================\n";
            } else if (store instanceof Retailer) {
                Retailer retailer = (Retailer) store;
                details += "Store Id: " + retailer.getstoreId() + "\n";
                details += "Store Name: " + retailer.getstoreName() + "\n";
                details += "Store Location: " + retailer.getlocation() + "\n";
                details += "Opening Hour: " + retailer.getOpeningHour() + "\n";
                details += "Total Sales: " + retailer.getTotalSales() + "\n";
                details += "Total Discount: " + retailer.getTotalDiscount() + "\n";
                details += "VAT Inclusive Price: " + retailer.getVatInclusivePrice() + "\n";
                details += "Purchased Year: " + retailer.getPurchasedYear() + "\n";
                details += "Is Payment Online: " + retailer.getIsPaymentOnline() + "\n";
                details += "Loyalty Points: " + retailer.getLoyaltyPoint() + "\n";
                details += "========================================================\n";
            }
        }
        
        if (details.isEmpty()) {
            // Displaying message if no store details are found
            details = "No store details available.";
        }
        
        // Printing to the terminal
        System.out.println(details);
        
        // Displaying in JOptionPane
        JOptionPane.showMessageDialog(null, details, "All Store Details", JOptionPane.INFORMATION_MESSAGE);
    }

}




    
