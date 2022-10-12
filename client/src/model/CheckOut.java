package model;

public class CheckOut {

    int invoiceNum;
    Date billingDate;
    String item;
    int quantityOfItem;
    String cashier;
    String customer;
    float discountRate;

    public CheckOut(){
        this.invoiceNum = -1;
        this.billingDate = new Date();
        this.item = "''";
        this.quantityOfItem = 0;
        this.cashier = "''";
        this.customer = "''";
   
    }

    public CheckOut(int invoiceNum, Date billingDate, String item, int quantityOfItem, String cashier, String customer, float discountRate) {
        this.invoiceNum = invoiceNum;
        this.billingDate = billingDate;
        this.item = item;
        this.quantityOfItem = quantityOfItem;
        this.cashier = cashier;
        this.customer = customer;
        this.discountRate = discountRate;
    }

    public int getInvoiceNum( ) {
        return invoiceNum;
    }

    public void setInvoiceNum(int invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    public Date getBillingDate( ) {
        return billingDate;
    }

    public void setBillingDate(Date billingDate) {
        this.billingDate = billingDate;
    }

    public String getItem( ) {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantityOfItem( ) {
        return quantityOfItem;
    }

    public void setQuantityOfItem(int quantityOfItem) {
        this.quantityOfItem = quantityOfItem;
    }

    public String getCashier( ) {
        return cashier;
    }

    public void setCashier(String cashier) {
        this.cashier = cashier;
    }

    public String getCustomer( ) {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public float getDiscountRate( ) {
        return discountRate;
    }

    public void setDiscountRate(float discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public String toString( ) {
        return "CheckOut{" +
                "invoiceNum=" + invoiceNum +
                ", billingDate=" + billingDate +
                ", item='" + item + '\'' +
                ", quantityOfItem=" + quantityOfItem +
                ", cashier='" + cashier + '\'' +
                ", customer='" + customer + '\'' +
                ", discountRate=" + discountRate +
                '}';
    }
}
