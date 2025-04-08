class Retailer extends Store//retailer class extends from store class
 {
     //attributes of retailer class
    private int vatInclusivePrice;
    private int loyaltyPoint;
    private boolean isPaymentOnline;
    private String purchasedYear;
    private boolean removeProduct;
    
    //construtor for retailer
    public Retailer(int storeId,String storeName,String storeLocation,String openingHour,double totalSales,double totalDiscount, int vatInclusivePrice,boolean isPaymentOnline,String purchasedYear)
    {
    super(storeId,storeName,storeLocation,openingHour);//calling superclass constructor with four parameters
    settotalDiscount(totalDiscount);
    settotalSale(totalSales);
    
    this.vatInclusivePrice = vatInclusivePrice;
    this.isPaymentOnline = isPaymentOnline;
    this.purchasedYear = purchasedYear;
    loyaltyPoint = 0;
    
    
    }
    
    //creating corresponding accessor method(Get Method) to return value of each attributes.
    //getter method of vatinclusiveprice
    public int getVatInclusivePrice()
    {
        return vatInclusivePrice;
    }
    //getter method of ispaymentonline
    public boolean getIsPaymentOnline()
    {
        return isPaymentOnline;
    }
    //getter method of purchasedyear
    public String getPurchasedYear()
    {
        return purchasedYear;
    }
    public boolean getRemoveProduct()
    {
        return removeProduct;
    }
    //getter method of loyaltyPoint
    public int getLoyaltyPoint()
    {
        return loyaltyPoint;
    }
    //creating mutator or setter method for vatinclusiveprice
    public void  setVatInclusivePrice( int vatInclusivePrice){
        this.vatInclusivePrice = vatInclusivePrice;
        
    }
    //creating mutator or setter method for ispaymentonline
    public void  setisPaymentOnline(boolean isPaymentOnline){
        this.isPaymentOnline = isPaymentOnline;
        
    }
    //method to calculate loyalitypoint
    public void setLoyaltyPoint( boolean isPaymetnOnline, int vatInclusivePrice){
        if(isPaymentOnline= true){
            this.loyaltyPoint = ( vatInclusivePrice)/100;
        }
    }
    //method to remove a product
    public void removeProduct(){
        if(loyaltyPoint == 0 && (purchasedYear.equals("2020") || purchasedYear.equals("2021") || purchasedYear.equals("2022")))
        {
            removeProduct = true;
            vatInclusivePrice = 0;
            isPaymentOnline = false;
            loyaltyPoint = 0;
        }
            
    }
    //method to display retailer details
    @Override
    public void display(){
        super.display();//calling the super class display method
        if(removeProduct){
        System.out.println("product has been removed");
        }
        else
        {
        System.out.println("vaticlusive price is " + vatInclusivePrice);
        System.out.println("Loyalty point is " + loyaltyPoint);
        System.out.println("isPaymentOnline" + isPaymentOnline);
        System.out.println("The purchased year is  " + purchasedYear);
           
        }
        
    }
}