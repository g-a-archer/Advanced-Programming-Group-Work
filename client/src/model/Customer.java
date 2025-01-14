package model;

public class Customer {
    String customerId;
    String name;
    Date dob;
    String address;
    String telephone;
    String email;
    Date dom; // Date of Membership
    Date domExpiry;

    boolean membershipStatus;

    public Customer(){
        this.customerId = "''";
        this.name = "''";
        this.dob = new Date();
        this.address = "''";
        this.telephone = "''";
        this.email = "''";
        this.dom =  new Date();
        this.domExpiry = dom;
        domExpiry.calculateExpiryDate();
        membershipStatus = checkMembershipStatus();
    }

    public Customer(String customerId, String name, Date dob, String address,
                    String telephone, String email, Date dom, Date domExpiry) {
        this.customerId = customerId;
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.telephone = telephone;
        this.email = email;
        this.dom = dom;
        this.domExpiry = domExpiry;
    }

    public boolean checkMembershipStatus(){
        return dom.year < domExpiry.expYear;
    }

    public String getCustomerId( ) {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName( ) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob( ) {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress( ) {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone( ) {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail( ) {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDom( ) {
        return dom;
    }

    public void setDom(Date dom) {
        this.dom = dom;
    }

    public void calculateExpiryDate(){
       this.domExpiry.calculateExpiryDate();
    }

    public Date getDomExpiry( ) {
        return domExpiry;
    }

    public void setDomExpiry(Date domExpiry) {
        this.domExpiry = domExpiry;
    }

    @Override
    public String toString( ) {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", address='" + address + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", dom=" + dom +
                ", domExpiry=" + domExpiry +
                '}';
    }
}
