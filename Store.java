public class Store
{
    //attributes of class Store
    private int storeId;
    private String storeName;
    private String location;
    private String openingHour;
    private double totalSales;
    private double totalDiscount;
    
    //creating  constructor with parameters
    public Store(int storeId, String storeName, String location, String openingHour)
    {
        //this.totalsale is used to call variable from class Store to constructor(Store)
        this.totalSales=0.00; 
        this.totalDiscount=0.00;
            
        this.storeId   = storeId;
        this.storeName = storeName;
        this.location  = location;
        this.openingHour = openingHour;
        
    }
    
    //creating corresponding accessor method(Get Method) to return value of each attributes.
    //getter method of storeid
    public int getstoreId()
    {
        return storeId;
    }
    //getter method of storename
    public String getstoreName()
    {
        return storeName;
    }
    //getter method of location
    public String getlocation()
    {
        return location;
    }
    //getter method of openinghours
    public String getOpeningHour()
    {
        return openingHour;
    }
    //getter method of totalsales
    public double getTotalSales()
    {
        return totalSales;
    }
    //getter method of total discount
    public double getTotalDiscount()
    {
        return totalDiscount;
    }
    
    //setter method to set the value or update the value.
    //setter method of totalSales
     public void settotalSale(double newTotalSale ){
        this.totalSales += newTotalSale; 
    }
    //setter method of totalDiscount
    public void settotalDiscount(double newTotalDiscount){
        this.totalDiscount += newTotalDiscount;
    }
    
    //printing out the information of store 
    public void display()
    {
        System.out.println("The ID of Store is " + storeId + ".");
        System.out.println("The Name of the Store is " + storeName +".");
        System.out.println("The Store is located at  " + location +".");
        System.out.println("The Store Opens and closes at  " + openingHour+ " respectively.");
        //System.out.println("The Total Sales of products are "+  totalSales);
        //System.out.println("The Discounted amount is " + totalDiscount + ".");
        
        if(totalSales==0 && totalDiscount==0)
        {
            System.out.println("If total sale is zero then total discount is also zero.");
            
        }else
        {
            System.out.println("The Total Sales of products are "+  totalSales);
            System.out.println("The Discounted amount is " + totalDiscount + ".");
        }
        

    }
}