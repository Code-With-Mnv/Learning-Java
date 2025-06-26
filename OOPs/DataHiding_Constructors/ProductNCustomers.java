package OOPs.DataHiding_Constructors;

class Product{
    private String itemNo;
    private String name;
    private double price;
    private short qty;

    public Product (String itemNum, String itemName, double itemPrice, short itemQty){
        itemNo = itemNum;
        name = itemName;
        price = itemPrice;
        qty = itemQty;
    }

    public String getItemNo(){
        return itemNo;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public short getQty(){
        return qty;
    }

    public void setQty(short quantity){
        qty = quantity;
    }

    public void setPrice(double mrp){
        price = mrp;
    }
}

class Customer{
    private String custId;
    private String name;
    private String address;
    private String phno;

    public Customer(String customerId, String customerName, String customerAddress, String customerPhNo){
        custId = customerId;
        name = customerName;
        address = customerAddress;
        phno = customerPhNo;
    }

    public void setAddress(String customerAddress) {
        address = customerAddress;
    }

    public void setPhno(String customerPhno) {
        phno = customerPhno;
    }

    public String getAddress() {
        return address;
    }

    public String getCustId() {
        return custId;
    }

    public String getName() {
        return name;
    }

    public String getPhno() {
        return phno;
    }
}

public class ProductNCustomers {
    public static void main(String[] args){
        Product product = new Product("CC-IND-078","Coca-Cola", 35.50, (short) 200);
        System.out.println(product.getItemNo());
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println(product.getQty());

        Customer customer = new Customer("MS-ANNG-MUM", "Manav Sonawane", "25/Sindhu, Anushakti Nagar, Mumbai", "+91 99205 83987");
        System.out.println(customer.getCustId());
        System.out.println(customer.getName());
        System.out.println(customer.getPhno());
        System.out.println(customer.getAddress());
    }
}
