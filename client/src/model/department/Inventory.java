package model.department;

public class Inventory extends Department{

    String productCode;
    String name;
    String shortDescription;
    String longDescription;
    int itemsInStock;
    float unitPrice;

    public Inventory( ) {
        super();
        departmentCode = "Inv003";
        name = "Inventory";
    }

    public String getShortDescription( ) {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription( ) {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public int getItemsInStock( ) {
        return itemsInStock;
    }

    public void setItemsInStock(int itemsInStock) {
        this.itemsInStock = itemsInStock;
    }

    public float getUnitPrice( ) {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString( ) {
        return "Inventory{" +
                "productCode='" + productCode + '\'' +
                ", name='" + name + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                ", longDescription='" + longDescription + '\'' +
                ", itemsInStock=" + itemsInStock +
                ", unitPrice=" + unitPrice +
                "} ";
    }
}
