class Department extends Store//department class inherits from store class
{
    //attributes of class department
    private String productName;
    private double markedPrice;
    private double sellingPrice;
    private boolean isInSales;
    
    //creating a constructor with eight parameters.
    public Department(int storeId, String storeName, String storeLocation, String openingHour,double totalSales,double totalDiscount, String productName, double markedPrice, double sellingPrice)
    {
       super(storeId, storeName, storeLocation, openingHour);//calling superclass constructor with four parameters 
       //assigning attributes with corresponding parametere values
       this.productName = productName;
       this.markedPrice = markedPrice;
       this.isInSales = true;
       this.sellingPrice = sellingPrice;
       super.settotalSale(totalSales); 
       super.settotalDiscount(totalDiscount); 
          
    }
    //creating corresponding accessor method(Get Method) to return value of each attributes.
    //getter method of productname
    public String getProductName()
    {
        return productName;
    }
    //getter method of markedprice
    public double getMarkedPrice()
    {
        return markedPrice;
    }
    //getter method of sellingprice
    public double getSellingPrice()
    {
        return sellingPrice;
    }
    //getter method of isinsales
    public boolean getIsInSales()
    {
        return isInSales;
    }
    //creating mutator or setter method for marked price
    public void setMarkedPrice(double markedPrice)
    {
        this.markedPrice = markedPrice;
    }

    public double calculateDiscountAmount(double markedPrice) {
        double discountPercent = 0.0;

        if (markedPrice >= 5000) {
            discountPercent = 0.20;
        } else if (markedPrice >= 3000) {
            discountPercent = 0.10;
        } else if (markedPrice >= 1000) {
            discountPercent = 0.05;
        }

        return markedPrice * discountPercent; // Return only the discount amount
    }
    
    //method to calculate selling price of product after discount
    public void calculateDiscountPrice(boolean isInSales,double markedPrice){
        if(isInSales = true)
        {
            double discountAmount = calculateDiscountAmount(markedPrice);
            this.sellingPrice = sellingPrice + (markedPrice - discountAmount);
            super.settotalDiscount(discountAmount);
            super.settotalSale(sellingPrice);
            this.isInSales = false;
        } else {
            System.out.println("Product is not available for sale");
        }
            
        
    }
    //method to display department details
    @Override
    public void display(){
        super.display();//calling the superclass display method
        
        if(isInSales = true){
            System.out.println("The product name is " + productName);
            System.out.println("The marked price of the product is " + markedPrice);
        }else{
            System.out.println("The product name is " + productName);
            System.out.println("The selling  price is " + sellingPrice);
            
        }
    
    }
}