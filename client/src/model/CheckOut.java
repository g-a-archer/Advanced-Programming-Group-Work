package model;

public class CheckOut {

    int invoiceNum;
    Date billingDate;
    String item;
    int quantityOfItem;
    String cashier;
    String customer;

    public CheckOut(){
        this.invoiceNum = -1;
        this.billingDate = new Date();
        this.item = item;
        this.quantityOfItem = quantityOfItem;
        this.cashier = cashier;
        this.customer = customer;

    }

    public CheckOut(int invoiceNum, Date billingDate, String item, int quantityOfItem, String cashier, String customer) {
        this.invoiceNum = invoiceNum;
        this.billingDate = billingDate;
        this.item = item;
        this.quantityOfItem = quantityOfItem;
        this.cashier = cashier;
        this.customer = customer;
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

    @Override
    public String toString( ) {
        return "CheckOut{" +
                "invoiceNum=" + invoiceNum +
                ", billingDate=" + billingDate +
                ", item='" + item + '\'' +
                ", quantityOfItem=" + quantityOfItem +
                ", cashier='" + cashier + '\'' +
                ", customer='" + customer + '\'' +
                '}';
    }
}
